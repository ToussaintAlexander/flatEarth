package com.main.testing.web;

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
public class TestingController {
	
	 private static final Log log = LogFactory.getLog(TestingController.class);

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
	@RequestMapping("/testingMenu")
	public ModelAndView testingMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from testingMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/testingMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView testingMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from testingMenu2 " + now);
		return new ModelAndView("redirect:/testingMenu");
	}
	
	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test171Menu")
	public ModelAndView test171Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test171Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 17.1 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test171MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test171Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test171Menu2 " + now);
		return new ModelAndView("redirect:/test171Menu");
	}

	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test172Menu")
	public ModelAndView test172Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test172Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 17.2 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test172MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test172Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test172Menu2 " + now);
		return new ModelAndView("redirect:/test172Menu");
	}

	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test181Menu")
	public ModelAndView test181Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test181Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 18.1 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test181MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test181Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test181Menu2 " + now);
		return new ModelAndView("redirect:/test181Menu");
	}
	
	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test182Menu")
	public ModelAndView test182Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test182Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 18.2 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test182MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test182Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test182Menu2 " + now);
		return new ModelAndView("redirect:/test182Menu");
	}
	
	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test191Menu")
	public ModelAndView test191Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test191Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 19.1 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test191MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test191Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test191Menu2 " + now);
		return new ModelAndView("redirect:/test191Menu");
	}
	
	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/test192Menu")
	public ModelAndView test192Menu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from test192Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Testing Tech Letter 19.2 Menu");
		ModelAndView model = new ModelAndView("menu/testing/menu/testingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/test192MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView test192Menu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from test192Menu2 " + now);
		return new ModelAndView("redirect:/test192Menu");
	}
	
}