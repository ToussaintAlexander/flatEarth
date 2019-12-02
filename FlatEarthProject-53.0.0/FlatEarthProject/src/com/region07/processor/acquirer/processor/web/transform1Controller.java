package com.region07.processor.acquirer.processor.web;

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

import com.region07.processor.acquirer.processor.dao.Transform1DaoImpl;
import com.region07.processor.acquirer.processor.model.transform1Bean;

@Controller
public class transform1Controller {
	
	 private static final Log log = LogFactory.getLog(transform1Controller.class);
	
    @Autowired
    Transform1DaoImpl	transform1Dao;
    
    
	@RequestMapping("/viewTransform1")
	public ModelAndView viewTransform1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTransform1 " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("region07/processor/acquirer/processor/viewTransform1");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewTransform1JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewTransform2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTransform1 " + now);
		return new ModelAndView("redirect:/viewTransform1");
	}
    
	@RequestMapping("/transform1Form")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from transform1Form " + now);
		return new ModelAndView("region07/processor/acquirer/processor/transform1Form","command",new transform1Bean());
	}
	
	@RequestMapping(value="/transform1FormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("processor") transform1Bean processor){
		String now = (new Date()).toString();
		log.info("Logging return from transform1Form " + now);
		transform1Dao.insert(processor);
		return new ModelAndView("redirect:/viewTransform1"); 
	}

	@RequestMapping(value="/updateTransform1JSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTransform1 " + now);
		transform1Bean transform1=transform1Dao.selectTransform1ById(id);
		ModelAndView model = new ModelAndView("region07/processor/acquirer/processor/transform1EditForm","command",transform1);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/transform1EditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("transform1") transform1Bean transform1){
		String now = (new Date()).toString();
		log.info("Logging return from transform1EditForm " + now);
		transform1Dao.update(transform1);
		return new ModelAndView("redirect:/viewTransform1");
	}
	 
	@RequestMapping(value="/deleteTransform1JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deletTransform1 " + now);
		transform1Dao.delete(id);
		return new ModelAndView("redirect:/viewTransform1");
	}

}