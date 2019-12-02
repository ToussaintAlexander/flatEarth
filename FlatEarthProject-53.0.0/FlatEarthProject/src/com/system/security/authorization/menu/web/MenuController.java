package com.system.security.authorization.menu.web;

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

import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class MenuController {
	
	 private static final Log log = LogFactory.getLog(MenuController.class);
	
    @Autowired
	MenuDaoImpl menuDao; 
    
	@RequestMapping("/menuForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from menuForm " + now);
		List<MenuBean> list=menuDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/menu/viewMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/menuFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("menu") MenuBean menu){
		String now = (new Date()).toString();
		log.info("Logging return from menuForm " + now);
		menuDao.insert(menu);
		return new ModelAndView("redirect:/viewMenu"); 
	}
	
	@RequestMapping("/viewMenu")
	public ModelAndView viewMenu(){
		String now = (new Date()).toString();
		log.info("Logging return from viewMenu " + now);
		List<MenuBean> list=menuDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/menu/viewMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateMenuJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateMenu " + now);
		MenuBean menu=menuDao.selectMenuById(id);
		//return new ModelAndView("system/security/authorization/menu/menuEditForm","command",menu);
		ModelAndView model = new ModelAndView("system/security/authorization/menu/menuEditForm","command",menu);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/menuEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("menu") MenuBean menu){
		String now = (new Date()).toString();
		log.info("Logging return from menuEditForm " + now);
		menuDao.update(menu);
		return new ModelAndView("redirect:/viewMenu");
	}
	 
	@RequestMapping(value="/deleteMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteMenu " + now);
		menuDao.delete(id);
		return new ModelAndView("redirect:/viewMenu");
	}

}