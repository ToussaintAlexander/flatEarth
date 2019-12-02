package com.region00.merchant.web;

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
public class MerchantMenuController {
	
	 private static final Log log = LogFactory.getLog(MerchantMenuController.class);
	 
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
	@RequestMapping("/merchantMenu")
	public ModelAndView merchantMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from merchantMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Merchant Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/merchant/menu/merchantMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/merchantMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView merchantMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from merchantMenu2 " + now);
		return new ModelAndView("redirect:/merchantMenu");
	}
	
}