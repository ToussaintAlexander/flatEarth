package com.system.cryptography.emv.web;

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
public class EMVController {

	private static final Log log = LogFactory.getLog(EMVController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/emvMenu")
	public ModelAndView emvMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from emvMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Europay, MasterCard, Visa Menu");
		ModelAndView model = new ModelAndView("system/cryptography/emv/menu/emvMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
			
	@RequestMapping(value="/emvMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView emvMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from emvMenu2 " + now);
		return new ModelAndView("redirect:/emvMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/cryptograms")
	public ModelAndView cryptograms1(){
		String now = (new Date()).toString();
		log.info("Logging return from cryptograms1 " + now);
//		CryptogramsBean cryptogramsBean = cryptogramsDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/emv/form/cryptograms");
//		model.addObject("bean", cryptogramsBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/cryptogramsJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView cryptograms2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from cryptograms2 " + now);
		return new ModelAndView("redirect:/cryptograms");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/dynamicDataAuth")
	public ModelAndView dynamicDataAuth1(){
		String now = (new Date()).toString();
		log.info("Logging return from pinBlockCoding1 " + now);
//		DynamicDataAuthBean dynamicDataAuthBean = dynamicDataAuthDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/emv/form/dynamicDataAuth");
//		model.addObject("bean", dynamicDataAuthBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/dynamicDataJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView dynamicDataAuth2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from dynamicDataAuth2 " + now);
		return new ModelAndView("redirect:/dynamicDataAuth");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/sessionKey")
	public ModelAndView sessionKey1(){
		String now = (new Date()).toString();
		log.info("Logging return from sessionKey1 " + now);
//		SessionKeyBean sessionKeyBean = sessionKeyDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/emv/form/sessionKey");
//		model.addObject("bean", sessionKeyBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/sessionKeyJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView pinPVVHandling2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from sessionKey2 " + now);
		return new ModelAndView("redirect:/sessionKey");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/staticDataAuth")
	public ModelAndView staticDataAuth1(){
		String now = (new Date()).toString();
		log.info("Logging return from staticDataAuth1 " + now);
//		StaticDataAuthBean staticDataAuthBean = staticDataAuthDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/emv/form/staticDataAuth");
//		model.addObject("bean", staticDataAuthBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/staticDataJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView staticDataAuth2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from staticDataAuth2 " + now);
		return new ModelAndView("redirect:/staticDataAuth");
	}
	
}
