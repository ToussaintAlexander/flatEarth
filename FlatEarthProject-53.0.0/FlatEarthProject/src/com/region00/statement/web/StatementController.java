package com.region00.statement.web;

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
public class StatementController {

	 private static final Log log = LogFactory.getLog(StatementController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl			menuDao;

	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	  
	@RequestMapping("/statementMenu")
	public ModelAndView statementMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from statementMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Statement Menu");
		ModelAndView model = new ModelAndView("region01/cardholder/statement/menu/statementMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/statementMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView statementMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from statementMenu2 " + now);
		return new ModelAndView("redirect:/statementMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/checkingMenu")
	public ModelAndView checkingMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from checkingMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Checking Menu");
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/menu/checkingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/checkingMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView checkingMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from checkingMenu2 " + now);
		return new ModelAndView("redirect:/checkingMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/savingsMenu")
	public ModelAndView savingsMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from savingsMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Savings Menu");
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/menu/savingsMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/savingsMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView savingsMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from savingsMenu2 " + now);
		return new ModelAndView("redirect:/savingsMenu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/creditCardMenu")
	public ModelAndView creditCardMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from creditCardMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Credit Card Menu");
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/menu/creditCardMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/creditCardMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView creditCardMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from creditCardMenu2 " + now);
		return new ModelAndView("redirect:/creditCardMenu");
	}
	
}
