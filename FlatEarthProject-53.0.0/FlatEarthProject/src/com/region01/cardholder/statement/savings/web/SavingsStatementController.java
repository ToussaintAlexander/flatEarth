package com.region01.cardholder.statement.savings.web;

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

import com.region01.cardholder.statement.credit.model.CreditDetailBean;
import com.region01.cardholder.statement.savings.dao.SavingsChargeDaoImpl;
import com.region01.cardholder.statement.savings.dao.SavingsDetailDaoImpl;
import com.region01.cardholder.statement.savings.dao.SavingsSummaryDaoImpl;
import com.region01.cardholder.statement.savings.model.SavingsChargeBean;
import com.region01.cardholder.statement.savings.model.SavingsDetailBean;
import com.region01.cardholder.statement.savings.model.SavingsSummaryBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;

@Controller
public class SavingsStatementController {

	 private static final Log log = LogFactory.getLog(SavingsStatementController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 SavingsSummaryDaoImpl	savingsSummaryDao;	
	 
	 @Autowired
	 SavingsDetailDaoImpl	savingsDetailDao;	
	 
	 @Autowired
	 SavingsChargeDaoImpl	savingsChargeDao;	
	 
	 @Autowired
	 MenuDaoImpl			menuDao;

	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	
	@RequestMapping("/viewSavingsSummary")
	public ModelAndView viewSavingsSummary1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewSavingsSummary1 " + now);
		List<SavingsSummaryBean> list=savingsSummaryDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/summary/viewSavingsSummary");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewSavingsSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSavingsSummary2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSavingsSummary2 " + now);
		return new ModelAndView("redirect:/viewSavingsSummary");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/savingsSummaryForm")
	public ModelAndView savingsSummaryForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from savingsSummaryForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/savings/summary/savingsSummaryForm","command",new SavingsSummaryBean());
	}
	
	@RequestMapping(value="/savingsSummaryFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView savingsSummaryForm2 (@ModelAttribute("savingsSummary") SavingsSummaryBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from savingsSummaryForm2 " + now);
		savingsSummaryDao.insert(credit);
		return new ModelAndView("redirect:/viewSavingsSummary"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateSavingsSummaryJSPHref/{id}")
	public ModelAndView updateSavingsSummary1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateSavingsSummary1 " + now);
		SavingsSummaryBean credit = savingsSummaryDao.selectSavingsSummaryById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/summary/savingsSummaryEditForm","command",credit);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteSavingsSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteSavingsSummary(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteSavingsSummary " + now);
		savingsSummaryDao.delete(id);
		return new ModelAndView("redirect:/viewSavingsSummary");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewSavingsDetail")
	public ModelAndView viewSavingsDetail1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewSavingsDetail1 " + now);
		List<SavingsDetailBean> list=savingsDetailDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/detail/viewSavingsDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewSavingsDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSavingsDetail2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSavingsDetail2 " + now);
		return new ModelAndView("redirect:/viewSavingsDetail");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/savingsDetailForm")
	public ModelAndView savingsDetailForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from savingsDetailForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/savings/detail/savingsDetailForm","command",new CreditDetailBean());
	}
	
	@RequestMapping(value="/savingsDetailFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView savingsDetailForm2 (@ModelAttribute("savingsDetail") SavingsDetailBean savings){
		String now = (new Date()).toString();
		log.info("Logging return from savingsDetailForm2 " + now);
		savingsDetailDao.insert(savings);
		return new ModelAndView("redirect:/viewSavingsDetail"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateSavingsDetailJSPHref/{id}")
	public ModelAndView updateSavingsDetail1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateSavingsDetail1 " + now);
		SavingsDetailBean savings = savingsDetailDao.selectSavingsDetailById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/detail/savingsDetailEditForm","command",savings);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteSavingsDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteSavingsDetail(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteSavingsDetail " + now);
		savingsDetailDao.delete(id);
		return new ModelAndView("redirect:/viewSavingsDetail");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewSavingsCharge")
	public ModelAndView viewSavingsCharge1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewSavingsCharge1 " + now);
		List<SavingsChargeBean> list=savingsChargeDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/charge/viewSavingsCharge");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewSavingsChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSavingsCharge2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSavingsCharge2 " + now);
		return new ModelAndView("redirect:/viewSavingsCharge");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/savingsChargeForm")
	public ModelAndView savingsChargeForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from savingsChargeForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/savings/charge/savingsChargeForm","command",new SavingsChargeBean());
	}
	
	@RequestMapping(value="/savingsChargeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView savingsChargeForm2 (@ModelAttribute("savingsCharge") SavingsChargeBean savings){
		String now = (new Date()).toString();
		log.info("Logging return from savingsChargeForm2 " + now);
		savingsChargeDao.insert(savings);
		return new ModelAndView("redirect:/viewSavingsCharge"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateSavingsCharge/{id}")
	public ModelAndView updateSavingsCharge1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateSavingsCharge1 " + now);
		SavingsChargeBean savings = savingsChargeDao.selectSavingsChargeById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/savings/charge/savingsChargeEditForm","command",savings);
		model.addObject("now", now);
		return model;		
	}
	
	@RequestMapping(value="/updateSavingsChargeJSPPostAction",method = RequestMethod.POST)
	public ModelAndView updateSavingsCharge2(@ModelAttribute("creditCharge") SavingsChargeBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from updateSavingsCharge2 " + now);
		savingsChargeDao.update(credit);
		return new ModelAndView("redirect:/viewSavingsCharge");
	}
 
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteSavingsChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteSavingsCharge(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteSavingsCharge " + now);
		savingsChargeDao.delete(id);
		return new ModelAndView("redirect:/viewSavingsCharge");
	}
	
}
