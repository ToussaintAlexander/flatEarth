package com.region08.association.template.web;

import java.util.Date;
//import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region08.association.template.dao.TemplateDaoImpl;
import com.region08.association.template.model.TemplateBean;

@Controller
public class TemplateController {
	
	 private static final Log log = LogFactory.getLog(TemplateController.class);
	
    @Autowired
	TemplateDaoImpl templateDao; 
    
	@RequestMapping("/templateForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from templateForm " + now);
		return new ModelAndView("region08/association/template/templateForm","command",new TemplateBean());
	}
	
	@RequestMapping(value="/templateFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("template") TemplateBean template){
		String now = (new Date()).toString();
		log.info("Logging return from templateForm " + now);
		templateDao.insert(template);
		return new ModelAndView("redirect:/viewTemplate"); 
	}

	@RequestMapping(value="/updateTemplateJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTemplate " + now);
		TemplateBean template=templateDao.selectTemplatesById(id);
		//return new ModelAndView("region08/association/template/templateEditForm","command",template);
		ModelAndView model = new ModelAndView("region08/association/template/templateEditForm","command",template);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/templateEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("template") TemplateBean template){
		String now = (new Date()).toString();
		log.info("Logging return from templateEditForm " + now);
		templateDao.update(template);
		return new ModelAndView("redirect:/viewTemplate");
	}
	 
	@RequestMapping(value="/deleteTemplateJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTemplate " + now);
		templateDao.delete(id);
		return new ModelAndView("redirect:/viewTemplate");
	}

}