package com.region06.bank.acquirer.client.web;

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

import com.region06.bank.acquirer.client.dao.AcquirerDaoImpl;
import com.region06.bank.acquirer.client.model.AcquirerBean;

@Controller
public class AcquirerController {
	
	 private static final Log log = LogFactory.getLog(AcquirerController.class);
	
    @Autowired
	AcquirerDaoImpl acquirerDao; 
    
	//---------------------------------------------------------------------------------
	
	@RequestMapping("/viewAcquirer")
	public ModelAndView viewAcquirer1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAcquirer " + now);
		List<AcquirerBean> list=acquirerDao.select();
		ModelAndView model = new ModelAndView("region06/bank/acquirer/client/viewAcquirer");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewAcquirerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewAcquirer2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewAcquirer " + now);
		return new ModelAndView("redirect:/viewAcquirer");
	}
    
	//---------------------------------------------------------------------------------
	
	@RequestMapping("/acquirerForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from acquirerForm " + now);
		return new ModelAndView("region06/bank/acquirer/client/acquirerForm","command",new AcquirerBean());
	}
	
	@RequestMapping(value="/acquirerFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("acquirer") AcquirerBean acquirer){
		String now = (new Date()).toString();
		log.info("Logging return from acquirerForm " + now);
		acquirerDao.insert(acquirer);
		return new ModelAndView("redirect:/viewAcquirer");
	}

	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateAcquirerJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateAcquirer " + now);
		AcquirerBean acquirer=acquirerDao.selectAcquirerById(id);
		ModelAndView model = new ModelAndView("region06/bank/acquirer/client/acquirerEditForm","command",acquirer);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/acquirerEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("acquirer") AcquirerBean acquirer){
		String now = (new Date()).toString();
		log.info("Logging return from acquirerEditForm " + now);
		acquirerDao.update(acquirer);
		return new ModelAndView("redirect:/viewAcquirer");
	}
	 
	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteAcquirerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteAcquirer " + now);
		acquirerDao.delete(id);
		return new ModelAndView("redirect:/viewAcquirer");
	}
	
}