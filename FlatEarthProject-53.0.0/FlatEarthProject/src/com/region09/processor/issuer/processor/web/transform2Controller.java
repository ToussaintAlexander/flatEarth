package com.region09.processor.issuer.processor.web;

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
import com.region09.processor.issuer.processor.dao.Transform2DaoImpl;
import com.region09.processor.issuer.processor.model.transform2Bean;

@Controller
public class transform2Controller {
	
	 private static final Log log = LogFactory.getLog(transform2Controller.class);
	
	    
			 @Autowired
			 Transform1DaoImpl					transform1Dao;
	 
    @Autowired
	Transform2DaoImpl transform2Dao; 
    
	@RequestMapping("/transform2Form")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from transform2Form " + now);
		return new ModelAndView("region09/processor/issuer/processor/transform2Form","command",new transform2Bean());
	}
	
	@RequestMapping(value="/transform2FormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("transform2") transform2Bean transform2){
		String now = (new Date()).toString();
		log.info("Logging return from transform2Form " + now);
		transform2Dao.insert(transform2);
		return new ModelAndView("redirect:/viewTransform2"); 
	}
	
	@RequestMapping("/viewTransform2")
	public ModelAndView viewIssProcessor1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTransform2 " + now);
		List<transform2Bean> list=transform2Dao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/processor/viewTransform2");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewTransform2JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewIssProcessor2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTransform2 " + now);
		return new ModelAndView("redirect:/viewTransform2");
	}

	@RequestMapping(value="/updateTransform2JSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTransform2 " + now);
		transform2Bean transform2=transform2Dao.selectTransform2ById(id);
		//return new ModelAndView("region09/processor/issuer/transform/transform2EditForm","command",transform2);
		ModelAndView model = new ModelAndView("region09/processor/issuer/processor/transform2EditForm","command",transform2);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/transform2EditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("transform2") transform2Bean transform2){
		String now = (new Date()).toString();
		log.info("Logging return from transform2EditForm " + now);
		transform2Dao.update(transform2);
		return new ModelAndView("redirect:/viewTransform2");
	}
	 
	@RequestMapping(value="/deleteTransform2JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTransform2 " + now);
		transform2Dao.delete(id);
		return new ModelAndView("redirect:/viewTransform2");
	}
	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/issuerProcessorScreen")
	public ModelAndView issuerScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerProcessorScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/screen/issuerProcessorScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/issProcessorScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView issuerScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerProcessorScreen " + now);
		return new ModelAndView("redirect:/issuerProcessorScreen");
	}
	
}