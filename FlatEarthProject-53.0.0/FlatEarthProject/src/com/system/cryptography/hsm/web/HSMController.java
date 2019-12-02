package com.system.cryptography.hsm.web;

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
public class HSMController {

	private static final Log log = LogFactory.getLog(HSMController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/hsmMenu")
	public ModelAndView hsmMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from hsmMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("HSM Cryptography Menu");
		ModelAndView model = new ModelAndView("system/cryptography/hsm/menu/hsmMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
			
	@RequestMapping(value="/hsmMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView hsmMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from hsmMenu2 " + now);
		return new ModelAndView("redirect:/hsmMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/hardwareSecurityModule")
	public ModelAndView hardwareSecurityModule1(){
		String now = (new Date()).toString();
		log.info("Logging return from hardwareSecurityModule1 " + now);
//		HardwareSecurityModuleBean hardwareSecurityModuleBean = hardwareSecurityModuleDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/hsm/form/hardwareSecurityModule");
//		model.addObject("bean", hardwareSecurityModuleBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/hsmJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView hardwareSecurityModule2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from hardwareSecurityModule2 " + now);
		return new ModelAndView("redirect:/hardwareSecurityModule");
	}
	
}
