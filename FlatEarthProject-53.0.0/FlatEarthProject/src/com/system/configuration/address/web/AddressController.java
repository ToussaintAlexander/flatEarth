package com.system.configuration.address.web;

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

import com.system.configuration.address.dao.AddressDaoImpl;
import com.system.configuration.address.model.AddressBean;
@Controller
public class AddressController {
	
	 private static final Log log = LogFactory.getLog(AddressController.class);
	
    @Autowired
	AddressDaoImpl addressDao; 
    
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/addressScreen")
	public ModelAndView addressScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from addressScreen " + now);
		List<AddressBean> list=addressDao.select();
		ModelAndView model = new ModelAndView("system/configuration/address/viewAddress");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/addressScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView addressScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from addressScreen " + now);
		return new ModelAndView("redirect:/addressScreen");
		
	}
    
	@RequestMapping("/addressForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from addressForm " + now);
		return new ModelAndView("system/configuration/address/addressForm","command",new AddressBean());
	}
	
	@RequestMapping(value="/addressFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("address") AddressBean address){
		String now = (new Date()).toString();
		log.info("Logging return from addressForm " + now);
		addressDao.insert(address);
		return new ModelAndView("redirect:/viewAddress"); 
	}
	
	@RequestMapping("/viewAddress")
	public ModelAndView viewAddress(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAddress " + now);
		List<AddressBean> list=addressDao.select();
		ModelAndView model = new ModelAndView("system/configuration/address/viewAddress");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateAddressJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateAddress " + now);
		AddressBean address=addressDao.getAddressById(id);
		ModelAndView model = new ModelAndView("system/configuration/address/addressEditForm","command",address);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/addressEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("address") AddressBean address){
		String now = (new Date()).toString();
		log.info("Logging return from addressEditForm " + now);
		addressDao.update(address);
		return new ModelAndView("redirect:/viewAddress");
	}
	 
	@RequestMapping(value="/deleteAddressJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteAddress " + now);
		addressDao.delete(id);
		return new ModelAndView("redirect:/viewAddress");
	}

}