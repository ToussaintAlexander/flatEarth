package com.region08.association.certification.web;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region08.association.certification.dao.CertificationDaoImpl;
import com.region08.association.certification.model.CertificationBean;

@Controller
public class CertificationController {
	
	 private static final Log log = LogFactory.getLog(CertificationController.class);
	
    @Autowired
	CertificationDaoImpl certificationDao; 
    
	@RequestMapping("/certificationForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from certificationForm " + now);
		return new ModelAndView("region08/association/certification/certificationForm","command",new CertificationBean());
	}
	
	@RequestMapping(value="/certificationFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("certification") CertificationBean certification){
		String now = (new Date()).toString();
		log.info("Logging return from certificationForm " + now);
		certificationDao.insert(certification);
		return new ModelAndView("redirect:/viewCertification"); 
	}
/*	
	@RequestMapping("/viewCertification")
	public ModelAndView viewCertification1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCertification " + now);
		List<CertificationBean> list=certificationDao.select();
		ModelAndView model = new ModelAndView("region08/association/certification/viewCertification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/viewCertificationJSPPostAction",method = RequestMethod.POST)
	public ModelAndView viewCertification2 (@ModelAttribute("certification") CertificationBean certification){
		String now = (new Date()).toString();
		log.info("Logging return from viewCertification " + now);
		return new ModelAndView("redirect:/viewCertification"); 
	}
*/	
	@RequestMapping(value="/updateCertificationJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCertification " + now);
		CertificationBean certification=certificationDao.selectCertificationById(id);
		//return new ModelAndView("region08/association/certification/certificationEditForm","command",certification);
		ModelAndView model = new ModelAndView("region08/association/certification/certificationEditForm","command",certification);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/certificationEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("certification") CertificationBean certification){
		String now = (new Date()).toString();
		log.info("Logging return from certificationEditForm " + now);
		certificationDao.update(certification);
		return new ModelAndView("redirect:/viewCertification");
	}
	 
	@RequestMapping(value="/deleteCertificationJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCertification " + now);
		certificationDao.delete(id);
		return new ModelAndView("redirect:/viewCertification");
	}

}