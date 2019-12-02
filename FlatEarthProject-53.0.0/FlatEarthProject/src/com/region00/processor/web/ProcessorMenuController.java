package com.region00.processor.web;

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
public class ProcessorMenuController {
	
	 private static final Log log = LogFactory.getLog(ProcessorMenuController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
		    @Autowired
		    MenuDaoImpl						menuDao;
	 
	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	@RequestMapping("/processorMenu") 
	public ModelAndView processorMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from processorMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Processor Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/menu/processorMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/processorMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView processorMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from processorMenu2 " + now);
		return new ModelAndView("redirect:/processorMenu");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/issuingProcessorMenu")
	public ModelAndView issuingProcessorMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from issuingProcessorMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Issuer Processor Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/menu/issuingProcessorMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/issProcessorMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView issuingProcessorMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from issuingProcessorMenu " + now);
		return new ModelAndView("redirect:/issuingProcessorMenu");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/engineMenu")
	public ModelAndView engineMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from engineMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Engine Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/engine/menu/engineMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/engineMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView engineMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from engineMenu " + now);
		return new ModelAndView("redirect:/engineMenu");
	}

	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/accountLevelMenu")
	public ModelAndView accountLevelMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from accountLevelMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Account Level Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/knowledge/menu/accountLevelMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/accountLevelMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView accountLevelMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from accountLevelMenu " + now);
		return new ModelAndView("redirect:/accountLevelMenu");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/binLevelMenu")
	public ModelAndView binLevelMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from binLevelMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("BIN Level Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/knowledge/menu/binLevelMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/binLevelMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView binLevelMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from binLevelMenu " + now);
		return new ModelAndView("redirect:/binLevelMenu");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/transactionLevelMenu")
	public ModelAndView transactionLevelMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from transactionLevelMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Transaction Level Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/knowledge/menu/transactionMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/transLevelMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView transactionLevelMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from transactionLevelMenu " + now);
		return new ModelAndView("redirect:/transactionLevelMenu");
	}
	
}