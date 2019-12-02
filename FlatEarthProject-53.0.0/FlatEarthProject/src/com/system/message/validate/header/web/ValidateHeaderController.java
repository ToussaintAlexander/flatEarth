package com.system.message.validate.header.web;

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

import com.system.message.validate.header.dao.ValidateHeaderDaoImpl;
import com.system.message.validate.header.model.ValidateHeaderBean;

@Controller
public class ValidateHeaderController {
	
	 private static final Log log = LogFactory.getLog(ValidateHeaderController.class);
	
    @Autowired
	ValidateHeaderDaoImpl validateHeaderDao; 
    

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/validateHeaderScreen")
	public ModelAndView validateHeaderScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from validateHeaderScreen " + now);
		List<ValidateHeaderBean> list=validateHeaderDao.select();
		ModelAndView model = new ModelAndView("system/message/validateHeader/viewValidateHeader");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/validateHeaderScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView validateHeaderScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from validateHeaderScreen " + now);
		return new ModelAndView("redirect:/validateHeaderScreen");
		
	}
    
	@RequestMapping("/validateHeaderForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from validateHeaderForm " + now);
		return new ModelAndView("system/message/validateHeader/validateHeaderForm","command",new ValidateHeaderBean());
	}
	
	@RequestMapping(value="/validateHeaderFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("validateHeader") ValidateHeaderBean validateHeader){
		String now = (new Date()).toString();
		log.info("Logging return from validateHeaderForm " + now);
		validateHeaderDao.insert(validateHeader);
		return new ModelAndView("redirect:/viewValidateHeader"); 
	}
	
	@RequestMapping("/viewValidateHeader")
	public ModelAndView viewValidateHeader(){
		String now = (new Date()).toString();
		log.info("Logging return from viewValidateHeader " + now);
		List<ValidateHeaderBean> list=validateHeaderDao.select();
		ModelAndView model = new ModelAndView("system/message/validateHeader/viewValidateHeader");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateValidateHeaderJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateValidateHeader " + now);
		ValidateHeaderBean validateHeader=validateHeaderDao.selectValidateHeaderById(id);
		//return new ModelAndView("system/message/validateHeader/validateHeaderEditForm","command",validateHeader);
		ModelAndView model = new ModelAndView("system/message/validateHeader/validateHeaderEditForm","command",validateHeader);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/validateHeaderEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("validateHeader") ValidateHeaderBean validateHeader){
		String now = (new Date()).toString();
		log.info("Logging return from validateHeaderEditForm " + now);
		validateHeaderDao.update(validateHeader);
		return new ModelAndView("redirect:/viewValidateHeader");
	}
	 
	@RequestMapping(value="/deleteValidateHeaderJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteValidateHeader " + now);
		validateHeaderDao.delete(id);
		return new ModelAndView("redirect:/viewValidateHeader");
	}

}