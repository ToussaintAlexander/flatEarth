package com.system.message.rule.header.web;

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

import com.system.message.rule.header.dao.RuleHeaderDaoImpl;
import com.system.message.rule.header.model.RuleHeaderBean;

@Controller
public class RuleHeaderController {
	
	 private static final Log log = LogFactory.getLog(RuleHeaderController.class);
	
    @Autowired
	RuleHeaderDaoImpl ruleHeaderDao; 
    

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/ruleHeaderScreen")
	public ModelAndView ruleHeaderScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from ruleHeaderScreen " + now);
		List<RuleHeaderBean> list=ruleHeaderDao.select();
		ModelAndView model = new ModelAndView("system/message/ruleHeader/viewRuleHeader");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/ruleHeaderScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView ruleHeaderScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from ruleHeaderScreen " + now);
		return new ModelAndView("redirect:/ruleHeaderScreen");
		
	}
    
	@RequestMapping("/ruleHeaderForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from ruleHeaderForm " + now);
		return new ModelAndView("system/message/element/rule/header/ruleHeaderForm","command",new RuleHeaderBean());
	}
	
	@RequestMapping(value="/ruleHeaderFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("ruleHeader") RuleHeaderBean ruleHeader){
		String now = (new Date()).toString();
		log.info("Logging return from ruleHeaderForm " + now);
		ruleHeaderDao.insert(ruleHeader);
		return new ModelAndView("redirect:/viewRuleHeader"); 
	}
	
	@RequestMapping("/viewRuleHeader")
	public ModelAndView viewRuleHeader(){
		String now = (new Date()).toString();
		log.info("Logging return from viewRuleHeader " + now);
		List<RuleHeaderBean> list=ruleHeaderDao.select();
		ModelAndView model = new ModelAndView("system/message/element/rule/header/viewRuleHeader");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateRuleHeaderJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateRuleHeader " + now);
		RuleHeaderBean ruleHeader=ruleHeaderDao.selectRuleHeaderById(id);
		//return new ModelAndView("system/message/ruleHeader/ruleHeaderEditForm","command",ruleHeader);
		ModelAndView model = new ModelAndView("system/message/ruleHeader/ruleHeaderEditForm","command",ruleHeader);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/ruleHeaderEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("ruleHeader") RuleHeaderBean ruleHeader){
		String now = (new Date()).toString();
		log.info("Logging return from ruleHeaderEditForm " + now);
		ruleHeaderDao.update(ruleHeader);
		return new ModelAndView("redirect:/viewRuleHeader");
	}
	 
	@RequestMapping(value="/deleteRuleHeaderJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRuleHeader " + now);
		ruleHeaderDao.delete(id);
		return new ModelAndView("redirect:/viewRuleHeader");
	}

}