package com.system.message.routine.web;

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

import com.system.message.routine.dao.RoutineDaoImpl;
import com.system.message.routine.model.RoutineBean;

@Controller
public class RoutineController {
	
	 private static final Log log = LogFactory.getLog(RoutineController.class);
	
    @Autowired
	RoutineDaoImpl routineDao; 
    
	@RequestMapping("/routineForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from routineForm " + now);
		return new ModelAndView("system/message/routine/routineForm","command",new RoutineBean());
	}
	
	@RequestMapping(value="/routineFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("routine") RoutineBean routine){
		String now = (new Date()).toString();
		log.info("Logging return from routineForm " + now);
		routineDao.insert(routine);
		return new ModelAndView("redirect:/viewRoutine");
	}
	
	@RequestMapping("/viewRoutine")
	public ModelAndView viewRoutine(){
		String now = (new Date()).toString();
		log.info("Logging return from viewRoutine " + now);
		List<RoutineBean> list=routineDao.select();
		ModelAndView model = new ModelAndView("system/message/routine/viewRoutine");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/updateRoutineJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateRoutine " + now);
		RoutineBean routine=routineDao.selectRoutineById(id);
		return new ModelAndView("system/message/routine/routineEditForm","command",routine);
	}
	
	@RequestMapping(value="/routineEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("routine") RoutineBean routine){
		String now = (new Date()).toString();
		log.info("Logging return from routineEditForm " + now);
		routineDao.update(routine);
		return new ModelAndView("redirect:/viewRoutine");
	}
	 
	@RequestMapping(value="/deleteRoutineJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRoutine " + now);
		routineDao.delete(id);
		return new ModelAndView("redirect:/viewRoutine");
	}

}