package com.region08.association.scheme.web;

import java.util.Date;

//import java.util.Date;
//import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region08.association.scheme.dao.SchemeDaoImpl;
import com.region08.association.scheme.model.SchemeBean;

@Controller
public class SchemeController {
	
	 private static final Log log = LogFactory.getLog(SchemeController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
    @Autowired
	SchemeDaoImpl dao;
    /**********************************************************************************
     * It displays a form to input data, here "command" is a reserved request attribute
     * which is used to display object data into form
     **********************************************************************************
     */
	@RequestMapping("/schemeForm")
	public ModelAndView showform(){
		log.info("Logging Return from schemeForm");
		return new ModelAndView("region08/association/scheme/schemeForm","command",new SchemeBean());
	}
	/**********************************************************************************
	 * It saves object into database. The @ModelAttribute puts request data
	 * into model object. You need to mention RequestMethod.POST method 
	 * because default request is GET
	 **********************************************************************************
	 */
	@RequestMapping(value="/schemeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("scheme") SchemeBean scheme){
		log.info("Logging Return from insertScheme");
		dao.insert(scheme);
		log.info("Redirect to viewScheme request mapping");
		return new ModelAndView("redirect:/viewScheme");
	}

	/********************************************************************************** 
	 * It displays object data into form for the given id. 
	 * The @PathVariable puts URL data into variable.
	 **********************************************************************************
	 */
	@RequestMapping(value="/updateSchemeJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateScheme");
		SchemeBean scheme=dao.selectSchemeById(id);
		//return new ModelAndView("region08/association/scheme/schemeEditForm","command",scheme);
		ModelAndView model = new ModelAndView("region08/association/scheme/schemeEditForm","command",scheme);
		model.addObject("now", now);
		return model;
	}
	/********************************************************************************** 
	 * It updates model object. 
	 **********************************************************************************
	 */
	@RequestMapping(value="/schemeEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("scheme") SchemeBean scheme){
		log.info("Logging return from schemeEditForm");
		dao.update(scheme);
		return new ModelAndView("redirect:/viewScheme");
	}
	/********************************************************************************** 
	 * It deletes record for the given id in URL and redirects to /VIEWSCHEME 
	 **********************************************************************************
	 */
	@RequestMapping(value="/deleteSchemeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		log.info("Logging return from deleteScheme");
		dao.delete(id);
		return new ModelAndView("redirect:/viewScheme");
	}
	public ModelAndView handleRequest(Object object, Object object2) {
		// TODO2 Auto-generated method stub
		return null;
	}

}