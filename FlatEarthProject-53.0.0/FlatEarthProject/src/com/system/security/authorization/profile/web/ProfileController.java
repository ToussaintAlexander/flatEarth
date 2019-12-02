package com.system.security.authorization.profile.web;

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

import com.system.security.authorization.profile.dao.ProfileDaoImpl;
import com.system.security.authorization.profile.model.ProfileBean;

@Controller
public class ProfileController {
	
	 private static final Log log = LogFactory.getLog(ProfileController.class);
	
    @Autowired
	ProfileDaoImpl profileDao; 
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/profileScreen")
	public ModelAndView profileScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from profileScreen " + now);
		List<ProfileBean> list=profileDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/profile/viewProfile");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/profileScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView profileScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from profileScreen " + now);
		return new ModelAndView("redirect:/profileScreen");
		
	}
 
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/authorization.htm")
	public ModelAndView authorizationScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from authorizationScreen1 " + now);
		List<ProfileBean> list=profileDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/profile/viewProfile");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/authorizationScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView authorizationScreen2 (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from authorizationScreen2 " + now);
		return new ModelAndView("redirect:/authorization.htm");
	}
	
	@RequestMapping("/profileForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from profileForm " + now);
		return new ModelAndView("system/security/authorization/profile/profileForm","command",new ProfileBean());
	}
	
	@RequestMapping(value="/profileFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("profile") ProfileBean profile){
		String now = (new Date()).toString();
		log.info("Logging return from profileForm " + now);
		profileDao.insert(profile);
		return new ModelAndView("redirect:/viewProfile"); 
	}
	
	@RequestMapping("/viewProfile")
	public ModelAndView viewProfile(){
		String now = (new Date()).toString();
		log.info("Logging return from viewProfile " + now);
		List<ProfileBean> list=profileDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/profile/viewProfile");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateProfileJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateProfile " + now);
		ProfileBean profile=profileDao.selectProfileById(id);
		//return new ModelAndView("system/security/authorization/profile/profileEditForm","command",profile);
		ModelAndView model = new ModelAndView("system/security/authorization/profile/profileEditForm","command",profile);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/profileEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("profile") ProfileBean profile){
		String now = (new Date()).toString();
		log.info("Logging return from profileEditForm " + now);
		profileDao.update(profile);
		return new ModelAndView("redirect:/viewProfile");
	}
	 
	@RequestMapping(value="/deleteProfileJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteProfile " + now);
		profileDao.delete(id);
		return new ModelAndView("redirect:/viewProfile");
	}

}