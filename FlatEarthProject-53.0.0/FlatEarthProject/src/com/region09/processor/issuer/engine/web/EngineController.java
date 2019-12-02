package com.region09.processor.issuer.engine.web;

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

import com.region07.processor.acquirer.processor.dao.Transform1DaoImpl;
import com.region07.processor.acquirer.processor.model.transform1Bean;
import com.region09.processor.issuer.engine.dao.EngineDaoImpl;
import com.region09.processor.issuer.engine.model.EngineBean;

@Controller
public class EngineController {
	
	 private static final Log log = LogFactory.getLog(EngineController.class);
	
    @Autowired
	EngineDaoImpl engineDao; 
    
	 @Autowired
	 Transform1DaoImpl					transform1Dao;
    
	@RequestMapping("/engineForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from engineForm " + now);
		return new ModelAndView("region09/processor/issuer/engine/engineForm","command",new EngineBean());
	}
	
	@RequestMapping(value="/engineFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("engine") EngineBean engine){
		String now = (new Date()).toString();
		log.info("Logging return from engineForm " + now);
		engineDao.insert(engine);
		return new ModelAndView("redirect:/viewEngine");
	}
	
	@RequestMapping("/viewEngine")
	public ModelAndView viewEngine(){
		String now = (new Date()).toString();
		log.info("Logging return from viewEngine " + now);
		List<EngineBean> list=engineDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/engine/viewEngine");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateEngineJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateEngine " + now);
		EngineBean engine=engineDao.selectEngineById(id);
		return new ModelAndView("region09/processor/issuer/engine/engineEditForm","command",engine);
	}
	
	@RequestMapping(value="/engineEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("engine") EngineBean engine){
		String now = (new Date()).toString();
		log.info("Logging return from engineEditForm " + now);
		engineDao.update(engine);
		return new ModelAndView("redirect:/viewEngine");
	}
	 
	@RequestMapping(value="/deleteEngineJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteEngine " + now);
		engineDao.delete(id);
		return new ModelAndView("redirect:/viewEngine");
	}


	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/backwardChainScreen")
	public ModelAndView backwardChainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from backwardChainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/engine/screen/backwardChainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/backwardChainScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView backwardChainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from backwardChainScreen " + now);
		return new ModelAndView("redirect:/backwardChainScreen");
	}
	
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/forwardChainScreen")
	public ModelAndView forwardChainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from forwardChainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/engine/screen/forwardChainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/forwardChainScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView forwardChainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from forwardChainScreen " + now);
		return new ModelAndView("redirect:/forwardChainScreen");
	}
	
	
}