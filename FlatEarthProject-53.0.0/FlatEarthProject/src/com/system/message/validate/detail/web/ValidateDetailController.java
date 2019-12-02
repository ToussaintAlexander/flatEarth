package com.system.message.validate.detail.web;

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

import com.system.message.validate.detail.dao.ValidateDetailDaoImpl;
import com.system.message.validate.detail.model.ValidateDetailBean;

@Controller
public class ValidateDetailController {
	
	 private static final Log log = LogFactory.getLog(ValidateDetailController.class);
	
    @Autowired
	ValidateDetailDaoImpl validateDetailDao; 
    

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/validateDetailScreen")
	public ModelAndView validateDetailScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from validateDetailScreen " + now);
		List<ValidateDetailBean> list=validateDetailDao.select();
		ModelAndView model = new ModelAndView("system/message/validateDetail/viewValidateDetail");
		model.addObject("list", list);
		model.addObject("now", now); 
		return model;
	}
		
	@RequestMapping(value="/validateDetailScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView validateDetailScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from validateDetailScreen " + now);
		return new ModelAndView("redirect:/validateDetailScreen");
		
	}
	
    
	@RequestMapping("/validateDetailForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from validateDetailForm " + now);
		return new ModelAndView("system/message/validateDetail/validateDetailForm","command",new ValidateDetailBean());
	}
	
	@RequestMapping(value="/validateDetailFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("validateDetail") ValidateDetailBean validateDetail){
		String now = (new Date()).toString();
		log.info("Logging return from validateDetailForm " + now);
		validateDetailDao.insert(validateDetail);
		return new ModelAndView("redirect:/viewValidateDetail"); 
	}
	
	@RequestMapping("/viewValidateDetail")
	public ModelAndView viewValidateDetail(){
		String now = (new Date()).toString();
		log.info("Logging return from viewValidateDetail " + now);
		List<ValidateDetailBean> list=validateDetailDao.select();
		ModelAndView model = new ModelAndView("system/message/validateDetail/viewValidateDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateValidateDetailJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateValidateDetail " + now);
		ValidateDetailBean validateDetail=validateDetailDao.selectValidateDetailById(id);
		ModelAndView model = new ModelAndView("system/message/validateDetail/validateDetailEditForm","command",validateDetail);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/validateDetailEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("validateDetail") ValidateDetailBean validateDetail){
		String now = (new Date()).toString();
		log.info("Logging return from validateDetailEditForm " + now);
		validateDetailDao.update(validateDetail);
		return new ModelAndView("redirect:/viewValidateDetail");
	}
	 
	@RequestMapping(value="/deleteValidateDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteValidateDetail " + now);
		validateDetailDao.delete(id);
		return new ModelAndView("redirect:/viewValidateDetail");
	}

}