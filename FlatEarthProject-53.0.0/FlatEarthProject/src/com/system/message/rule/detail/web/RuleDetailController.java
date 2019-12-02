package com.system.message.rule.detail.web;

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

import com.system.message.rule.detail.dao.RuleDetailDaoImpl;
import com.system.message.rule.detail.model.RuleDetailBean;

@Controller
public class RuleDetailController {
	
	 private static final Log log = LogFactory.getLog(RuleDetailController.class);
	
    @Autowired
	RuleDetailDaoImpl ruleDetailDao; 
    
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/ruleDetailScreen")
	public ModelAndView ruleDetailScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from ruleDetailScreen " + now);
		List<RuleDetailBean> list=ruleDetailDao.select();
		ModelAndView model = new ModelAndView("system/message/ruleDetail/viewRuleDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/ruleDetailScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView ruleDetailScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from ruleDetailScreen " + now);
		return new ModelAndView("redirect:/ruleDetailScreen");
		
	}
    
	@RequestMapping("/ruleDetailForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from ruleDetailForm " + now);
		return new ModelAndView("system/message/ruleDetail/ruleDetailForm","command",new RuleDetailBean());
	}
	
	@RequestMapping(value="/ruleDetailFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("ruleDetail") RuleDetailBean ruleDetail){
		String now = (new Date()).toString();
		log.info("Logging return from ruleDetailForm " + now);
		ruleDetailDao.insert(ruleDetail);
		return new ModelAndView("redirect:/viewRuleDetail"); 
	}
	
	@RequestMapping("/viewRuleDetail")
	public ModelAndView viewRuleDetail(){
		String now = (new Date()).toString();
		log.info("Logging return from viewRuleDetail " + now);
		List<RuleDetailBean> list=ruleDetailDao.select();
		ModelAndView model = new ModelAndView("system/message/ruleDetail/viewRuleDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateRuleDetailJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateRuleDetail " + now);
		RuleDetailBean ruleDetail=ruleDetailDao.selectRuleDetailById(id);
		//return new ModelAndView("system/message/ruleDetail/ruleDetailEditForm","command",ruleDetail);
		ModelAndView model = new ModelAndView("system/message/ruleDetail/ruleDetailEditForm","command",ruleDetail);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/ruleDetailEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("ruleDetail") RuleDetailBean ruleDetail){
		String now = (new Date()).toString();
		log.info("Logging return from ruleDetailEditForm " + now);
		ruleDetailDao.update(ruleDetail);
		return new ModelAndView("redirect:/viewRuleDetail");
	}
	 
	@RequestMapping(value="/deleteRuleDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRuleDetail " + now);
		ruleDetailDao.delete(id);
		return new ModelAndView("redirect:/viewRuleDetail");
	}

}