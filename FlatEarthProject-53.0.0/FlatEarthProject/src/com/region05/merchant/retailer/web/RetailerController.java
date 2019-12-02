package com.region05.merchant.retailer.web;

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

import com.region05.merchant.retailer.dao.RetailerDaoImpl;
import com.region05.merchant.retailer.model.RetailerBean;

@Controller
public class RetailerController {
	
	 private static final Log log = LogFactory.getLog(RetailerController.class);
	
    @Autowired
	RetailerDaoImpl retailerDao; 
    
	@RequestMapping("/viewRetailer")
	public ModelAndView viewRetailer1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewRetailer " + now);
		List<RetailerBean> list=retailerDao.select();
		ModelAndView model = new ModelAndView("region05/merchant/retailer/viewRetailer");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewRetailerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewRetailer2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewRetailer " + now);
		return new ModelAndView("redirect:/viewRetailer");
		
	}
    
	@RequestMapping("/retailerForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from retailerForm " + now);
		return new ModelAndView("region05/merchant/retailer/retailerForm","command",new RetailerBean());
	}

	@RequestMapping(value="/updateRetailerJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateRetailer " + now);
		RetailerBean retailer=retailerDao.selectRetailerById(id);
		//return new ModelAndView("region05/merchant/retailer/retailerEditForm","command",retailer);
		ModelAndView model = new ModelAndView("region05/merchant/retailer/retailerEditForm","command",retailer);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/retailerEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("retailer") RetailerBean retailer){
		String now = (new Date()).toString();
		log.info("Logging return from retailerEditForm " + now);
		retailerDao.update(retailer);
		return new ModelAndView("redirect:/viewRetailer");
	}
	 
	@RequestMapping(value="/deleteRetailerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRetailer " + now);
		retailerDao.delete(id);
		return new ModelAndView("redirect:/viewRetailer");
	}

}