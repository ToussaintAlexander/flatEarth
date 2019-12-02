package com.system.cryptography.common.web;

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
public class CommonController {

	private static final Log log = LogFactory.getLog(CommonController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/commonMenu")
	public ModelAndView commonMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from commonMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Common Cryptography Menu");
		ModelAndView model = new ModelAndView("system/cryptography/common/menu/commonMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
			
	@RequestMapping(value="/commonMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView commonMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from commonMenu2 " + now);
		return new ModelAndView("redirect:/commonMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewBitmapParser")
	public ModelAndView bitmapParser1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewBitmapParser1 " + now);
//		BitmapParserBean bitmapParserBean = bitmapParserDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/common/form/viewBitmapParser");
//		model.addObject("bean", bitmapParserBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/bitmapParserJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView bitmapParser2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewBitmapParser2 " + now);
		return new ModelAndView("redirect:/viewBitmapParser");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewLuhnDigitCheck")
	public ModelAndView luhnDigitCheck1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewLuhnDigitCheck1 " + now);
//		LuhnDigitCheckBean luhnDigitCheckBean = luhnDigitCheckDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/common/form/viewLuhnDigitCheck");
//		model.addObject("bean", luhnDigitCheckBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/luhnDigitCheckJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView luhnDigitCheck2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from luhnDigitCheck2 " + now);
		return new ModelAndView("redirect:/viewLuhnDigitCheck");
	}
	
}
