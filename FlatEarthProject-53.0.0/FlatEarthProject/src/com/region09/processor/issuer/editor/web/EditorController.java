package com.region09.processor.issuer.editor.web;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region09.processor.issuer.editor.dao.ElementEditorDaoImpl;
import com.region09.processor.issuer.editor.dao.RuleDetailEditorDaoImpl;
import com.region09.processor.issuer.editor.dao.RuleHeaderEditorDaoImpl;
import com.region09.processor.issuer.editor.model.ElementEditorBean;
import com.region09.processor.issuer.editor.model.RuleDetailEditorBean;
import com.region09.processor.issuer.editor.model.RuleHeaderEditorBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class EditorController {
	
	 private static final Log log = LogFactory.getLog(EditorController.class);
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	 
	 @Autowired
	 ElementEditorDaoImpl 		elementEditorDao; 
    
	 @Autowired
 	 RuleHeaderEditorDaoImpl 	ruleHeaderEditorDao; 
    
	 @Autowired
 		RuleDetailEditorDaoImpl ruleDetailEditorDao;
    
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/editorMenu")
	public ModelAndView editorMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from editorMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Editor Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/editor/menu/editorMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/editorMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView editorMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from editorMenu2 " + now);
		return new ModelAndView("redirect:/editorMenu");
	}
	
	//--------------------------------------------------------------------------------------------------------
    
	@RequestMapping("/viewElementEditor")
	public ModelAndView viewElementEditor1(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewElementEditor1 " + now);
		List<ElementEditorBean> list = elementEditorDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/element/viewElementEditor");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/elementEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView elementEditorScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewElementEditor2 " + now);
		return new ModelAndView("redirect:/viewElementEditor");
	}

	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateElementEditorJSPHref/{id}")
	public ModelAndView viewElementEditor2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from elementEditorEditForm " + now);
		ElementEditorBean element=elementEditorDao.selectElementEditorById(id);
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/element/elementEditorEditForm","command",element);
		model.addObject("now", now);
		return model;
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteElementEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteElementEditor " + now);
		elementEditorDao.delete(id);
		return new ModelAndView("redirect:/viewElementEditor");
	}
	
	//--------------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewRuleHeaderEditor")
	public ModelAndView viewRuleHeaderEditor1(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewRuleHeaderEditor1 " + now);
		List<RuleHeaderEditorBean> list=ruleHeaderEditorDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/ruleHeader/viewRuleHeaderEditor");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/ruleHeaderEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewRuleHeaderEditor2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewRuleHeaderEditor2 " + now);
		return new ModelAndView("redirect:/viewRuleHeaderEditor");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateRuleHeaderEditorJSPHref/{id}")
	public ModelAndView ruleHeaderEditEditorForm1 (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from ruleHeaderEditEditorForm " + now);
		RuleHeaderEditorBean ruleHeaderEditor = ruleHeaderEditorDao.selectRuleHeaderEditorById(id);
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/ruleHeader/ruleHeaderEditEditorForm","command",ruleHeaderEditor);
		model.addObject("now", now);
		return model;
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteRuleHeaderEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRuleHeader " + now);
		ruleHeaderEditorDao.delete(id);
		return new ModelAndView("redirect:/viewRuleHeaderEditor");
	}
	
	//--------------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewRuleDetailEditor")
	public ModelAndView ruleDetailEditorScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewRuleDetailEditor1 " + now);
		List<RuleDetailEditorBean> list=ruleDetailEditorDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/ruleDetail/viewRuleDetailEditor");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/ruleDetailEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView ruleDetailEditorScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewRuleDetailEditor2 " + now);
		return new ModelAndView("redirect:/viewRuleDetailEditor");
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateRuleDetailEditorJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from elementEditorEditForm " + now);
		RuleDetailEditorBean element = ruleDetailEditorDao.selectRuleDetailEditorById(id);
		ModelAndView model = new ModelAndView("region09/processor/issuer/editor/ruleDetail/ruleDetailEditEditorForm","command",element);
		model.addObject("now", now);
		return model;
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteRuleDetailEditorJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteRuleDetail(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteRuleDetail " + now);
		ruleDetailEditorDao.delete(id);
		return new ModelAndView("redirect:/viewRuleDetailEditor");
	}
	
}