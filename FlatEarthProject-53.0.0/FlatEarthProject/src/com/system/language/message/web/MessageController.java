package com.system.language.message.web;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.language.message.dao.MessageDaoImpl;
import com.system.language.message.model.MessageBean;

@Controller
public class MessageController {
	
	 private static final Log log = LogFactory.getLog(MessageController.class);
	
    @Autowired
	MessageDaoImpl messageDao; 
    

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/messageScreen")
	public ModelAndView messageScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from messageScreen " + now);
		List<MessageBean> list=messageDao.select();
		ModelAndView model = new ModelAndView("system/language/message/viewMessage");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/messageScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView messageScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from messageScreen " + now);
		return new ModelAndView("redirect:/messageScreen");
		
	}
    
	@RequestMapping("/messageForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from messageForm " + now);
		return new ModelAndView("system/language/message/messageForm","command",new MessageBean());
	}
	
	@RequestMapping(value="/messageFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("message") MessageBean message){
		String now = (new Date()).toString();
		log.info("Logging return from messageForm " + now);
		messageDao.insert(message);
		return new ModelAndView("redirect:/viewMessage"); 
	}
	
	@RequestMapping("/viewMessage")
	public ModelAndView viewMessage(){
		String now = (new Date()).toString();
		log.info("Logging return from viewMessage " + now);
		List<MessageBean> list=messageDao.select();
		ModelAndView model = new ModelAndView("system/language/message/viewMessage");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateMessageJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateMessage " + now);
		MessageBean message=messageDao.selectMessageById(id);
		//return new ModelAndView("system/language/message/messageEditForm","command",message);
		ModelAndView model = new ModelAndView("system/language/message/messageEditForm","command",message);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/messageEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("message") MessageBean message){
		String now = (new Date()).toString();
		log.info("Logging return from messageEditForm " + now);
		messageDao.update(message);
		return new ModelAndView("redirect:/viewMessage");
	}
	 
	@RequestMapping(value="/deleteMessageJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteMessage " + now);
		messageDao.delete(id);
		return new ModelAndView("redirect:/viewMessage");
	}

}