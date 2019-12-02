package com.system.language.expression.web;

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

import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;

@Controller
public class ExpressionController {
	
	 private static final Log log = LogFactory.getLog(ExpressionController.class);
	
    @Autowired
	ExpressionDaoImpl expressionDao; 

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/expressionScreen")
	public ModelAndView expressionScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from expressionScreen " + now);
		List<ExpressionBean> list=expressionDao.select();
		ModelAndView model = new ModelAndView("system/language/expression/viewExpression");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/expressionScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView expressionScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from expressionScreen " + now);
		return new ModelAndView("redirect:/expressionScreen");
		
	}
    
	@RequestMapping("/expressionForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from expressionForm " + now);
		return new ModelAndView("system/language/expression/expressionForm","command",new ExpressionBean());
	}
	
	@RequestMapping(value="/expressionFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("expression") ExpressionBean expression){
		String now = (new Date()).toString();
		log.info("Logging return from expressionForm " + now);
		expressionDao.insert(expression);
		return new ModelAndView("redirect:/viewExpression"); 
	}
	
	@RequestMapping("/viewExpression")
	public ModelAndView viewExpression(){
		String now = (new Date()).toString();
		log.info("Logging return from viewExpression " + now);
		List<ExpressionBean> list=expressionDao.select();
		ModelAndView model = new ModelAndView("system/language/expression/viewExpression");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateExpressionJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateExpression " + now);
		ExpressionBean expression=expressionDao.selectExpressionById(id);
		ModelAndView model = new ModelAndView("system/language/expression/expressionEditForm","command",expression);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/expressionEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("expression") ExpressionBean expression){
		String now = (new Date()).toString();
		log.info("Logging return from expressionEditForm " + now);
		expressionDao.update(expression);
		return new ModelAndView("redirect:/viewExpression");
	}
	 
	@RequestMapping(value="/deleteExpressionJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteExpression " + now);
		expressionDao.delete(id);
		return new ModelAndView("redirect:/viewExpression");
	}

}