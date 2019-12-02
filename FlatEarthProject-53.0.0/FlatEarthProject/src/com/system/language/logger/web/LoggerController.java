package com.system.language.logger.web;

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

import com.system.language.logger.dao.LoggerDaoImpl;
import com.system.language.logger.model.LoggerBean;

@Controller
public class LoggerController {
	
	 private static final Log log = LogFactory.getLog(LoggerController.class);
	
    @Autowired
	LoggerDaoImpl loggerDao; 
    
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/loggerScreen")
	public ModelAndView loggerScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from loggerScreen " + now);
		List<LoggerBean> list=loggerDao.select();
		ModelAndView model = new ModelAndView("system/language/logger/viewLogger");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/loggerScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView loggerScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from loggerScreen " + now);
		return new ModelAndView("redirect:/loggerScreen");
		
	}
    
	@RequestMapping("/loggerForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from loggerForm " + now);
		return new ModelAndView("system/language/logger/loggerForm","command",new LoggerBean());
	}
	
	@RequestMapping(value="/loggerFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("logger") LoggerBean logger){
		String now = (new Date()).toString();
		log.info("Logging return from loggerForm " + now);
		loggerDao.insert(logger);
		return new ModelAndView("redirect:/viewLogger"); 
	}
	
	@RequestMapping("/viewLogger")
	public ModelAndView viewLogger(){
		String now = (new Date()).toString();
		log.info("Logging return from viewLogger " + now);
		List<LoggerBean> list=loggerDao.select();
		ModelAndView model = new ModelAndView("system/language/logger/viewLogger");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateLoggerJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateLogger " + now);
		LoggerBean logger=loggerDao.selectLoggerById(id);
		//return new ModelAndView("system/language/logger/loggerEditForm","command",logger);
		ModelAndView model = new ModelAndView("system/language/logger/loggerEditForm","command",logger);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/loggerEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("logger") LoggerBean logger){
		String now = (new Date()).toString();
		log.info("Logging return from loggerEditForm " + now);
		loggerDao.update(logger);
		return new ModelAndView("redirect:/viewLogger");
	}
	 
	@RequestMapping(value="/deleteLoggerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteLogger " + now);
		loggerDao.delete(id);
		return new ModelAndView("redirect:/viewLogger");
	}

}