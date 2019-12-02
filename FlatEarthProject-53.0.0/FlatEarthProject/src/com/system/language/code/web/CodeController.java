package com.system.language.code.web;

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

import com.system.language.code.dao.CodeDaoImpl;
import com.system.message.utilties.message.CodeBean;

@Controller
public class CodeController {
	
	 private static final Log log = LogFactory.getLog(CodeController.class);
	
    @Autowired
	CodeDaoImpl codeDao; 

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/codeScreen")
	public ModelAndView codeScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from codeScreen " + now);
		List<CodeBean> list=codeDao.select();
		ModelAndView model = new ModelAndView("system/language/code/viewCode");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/codeScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView codeScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from codeScreen " + now);
		return new ModelAndView("redirect:/codeScreen");
	}
    
	@RequestMapping("/codeForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from codeForm " + now);
		return new ModelAndView("system/language/code/codeForm","command",new CodeBean());
	}
	
	@RequestMapping(value="/codeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("code") CodeBean code){
		String now = (new Date()).toString();
		log.info("Logging return from codeForm " + now);
		codeDao.insert(code);
		return new ModelAndView("redirect:/viewCode"); 
	}
	
	@RequestMapping("/viewCode")
	public ModelAndView viewCode(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCode " + now);
		List<CodeBean> list=codeDao.select();
		ModelAndView model = new ModelAndView("system/language/code/viewCode");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateCodeJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCode " + now);
		CodeBean code=codeDao.selectCodeById(id);
		ModelAndView model = new ModelAndView("system/language/code/codeEditForm","command",code);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/codeEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("code") CodeBean code){
		String now = (new Date()).toString();
		log.info("Logging return from codeEditForm " + now);
		codeDao.update(code);
		return new ModelAndView("redirect:/viewCode");
	}
	 
	@RequestMapping(value="/deleteCodeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCode " + now);
		codeDao.delete(id);
		return new ModelAndView("redirect:/viewCode");
	}

}