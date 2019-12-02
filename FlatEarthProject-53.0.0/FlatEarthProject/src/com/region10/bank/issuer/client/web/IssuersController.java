package com.region10.bank.issuer.client.web;

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

import com.region10.bank.issuer.client.dao.IssuersDaoImpl;
import com.region10.bank.issuer.client.model.IssuersBean;

@Controller
public class IssuersController {
	
	 private static final Log log = LogFactory.getLog(IssuersController.class);
	
    @Autowired
	IssuersDaoImpl issuersDao; 

	//---------------------------------------------------------------------------------
	
	@RequestMapping("/viewIssuers")
	public ModelAndView viewIssuers1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewIssuers " + now);
		List<IssuersBean> list=issuersDao.select();
		ModelAndView model = new ModelAndView("region10/bank/issuer/client/viewIssuers");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewIssuersJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewIssuers2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewIssuers " + now);
		return new ModelAndView("redirect:/viewIssuers");
	}
	
	//---------------------------------------------------------------------------------
    
	@RequestMapping("/issuersForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from issuersForm " + now);
		return new ModelAndView("region10/bank/issuer/client/issuersForm","command",new IssuersBean());
	}
	
	@RequestMapping(value="/issuersFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("issuers") IssuersBean issuers){
		String now = (new Date()).toString();
		log.info("Logging return from issuersForm " + now);
		issuersDao.insert(issuers);
		return new ModelAndView("redirect:/viewIssuers"); 
	}

	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateIssuersJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateIssuers " + now);
		IssuersBean issuers=issuersDao.selectIssuersById(id);
		ModelAndView model = new ModelAndView("region10/bank/issuer/client/issuersEditForm","command",issuers);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/issuersEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("issuers") IssuersBean issuers){
		String now = (new Date()).toString();
		log.info("Logging return from issuersEditForm " + now);
		issuersDao.update(issuers);
		return new ModelAndView("redirect:/viewIssuers");
	}
	 
	//---------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteIssuersJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteIssuers " + now);
		issuersDao.delete(id);
		return new ModelAndView("redirect:/viewIssuers");
	}

}