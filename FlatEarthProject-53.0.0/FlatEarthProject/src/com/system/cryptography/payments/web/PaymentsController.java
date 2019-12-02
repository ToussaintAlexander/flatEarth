package com.system.cryptography.payments.web;

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
public class PaymentsController {

	private static final Log log = LogFactory.getLog(PaymentsController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/paymentsMenu")
	public ModelAndView paymentsMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from paymentsMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Payments Cryptography Menu");
		ModelAndView model = new ModelAndView("system/cryptography/payments/menu/paymentsMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
			
	@RequestMapping(value="/paymentsMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView paymentsMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from paymentsMenu2 " + now);
		return new ModelAndView("redirect:/paymentsMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/cVVHandling")
	public ModelAndView cVVHandling1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCVVHandling1 " + now);
//		CVVHandlingBean cVVHandlingBean = cVVHandlingDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/payments/form/cVVHandling");
//		model.addObject("bean", cVVHandlingBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/cVVHandlingJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView cVVHandling2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from cVVHandling2 " + now);
		return new ModelAndView("redirect:/cVVHandling");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/pinBlockCoding")
	public ModelAndView pinBlockCoding1(){
		String now = (new Date()).toString();
		log.info("Logging return from pinBlockCoding1 " + now);
//		PinBlockCodingBean pinBlockCodingBean = pinBlockCodingDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/payments/form/pinBlockCoding");
//		model.addObject("bean", pinBlockCodingBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/pinBlockCodingJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView pinBlockCoding2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from pinBlockCoding2 " + now);
		return new ModelAndView("redirect:/pinBlockCoding");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/pinEncryption")
	public ModelAndView pinEncryption1(){
		String now = (new Date()).toString();
		log.info("Logging return from pinEncryption1 " + now);
//		PinEncryptionBean pinEncryptionBean = pinEncryptionDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/payments/form/pinEncryption");
//		model.addObject("bean", pinEncryptionBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/pinEncryptionJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView pinEncryption2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from pinEncryption2 " + now);
		return new ModelAndView("redirect:/pinEncryption");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/pinPVVHandling")
	public ModelAndView pinPVVHandling1(){
		String now = (new Date()).toString();
		log.info("Logging return from pinPVVHandling1 " + now);
//		PinPVVHandlingBean pinPVVHandlingBean = pinPVVHandlingDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/payments/form/pinPvvHandling");
//		model.addObject("bean", pinPVVHandlingBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/pinPVVHandlingJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView pinPVVHandling2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from pinPVVHandling2 " + now);
		return new ModelAndView("redirect:/pinPVVHandling");
	}
	
}
