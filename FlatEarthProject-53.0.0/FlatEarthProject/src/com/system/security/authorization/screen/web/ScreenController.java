package com.system.security.authorization.screen.web;

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

import com.system.security.authorization.screen.dao.ScreenDaoImpl;
import com.system.security.authorization.screen.model.ScreenBean;

@Controller
public class ScreenController {
	
	 private static final Log log = LogFactory.getLog(ScreenController.class);
	
    @Autowired
	ScreenDaoImpl screenDao; 
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/screenScreen")
	public ModelAndView screenScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from screenScreen " + now);
		List<ScreenBean> list=screenDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/screen/viewScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/screenScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView screenScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from screenScreen " + now);
		return new ModelAndView("redirect:/screenScreen");
		
	}
    
	@RequestMapping("/screenForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from screenForm " + now);
		return new ModelAndView("system/security/authorization/screen/screenForm","command",new ScreenBean());
	}
	
	@RequestMapping(value="/screenFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("screen") ScreenBean screen){
		String now = (new Date()).toString();
		log.info("Logging return from screenForm " + now);
		screenDao.insert(screen);
		return new ModelAndView("redirect:/viewScreen"); 
	}
	
	@RequestMapping("/viewScreen")
	public ModelAndView viewScreen(){
		String now = (new Date()).toString();
		log.info("Logging return from viewScreen " + now);
		List<ScreenBean> list=screenDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/screen/viewScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateScreenJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateScreen " + now);
		ScreenBean screen=screenDao.selectScreenById(id);
		//return new ModelAndView("system/security/authorization/screen/screenEditForm","command",screen);
		ModelAndView model = new ModelAndView("system/security/authorization/screen/screenEditForm","command",screen);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/screenEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("screen") ScreenBean screen){
		String now = (new Date()).toString();
		log.info("Logging return from screenEditForm " + now);
		screenDao.update(screen);
		return new ModelAndView("redirect:/viewScreen");
	}
	 
	@RequestMapping(value="/deleteScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteScreen " + now);
		screenDao.delete(id);
		return new ModelAndView("redirect:/viewScreen");
	}

}