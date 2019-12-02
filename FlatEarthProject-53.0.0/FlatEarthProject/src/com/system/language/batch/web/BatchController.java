package com.system.language.batch.web;

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

import com.system.language.batch.dao.BatchDaoImpl;
import com.system.language.batch.model.BatchBean;

@Controller
public class BatchController {
	
	 private static final Log log = LogFactory.getLog(BatchController.class);
	
    @Autowired
	BatchDaoImpl batchDao; 
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/batchScreen")
	public ModelAndView batchScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from batchScreen " + now);
		List<BatchBean> list=batchDao.select();
		ModelAndView model = new ModelAndView("system/language/batch/viewBatch");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/batchScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView batchScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from batchScreen " + now);
		return new ModelAndView("redirect:/batchScreen");
	}
    
	@RequestMapping("/batchForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from batchForm " + now);
		return new ModelAndView("system/language/batch/batchForm","command",new BatchBean());
	}
	
	@RequestMapping(value="/batchFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("batch") BatchBean batch){
		String now = (new Date()).toString();
		log.info("Logging return from batchForm " + now);
		batchDao.insert(batch);
		return new ModelAndView("redirect:/viewBatch"); 
	}
	
	@RequestMapping("/viewBatch")
	public ModelAndView viewBatch(){
		String now = (new Date()).toString();
		log.info("Logging return from viewBatch " + now);
		List<BatchBean> list=batchDao.select();
		ModelAndView model = new ModelAndView("system/language/batch/viewBatch");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateBatchJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateBatch " + now);
		BatchBean batch=batchDao.selectBatchById(id);
		ModelAndView model = new ModelAndView("system/language/batch/batchEditForm","command",batch);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/batchEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("batch") BatchBean batch){
		String now = (new Date()).toString();
		log.info("Logging return from batchEditForm " + now);
		batchDao.update(batch);
		return new ModelAndView("redirect:/viewBatch");
	}
	 
	@RequestMapping(value="/deleteBatchJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteBatch " + now);
		batchDao.delete(id);
		return new ModelAndView("redirect:/viewBatch");
	}

}