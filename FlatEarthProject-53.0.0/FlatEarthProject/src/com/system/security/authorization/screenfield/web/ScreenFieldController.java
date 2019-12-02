package com.system.security.authorization.screenfield.web;

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

import com.system.security.authorization.screenfield.dao.ScreenFieldDaoImpl;
import com.system.security.authorization.screenfield.model.ScreenFieldBean;

@Controller
public class ScreenFieldController {
	
	 private static final Log log = LogFactory.getLog(ScreenFieldController.class);
	
    @Autowired
	ScreenFieldDaoImpl screenFieldDao; 
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/screenField")
	public ModelAndView fieldScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from screenField1 " + now);
		List<ScreenFieldBean> list=screenFieldDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/screenField/viewScreenField");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/fieldScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView fieldScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from screenField2 " + now);
		return new ModelAndView("redirect:/screenField");
	}
    
	@RequestMapping("/fieldForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from fieldForm " + now);
		return new ModelAndView("system/security/authorization/field/fieldForm","command",new ScreenFieldBean());
	}
	
	@RequestMapping(value="/fieldFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("field") ScreenFieldBean field){
		String now = (new Date()).toString();
		log.info("Logging return from fieldForm " + now);
		screenFieldDao.insert(field);
		return new ModelAndView("redirect:/viewField"); 
	}
	
	@RequestMapping("/viewScreenField")
	public ModelAndView viewField(){
		String now = (new Date()).toString();
		log.info("Logging return from viewField " + now);
		List<ScreenFieldBean> list=screenFieldDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/screenField/viewScreenField");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateScreenFieldJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateScreenField " + now);
		ScreenFieldBean field=screenFieldDao.selectFieldById(id);
		//return new ModelAndView("system/security/authorization/screenField/screenFieldEditForm","command",field);
		ModelAndView model = new ModelAndView("system/security/authorization/screenField/screenFieldEditForm","command",field);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/fieldEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("field") ScreenFieldBean field){
		String now = (new Date()).toString();
		log.info("Logging return from fieldEditForm " + now);
		screenFieldDao.update(field);
		return new ModelAndView("redirect:/viewField");
	}
	 
	@RequestMapping(value="/deleteFieldJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteField " + now);
		screenFieldDao.delete(id);
		return new ModelAndView("redirect:/viewField");
	}

}