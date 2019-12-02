package com.system.security.authentication.password.web;

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

import com.system.security.authentication.password.dao.PasswordDaoImpl;
import com.system.security.authentication.password.model.PasswordBean;

@Controller
public class PasswordController {
	
	 private static final Log log = LogFactory.getLog(PasswordController.class);
	
    @Autowired
    PasswordDaoImpl passwordDao; 
    

	//--------------------------------------------------------------------------------
	// Authentication ---> Profile
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/authenticationScreen")
	public ModelAndView authenticationScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from authenticationScreen " + now);
		List<PasswordBean> list=passwordDao.select();
		ModelAndView model = new ModelAndView("system/security/authentication/request/viewPassword");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/authenticationScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView thresholdsScreenScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from authenticationScreen " + now);
		return new ModelAndView("redirect:/authenticationScreen");
		
	}
    
	@RequestMapping("/passwordForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from passwordForm " + now);
		return new ModelAndView("system/security/authentication/request/passwordForm","command",new PasswordBean());
	}
	
	@RequestMapping(value="/passwordFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("password") PasswordBean password){
		String now = (new Date()).toString();
		log.info("Logging return from passwordForm " + now);
		passwordDao.insert(password);
		return new ModelAndView("redirect:/viewPassword"); 
	}
	
	@RequestMapping("/viewPassword")
	public ModelAndView viewPassword(){
		String now = (new Date()).toString();
		log.info("Logging return from viewPassword " + now);
		List<PasswordBean> list=passwordDao.select();
		ModelAndView model = new ModelAndView("system/security/authentication/request/viewPassword");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updatePasswordJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updatePassword " + now);
		PasswordBean password=passwordDao.selectPasswordById(id);
		ModelAndView model = new ModelAndView("system/security/authentication/request/passwordEditForm","command",password);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passwordEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("password") PasswordBean password){
		String now = (new Date()).toString();
		log.info("Logging return from passwordEditForm " + now);
		passwordDao.update(password);
		return new ModelAndView("redirect:/viewPassword");
	}
	 
	@RequestMapping(value="/deletePasswordJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int groupId, int userId, int sequence){
		String now = (new Date()).toString();
		log.info("Logging return from deletePassword " + now);
		passwordDao.delete(groupId, userId, sequence);
		return new ModelAndView("redirect:/viewPassword");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/loginFailed.htm")
	public ModelAndView loginFailedScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from loginFailedScreen1 " + now);
		ModelAndView model = new ModelAndView("system/security/authentication/response/loginFailed");
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/loginFailedScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView loginFailedScreen2 (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from loginFailedScreen2 " + now);
		return new ModelAndView("redirect:/loginFailed.htm");
		
	}
	
}