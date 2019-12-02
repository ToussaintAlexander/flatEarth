package com.system.configuration.properties.web;

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

import com.system.configuration.properties.dao.DatabasePropertiesDaoImpl;
import com.system.configuration.properties.dao.FilePropertiesDaoImpl;
import com.system.configuration.properties.model.DatabasePropertiesBean;
import com.system.configuration.properties.model.FilePropertiesBean;

@Controller
public class PropertiesController {
	
	 private static final Log log = LogFactory.getLog(PropertiesController.class);
	
    @Autowired
    DatabasePropertiesDaoImpl databasePropertiesDao; 
    @Autowired
    FilePropertiesDaoImpl filePropertiesDao; 
    
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/databasePropertiesScreen")
	public ModelAndView databasePropertiesScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from databasePropertiesScreen " + now);
		List<DatabasePropertiesBean> list=databasePropertiesDao.select();
		ModelAndView model = new ModelAndView("system/configuration/properties/database/viewDatabaseProperties");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/dbPropScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView databasePropertiesScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from databasePropertiesScreen " + now);
		return new ModelAndView("redirect:/databasePropertiesScreen");
		
	}
    
	@RequestMapping("/databasePropertiesForm")
	public ModelAndView showform1(){
		String now = (new Date()).toString();
		log.info("Logging return from databasePropertiesForm " + now);
		return new ModelAndView("system/configuration/properties/database/databasePropertiesForm","command",new DatabasePropertiesBean());
	}
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/filePropertiesScreen")
	public ModelAndView filePropertiesScreen(){
		String now = (new Date()).toString();
		log.info("Logging Return from filePropertiesScreen " + now);
		List<FilePropertiesBean> list=filePropertiesDao.select();
		ModelAndView model = new ModelAndView("system/configuration/properties/file/viewFileProperties");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/filePropertiesScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView filePropertiesScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from filePropertiesScreen " + now);
		return new ModelAndView("redirect:/filePropertiesScreen");
		
	}
	
	@RequestMapping("/filePropertiesForm")
	public ModelAndView showform2(){
		String now = (new Date()).toString();
		log.info("Logging return from filePropertiesForm " + now);
		return new ModelAndView("system/configuration/properties/file/filePropertiesForm","command",new FilePropertiesBean());
	}
	
	//------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/databasePropertiesFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save2 (@ModelAttribute("databaseProperties") DatabasePropertiesBean databaseProperties){
		String now = (new Date()).toString();
		log.info("Logging return from databasePropertiesForm " + now);
		databasePropertiesDao.insert(databaseProperties);
		return new ModelAndView("redirect:/viewDatabaseProperties"); 
	}
	
	@RequestMapping(value="/filePropertiesFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save1 (@ModelAttribute("fileProperties") FilePropertiesBean fileProperties){
		String now = (new Date()).toString();
		log.info("Logging return from filePropertiesForm " + now);
		filePropertiesDao.insert(fileProperties);
		return new ModelAndView("redirect:/viewFileProperties"); 
	}
	
	//------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewDatabaseProperties")
	public ModelAndView view1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewDatabaseProperties " + now);
		List<DatabasePropertiesBean> list=databasePropertiesDao.select();
		ModelAndView model = new ModelAndView("system/configuration/properties/database/viewDatabaseProperties");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping("/viewFileProperties")
	public ModelAndView view2(){
		String now = (new Date()).toString();
		log.info("Logging return from viewFileProperties " + now);
		List<FilePropertiesBean> list=filePropertiesDao.select();
		ModelAndView model = new ModelAndView("system/configuration/properties/file/viewFileProperties");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	//------------------------------------------------------------------------------------------------

	@RequestMapping(value="/updateDatabasePropertiesJSPHref/{id}")
	public ModelAndView edit1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateDatabaseProperties " + now);
		DatabasePropertiesBean databaseProperties=databasePropertiesDao.selectDatabasePropertiesById(id);
		ModelAndView model = new ModelAndView("system/configuration/properties/database/databasePropertiesEditForm","command",databaseProperties);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/updateFilePropertiesJSPHref/{id}")
	public ModelAndView edit2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateFileProperties " + now);
		FilePropertiesBean fileProperties=filePropertiesDao.selectFilePropertiesById(id);
		ModelAndView model = new ModelAndView("system/configuration/properties/file/filePropertiesEditForm","command",fileProperties);
		model.addObject("now", now);
		return model;
	}
	
	//------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/databasePropertiesEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave1(@ModelAttribute("databaseProperties") DatabasePropertiesBean databaseProperties){
		String now = (new Date()).toString();
		log.info("Logging return from databasePropertiesEditForm " + now);
		databasePropertiesDao.update(databaseProperties);
		return new ModelAndView("redirect:/viewDatabaseProperties");
	}
	
	@RequestMapping(value="/filePropertiesEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave2(@ModelAttribute("fileProperties") FilePropertiesBean fileProperties){
		String now = (new Date()).toString();
		log.info("Logging return from filePropertiesEditForm " + now);
		filePropertiesDao.update(fileProperties);
		return new ModelAndView("redirect:/viewFileProperties");
	}
	
	//------------------------------------------------------------------------------------------------
	 
	@RequestMapping(value="/deleteDatabasePropertiesJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteDatabaseProperties " + now);
		databasePropertiesDao.delete(id);
		return new ModelAndView("redirect:/viewDatabaseProperties");
	}
	
	@RequestMapping(value="/deleteFilePropertiesJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteFileProperties " + now);
		filePropertiesDao.delete(id);
		return new ModelAndView("redirect:/viewFileProperties");
	}

}