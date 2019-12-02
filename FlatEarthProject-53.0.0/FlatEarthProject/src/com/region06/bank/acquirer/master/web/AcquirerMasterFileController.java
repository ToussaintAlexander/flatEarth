package com.region06.bank.acquirer.master.web;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region06.bank.acquirer.master.dao.AcquirerMasterFileDaoImpl;
import com.region06.bank.acquirer.master.model.AcquirerMasterFileBean;
import com.region10.bank.issuer.client.model.IssuersBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class AcquirerMasterFileController {
	
	 private static final Log log = LogFactory.getLog(AcquirerMasterFileController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl				menuDao;
	 
	 @Autowired
	 AcquirerMasterFileDaoImpl 	acquirerMasterFileDao; 
	 
	/********************************************************************************** 
	 **********************************************************************************
	 */
	@RequestMapping("/acquirerBankMenu")
	public ModelAndView acquirerBankMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from acquirerBankMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Acquirer Bank Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/bank/menu/bankMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/acquirerBankMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView acquirerBankMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from acquirerBankMenu2 " + now);
		return new ModelAndView("redirect:/acquirerBankMenu");
	}
    
	//---------------------------------------------------------------------------------
	
	@RequestMapping("/viewAcquirerMasterFile")
	public ModelAndView viewAcquirerMasterFile1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAcquirerMasterFile1 " + now);
		List<AcquirerMasterFileBean> list=acquirerMasterFileDao.select();
		ModelAndView model = new ModelAndView("region06/bank/acquirer/master/viewAcquirerMasterFile");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewAcquirerMasterFileJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewIssuers2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewAcquirerMasterFile2 " + now);
		return new ModelAndView("redirect:/viewAcquirerMasterFile");
	}
	
	//---------------------------------------------------------------------------------
    
	@RequestMapping("/viewAcquirerMasterFileForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAcquirerMasterFileForm " + now);
		return new ModelAndView("region06/bank/acquirer/master/acquirerMasterFileForm","command",new IssuersBean());
	}
	
	@RequestMapping(value="/viewAcquirerMasterFileFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("viewAcquirerMasterFile") AcquirerMasterFileBean file){
		String now = (new Date()).toString();
		log.info("Logging return from issuersForm " + now);
		acquirerMasterFileDao.insert(file);
		return new ModelAndView("redirect:/viewAcquirerMasterFile"); 
	}

	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateAcquirerMasterFileJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateAcquirerMasterFile1 " + now);
		AcquirerMasterFileBean file=acquirerMasterFileDao.selectAcquirerMasterFileById(id);
		ModelAndView model = new ModelAndView("region06/bank/acquirer/master/acquirerMasterFileEditForm","command",file);
		model.addObject("now", now);
		return model;
	}
	
	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteAcquirerMasterFileJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteAcquirerMasterFile " + now);
		acquirerMasterFileDao.delete(id);
		return new ModelAndView("redirect:/viewAcquirerMasterFile");
	}

}