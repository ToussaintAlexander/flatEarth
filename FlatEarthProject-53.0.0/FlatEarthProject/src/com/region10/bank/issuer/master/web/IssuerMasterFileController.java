package com.region10.bank.issuer.master.web;

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

import com.region10.bank.issuer.client.model.IssuersBean;
import com.region10.bank.issuer.master.dao.IssuerMasterFileDaoImpl;
import com.region10.bank.issuer.master.model.IssuerMasterFileBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class IssuerMasterFileController {
	
	 private static final Log log = LogFactory.getLog(IssuerMasterFileController.class);

	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 MenuDaoImpl				menuDao;
	 
	 @Autowired
	 IssuerMasterFileDaoImpl 	issuerMasterFileDao; 
	 
	/********************************************************************************** 
	 **********************************************************************************
	 */
	@RequestMapping("/issuerBankMenu")
	public ModelAndView bankMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerBankMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Issuer Bank Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/bank/menu/bankMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/issuerBankMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView bankMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerBankMenu2 " + now);
		return new ModelAndView("redirect:/issuerBankMenu");
	}
    
	//---------------------------------------------------------------------------------
	
	@RequestMapping("/viewIssuerMasterFile")
	public ModelAndView viewIssuerMasterFile1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewIssuerMasterFile1 " + now);
		List<IssuerMasterFileBean> list=issuerMasterFileDao.select();
		ModelAndView model = new ModelAndView("region10/bank/issuer/master/viewIssuerMasterFile");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewIssuerMasterFileJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewIssuers2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewIssuerMasterFile2 " + now);
		return new ModelAndView("redirect:/viewIssuerMasterFile");
	}
	
	//---------------------------------------------------------------------------------
    
	@RequestMapping("/viewIssuerMasterFileForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from viewIssuerMasterFileForm " + now);
		return new ModelAndView("region10/bank/issuer/master/issuerMasterFileForm","command",new IssuersBean());
	}
	
	@RequestMapping(value="/viewIssuerMasterFileFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("viewIssuerMasterFile") IssuerMasterFileBean file){
		String now = (new Date()).toString();
		log.info("Logging return from issuersForm " + now);
		issuerMasterFileDao.insert(file);
		return new ModelAndView("redirect:/viewIssuerMasterFile"); 
	}

	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateIssuerMasterFileJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateIssuerMasterFile1 " + now);
		IssuerMasterFileBean file=issuerMasterFileDao.selectIssuerMasterFileById(id);
		ModelAndView model = new ModelAndView("region10/bank/issuer/master/issuerMasterFileEditForm","command",file);
		model.addObject("now", now);
		return model;
	}
	
	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteIssuerMasterFileJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteIssuerMasterFile " + now);
		issuerMasterFileDao.delete(id);
		return new ModelAndView("redirect:/viewIssuers");
	}

}