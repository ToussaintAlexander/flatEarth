package com.region00.bank.web;

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
public class BankMenuController {
	
	 private static final Log log = LogFactory.getLog(BankMenuController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl		menuDao;
	 
	/********************************************************************************** 
	 **********************************************************************************
	 */
	@RequestMapping("/bankMenu")
	public ModelAndView bankMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from bankMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Bank Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/bank/menu/bankMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/bankMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView bankMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from bankMenu2 " + now);
		return new ModelAndView("redirect:/bankMenu");
	}


}