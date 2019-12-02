package com.region01.cardholder.statement.checking.web;

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

import com.region01.cardholder.statement.checking.dao.CheckingChargeDaoImpl;
import com.region01.cardholder.statement.checking.dao.CheckingDetailDaoImpl;
import com.region01.cardholder.statement.checking.dao.CheckingSummaryDaoImpl;
import com.region01.cardholder.statement.checking.model.CheckingChargeBean;
import com.region01.cardholder.statement.checking.model.CheckingDetailBean;
import com.region01.cardholder.statement.checking.model.CheckingSummaryBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;

@Controller
public class CheckingStatementController {

	 private static final Log log = LogFactory.getLog(CheckingStatementController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	 
	 @Autowired
	 CheckingSummaryDaoImpl	checkingSummaryDao;	
	 
	 @Autowired
	 CheckingDetailDaoImpl	checkingDetailDao;	
	 
	 @Autowired
	 CheckingChargeDaoImpl	checkingChargeDao;	
	 
	 @Autowired
	 MenuDaoImpl			menuDao;

	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	
	@RequestMapping("/viewCheckingSummary")
	public ModelAndView viewCheckingSummary1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCheckingSummary1 " + now);
		List<CheckingSummaryBean> list=checkingSummaryDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/summary/viewCheckingSummary");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCheckingSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCheckingSummary2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCheckingSummary2 " + now);
		return new ModelAndView("redirect:/viewCheckingSummary");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/checkingSummaryForm")
	public ModelAndView checkingSummaryForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from checkingSummaryForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/checking/summary/checkingSummaryForm","command",new CheckingChargeBean());
	}
	
	@RequestMapping(value="/checkingSummaryFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView checkingSummaryForm2 (@ModelAttribute("checkingSummary") CheckingSummaryBean checking){
		String now = (new Date()).toString();
		log.info("Logging return from checkingSummaryForm2 " + now);
		checkingSummaryDao.insert(checking);
		return new ModelAndView("redirect:/viewCheckingSummary"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCheckingSummaryJSPHref/{id}")
	public ModelAndView updateCheckingSummary1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCheckingSummary1 " + now);
		CheckingSummaryBean checking = checkingSummaryDao.selectCheckingSummaryById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/summary/checkingSummaryEditForm","command",checking);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCheckingSummaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCheckingSummary(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCheckingSummary " + now);
		checkingSummaryDao.delete(id);
		return new ModelAndView("redirect:/viewCheckingSummary");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewCheckingDetail")
	public ModelAndView viewCheckingDetail1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCheckingDetail1 " + now);
		List<CheckingDetailBean> list=checkingDetailDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/detail/viewCheckingDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCheckingDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCheckingDetail2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCheckingDetail2 " + now);
		return new ModelAndView("redirect:/viewCheckingDetail");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/checkingDetailForm")
	public ModelAndView checkingDetailForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from checkingDetailForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/checking/detail/checkingDetailForm","command",new CheckingDetailBean());
	}
	
	@RequestMapping(value="/checkingDetailFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView checkingDetailForm2 (@ModelAttribute("checkingDetail") CheckingDetailBean checking){
		String now = (new Date()).toString();
		log.info("Logging return from checkingDetailForm2 " + now);
		checkingDetailDao.insert(checking);
		return new ModelAndView("redirect:/viewCheckingDetail"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCheckingDetailJSPHref/{id}")
	public ModelAndView updateCheckingDetail1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCheckingDetail1 " + now);
		CheckingDetailBean checking = checkingDetailDao.selectCheckingDetailById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/detail/checkingDetailEditForm","command",checking);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCheckingDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCheckingDetail(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCheckingDetail " + now);
		checkingDetailDao.delete(id);
		return new ModelAndView("redirect:/viewCheckingDetail");
	}
	
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewCheckingCharge")
	public ModelAndView viewCheckingCharge1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCheckingCharge1 " + now);
		List<CheckingChargeBean> list=checkingChargeDao.select();
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/charge/viewCheckingCharge");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCheckingChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCheckingCharge2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCheckingCharge2 " + now);
		return new ModelAndView("redirect:/viewCheckingCharge");
	}
  
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/checkingChargeForm")
	public ModelAndView checkingChargeForm1(){
		String now = (new Date()).toString();
		log.info("Logging return from checkingChargeForm1 " + now);
		return new ModelAndView("region01/cardholder/statement/checking/charge/checkingChargeForm","command",new CheckingChargeBean());
	}
	
	@RequestMapping(value="/checkingChargeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView checkingChargeForm2 (@ModelAttribute("checkingCharge") CheckingChargeBean checking){
		String now = (new Date()).toString();
		log.info("Logging return from checkingChargeForm2 " + now);
		checkingChargeDao.insert(checking);
		return new ModelAndView("redirect:/viewCheckingCharge"); 
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCheckingChargeJSPHref/{id}")
	public ModelAndView updateCheckingCharge1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCheckingCharge1 " + now);
		CheckingChargeBean checking = checkingChargeDao.selectCheckingChargeById(id);
		ModelAndView model = new ModelAndView("region01/cardholder/statement/checking/charge/checkingChargeEditForm","command",checking);
		model.addObject("now", now);
		return model;		
	}
	
	//--------------------------------------------------------------------------------

	@RequestMapping(value="/deleteCheckingChargeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCheckingCharge(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCheckingCharge " + now);
		checkingChargeDao.delete(id);
		return new ModelAndView("redirect:/viewCheckingCharge");
	}
	
}
