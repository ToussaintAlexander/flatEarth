package com.region01.cardholder.statement.credit.web;

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

import com.region01.cardholder.statement.credit.dao.CreditChargeDaoImpl;
import com.region01.cardholder.statement.credit.dao.CreditDetailDaoImpl;
import com.region01.cardholder.statement.credit.dao.CreditSummaryDaoImpl;
import com.region01.cardholder.statement.credit.model.CreditChargeBean;
import com.region01.cardholder.statement.credit.model.CreditDetailBean;
import com.region01.cardholder.statement.credit.model.CreditSummaryBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;

@Controller
public class CreditStatementController {

	 private static final Log log = LogFactory.getLog(CreditStatementController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 CreditSummaryDaoImpl	creditSummaryDao;	
	 
	 @Autowired
	 CreditDetailDaoImpl	creditDetailDao;	
	 
	 @Autowired
	 CreditChargeDaoImpl	creditChargeDao;	
	 
	 @Autowired
	 MenuDaoImpl			menuDao;

	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	
	@RequestMapping("/viewCreditCardSummary")
	public ModelAndView viewCreditCardSummary1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCreditCardSummary1 " + now);
		List<CreditSummaryBean> list=creditSummaryDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/summary/viewCreditSummary");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCreditSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCreditCardSummary2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCreditCardSummary2 " + now);
		return new ModelAndView("redirect:/viewCreditCardSummary");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/creditSummaryForm")
	public ModelAndView creditSummaryForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from creditSummaryForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/credit/summary/creditSummaryForm","command",new CreditSummaryBean());
	}
	
	@RequestMapping(value="/creditSummaryFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView creditSummaryForm2 (@ModelAttribute("creditSummary") CreditSummaryBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from creditSummaryForm2 " + now);
		creditSummaryDao.insert(credit);
		return new ModelAndView("redirect:/viewCreditCardSummary"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCreditSummaryJSPHref/{id}")
	public ModelAndView updateCreditSummary1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCreditSummary1 " + now);
		CreditSummaryBean credit = creditSummaryDao.selectCreditSummaryById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/summary/creditSummaryEditForm","command",credit);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCreditSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCreditSummary(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCreditSummary " + now);
		creditSummaryDao.delete(id);
		return new ModelAndView("redirect:/viewCreditCardSummary");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewCreditCardDetail")
	public ModelAndView viewCreditCardDetail1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCreditCardDetail1 " + now);
		List<CreditDetailBean> list=creditDetailDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/detail/viewCreditDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCreditDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCreditCardDetail2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCreditCardDetail2 " + now);
		return new ModelAndView("redirect:/viewCreditCardDetail");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/creditDetailForm")
	public ModelAndView creditDetailForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from creditDetailForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/credit/detail/creditDetailForm","command",new CreditDetailBean());
	}
	
	@RequestMapping(value="/creditDetailFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView creditDetailForm2 (@ModelAttribute("creditDetail") CreditDetailBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from creditDetailForm2 " + now);
		creditDetailDao.insert(credit);
		return new ModelAndView("redirect:/viewCreditCardDetail"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCreditDetailJSPHref/{id}")
	public ModelAndView updateCreditDetail1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCreditDetail1 " + now);
		CreditDetailBean credit = creditDetailDao.selectCreditDetailById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/detail/creditDetailEditForm","command",credit);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCreditDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCreditDetail(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCreditDetail " + now);
		creditDetailDao.delete(id);
		return new ModelAndView("redirect:/viewCreditCardDetail");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewCreditCardCharge")
	public ModelAndView viewCreditCardCharge1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCreditCardCharge1 " + now);
		List<CreditChargeBean> list=creditChargeDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/charge/viewCreditCharge");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCreditChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCreditCardCharge2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCreditCardCharge2 " + now);
		return new ModelAndView("redirect:/viewCreditCardCharge");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/creditChargeForm")
	public ModelAndView creditChargeForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from creditChargeForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/credit/charge/creditChargeForm","command",new CreditChargeBean());
	}
	
	@RequestMapping(value="/creditChargeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView creditChargeForm2 (@ModelAttribute("creditCharge") CreditChargeBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from creditChargeForm2 " + now);
		creditChargeDao.insert(credit);
		return new ModelAndView("redirect:/viewCreditCardCharge"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCreditCharge/{id}")
	public ModelAndView updateCreditCharge1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCreditCharge1 " + now);
		CreditChargeBean credit = creditChargeDao.selectCreditChargeById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/credit/charge/creditChargeEditForm","command",credit);
		model.addObject("now", now);
		return model;		
	}
	
	@RequestMapping(value="/updateCreditChargeJSPPostAction",method = RequestMethod.POST)
	public ModelAndView updateCreditCharge2(@ModelAttribute("creditCharge") CreditChargeBean credit){
		String now = (new Date()).toString();
		log.info("Logging return from updateCreditCharge2 " + now);
		creditChargeDao.update(credit);
		return new ModelAndView("redirect:/viewCreditCardCharge");
	}
 
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCreditChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCreditCharge(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCreditCharge " + now);
		creditChargeDao.delete(id);
		return new ModelAndView("redirect:/viewCreditCardCharge");
	}
	
}
