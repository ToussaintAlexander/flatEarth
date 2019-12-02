package com.region05.merchant.retailer.invoice.web;

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

import com.region05.merchant.retailer.invoice.dao.InvoicePart1DaoImpl;
import com.region05.merchant.retailer.invoice.dao.InvoicePart2DaoImpl;
import com.region05.merchant.retailer.invoice.dao.InvoicePart3DaoImpl;
import com.region05.merchant.retailer.invoice.model.InvoicePart1Bean;
import com.region05.merchant.retailer.invoice.model.InvoicePart2Bean;
import com.region05.merchant.retailer.invoice.model.InvoicePart3Bean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class InvoiceController {
	
	 private static final Log log = LogFactory.getLog(InvoiceController.class);
	
	 @Autowired
	 MenuDaoImpl			menuDao;
	 
    @Autowired
	InvoicePart1DaoImpl 	invoicePart1Dao; 
 
    @Autowired
	InvoicePart2DaoImpl 	invoicePart2Dao; 
	 
    @Autowired
	InvoicePart3DaoImpl 	invoicePart3Dao; 
    
	@RequestMapping("/invoiceMenu")
	public ModelAndView invoiceMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from invoiceMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Invoice Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/merchant/invoice/invoiceMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/invoiceMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView invoiceMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from invoiceMenu2 " + now);
		return new ModelAndView("redirect:/invoiceMenu");
	}
    
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewInvoicePart1")
	public ModelAndView viewInvoicePart11(){
		String now = (new Date()).toString();
		log.info("Logging return from viewInvoicePart1 " + now);
		List<InvoicePart1Bean> list=invoicePart1Dao.select();
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart1/viewInvoicePart1");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewInvoicePart1JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewInvoicePart12(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewInvoicePart1 " + now);
		return new ModelAndView("redirect:/viewInvoicePart1");
	}
	
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateInvoicePart1JSPHref/{id}")
	public ModelAndView invoicePart1EditForm (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from invoicePart1EditForm " + now);
		InvoicePart1Bean invoicePart1=invoicePart1Dao.selectInvoicePart1ById(id);
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart1/invoicePart1EditForm","command",invoicePart1);
		model.addObject("now", now);
		return model;
	}
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewInvoicePart2")
	public ModelAndView viewInvoicePart21(){
		String now = (new Date()).toString();
		log.info("Logging return from viewInvoicePart2 " + now);
		List<InvoicePart2Bean> list=invoicePart2Dao.select();
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart2/viewInvoicePart2");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewInvoicePart2JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewInvoicePart22(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewInvoicePart2 " + now);
		return new ModelAndView("redirect:/viewInvoicePart2");
	}
	
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateInvoicePart2JSPHref/{id}")
	public ModelAndView invoicePart2EditForm (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from invoicePart2EditForm " + now);
		InvoicePart2Bean invoicePart2=invoicePart2Dao.selectInvoicePart2ById(id);
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart2/invoicePart2EditForm","command",invoicePart2);
		model.addObject("now", now);
		return model;
	}
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewInvoicePart3")
	public ModelAndView viewInvoicePart31(){
		String now = (new Date()).toString();
		log.info("Logging return from viewInvoicePart31 " + now);
		List<InvoicePart3Bean> list=invoicePart3Dao.select();
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart3/viewInvoicePart3");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewInvoicePart3JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewInvoicePart32(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewInvoicePart32 " + now);
		return new ModelAndView("redirect:/viewInvoicePart3");
	}
	
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateInvoicePart3JSPHref/{id}")
	public ModelAndView invoicePart3EditForm (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from invoicePart3EditForm " + now);
		InvoicePart3Bean invoicePart3=invoicePart3Dao.selectInvoicePart3ById(id);
		ModelAndView model = new ModelAndView("region05/merchant/invoice/invoicePart3/invoicePart3EditForm","command",invoicePart3);
		model.addObject("now", now);
		return model;
	}
	
}