package com.system.message.element.web;

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

import com.system.message.element.dao.ElementDaoImpl;
import com.system.message.element.model.ElementBean;

@Controller
public class ElementController {
	
	 private static final Log log = LogFactory.getLog(ElementController.class);
	
    @Autowired
	ElementDaoImpl elementDao; 
    

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/elementScreen")
	public ModelAndView elementScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from elementScreen " + now);
		List<ElementBean> list=elementDao.select();
		ModelAndView model = new ModelAndView("system/message/element/viewElement");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/elementScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView elementScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from elementScreen " + now);
		return new ModelAndView("redirect:/elementScreen");
		
	}
    
	@RequestMapping("/elementForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from elementForm " + now);
		return new ModelAndView("system/message/element/elementForm","command",new ElementBean());
	}
	
	@RequestMapping(value="/elementFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("element") ElementBean element){
		String now = (new Date()).toString();
		log.info("Logging return from elementForm " + now);
		elementDao.insert(element);
		return new ModelAndView("redirect:/viewElement"); 
	}
	
	@RequestMapping("/viewElement")
	public ModelAndView viewElement(){
		String now = (new Date()).toString();
		log.info("Logging return from viewElement " + now);
		List<ElementBean> list=elementDao.select();
		ModelAndView model = new ModelAndView("system/message/element/viewElement");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateElementJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateElement " + now);
		ElementBean element=elementDao.selectElementById(id);
		ModelAndView model = new ModelAndView("system/message/element/elementEditForm","command",element);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/elementEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("element") ElementBean element){
		String now = (new Date()).toString();
		log.info("Logging return from elementEditForm " + now);
		elementDao.update(element);
		return new ModelAndView("redirect:/viewElement");
	}
	 
	@RequestMapping(value="/deleteElementJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteElement " + now);
		elementDao.delete(id);
		return new ModelAndView("redirect:/viewElement");
	}

}