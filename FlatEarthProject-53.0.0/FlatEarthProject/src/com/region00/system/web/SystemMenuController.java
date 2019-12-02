package com.region00.system.web;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class SystemMenuController {
	
	 private static final Log log = LogFactory.getLog(SystemMenuController.class);

	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl				menuDao;
	 
	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	@RequestMapping("/systemMenu")
	public ModelAndView systemMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from systemMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("System Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/menu/systemMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/systemMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView systemMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from systemMenu2 " + now);
		return new ModelAndView("redirect:/systemMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/configurationMenu")
	public ModelAndView configurationMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from configurationMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Configuration Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/configuration/menu/configurationMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/configMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView configurationMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from configurationMenu2 " + now);
		return new ModelAndView("redirect:/configurationMenu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/cryptographyMenu")
	public ModelAndView cryptographyMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from cryptographyMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Cryptography Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/cryptography/cryptographyMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/cryptographyMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView cryptographyMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from cryptographyMenu2 " + now);
		return new ModelAndView("redirect:/cryptographyMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/propertiesMenu")
	public ModelAndView propertiesMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from propertiesMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Properties Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/configuration/properties/menu/propertiesMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/propertiesMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView propertiesMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from propertiesMenu " + now);
		return new ModelAndView("redirect:/propertiesMenu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/languageMenu")
	public ModelAndView languageMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from languageMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Language Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/language/menu/languageMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/languageMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView languageMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from languageMenu " + now);
		return new ModelAndView("redirect:/languageMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/messageMenu")
	public ModelAndView messageMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from messageMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Message Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/message/menu/messageMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/messageMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView messageMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from messageMenu " + now);
		return new ModelAndView("redirect:/messageMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/securityMenu")
	public ModelAndView securityMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from securityMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Security Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/security/menu/securityMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/securityMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView securityMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from securityMenu " + now);
		return new ModelAndView("redirect:/securityMenu");
	}
	
	
	@RequestMapping("/authorizationMenu")
	public ModelAndView authorizationMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from authorizationMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Authorization Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/system/security/authorization/menu/authorizationMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/authorizationMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView authorizationMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from authorizationMenu " + now);
		return new ModelAndView("redirect:/authorizationMenu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/menuScreen")
	public ModelAndView menuScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from menuScreen " + now);
		List<MenuBean> list=menuDao.select();
		ModelAndView model = new ModelAndView("system/security/authorization/menu/viewMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/menuScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView menuScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from menuScreen " + now);
		return new ModelAndView("redirect:/menuScreen");
		
	}
	
}