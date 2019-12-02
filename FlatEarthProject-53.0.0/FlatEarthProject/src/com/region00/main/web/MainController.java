package com.region00.main.web;

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

//import com.regression.dao.RegressionDaoImpl;
//import com.regression.model.RegressionBean;
//import com.simulation.dao.SimulationDaoImpl;
//import com.simulation.model.SimulationBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class MainController {

	private static final Log log = LogFactory.getLog(MainController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl				menuDao;
	 
//	 @Autowired
//	 RegressionDaoImpl			regressionDao;
	 
	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */	
/*
	@RequestMapping("/mainMenu.htm")
	public ModelAndView mainMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from mainMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Main Menu");
		ModelAndView model = new ModelAndView("menu/main/menu/mainMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/mainMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView mainMenuMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from mainMenu " + now);
		return new ModelAndView("redirect:/mainMenu.htm");
	}
*/	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/regressionScreen")
	public ModelAndView regressionScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from regressionScreen1 " + now);
		//List<RegressionBean> list=regressionDao.select();
		ModelAndView model = new ModelAndView("menu/regression/screen/regression");
		//model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/regressionScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView regressionScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from regressionScreen2 " + now);
		return new ModelAndView("redirect:/regressionScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/maintenanceMenu")
	public ModelAndView maintenanceMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from mainMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Maintenance Menu");
		ModelAndView model = new ModelAndView("menu/main/menu/mainMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/maintenanceMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView maintenanceMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from maintenanceMenu " + now);
		return new ModelAndView("redirect:/maintenanceMenu");
	}
	
}
