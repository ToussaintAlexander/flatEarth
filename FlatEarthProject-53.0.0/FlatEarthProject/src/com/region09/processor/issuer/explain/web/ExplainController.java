package com.region09.processor.issuer.explain.web;

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

import com.region07.processor.acquirer.processor.dao.Transform1DaoImpl;
import com.region07.processor.acquirer.processor.model.transform1Bean;
import com.region09.processor.issuer.explain.dao.DualElementExplainDaoImpl;
import com.region09.processor.issuer.explain.dao.DualRuleDetailExplainDaoImpl;
import com.region09.processor.issuer.explain.dao.DualRuleHeaderExplainDaoImpl;
import com.region09.processor.issuer.explain.dao.SingleRuleDetailExplainDaoImpl;
import com.region09.processor.issuer.explain.dao.SingleElementExplainDaoImpl;
import com.region09.processor.issuer.explain.dao.SingleRuleHeaderExplainDaoImpl;
import com.region09.processor.issuer.explain.model.DualElementExplainBean;
import com.region09.processor.issuer.explain.model.DualRuleDetailExplainBean;
import com.region09.processor.issuer.explain.model.DualRuleHeaderExplainBean;
import com.region09.processor.issuer.explain.model.SingleElementExplainBean;
import com.region09.processor.issuer.explain.model.SingleRuleDetailExplainBean;
import com.region09.processor.issuer.explain.model.SingleRuleHeaderExplainBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class ExplainController {
	
	 private static final Log log = LogFactory.getLog(ExplainController.class);
	
	 @Autowired
	 DualElementExplainDaoImpl 			dualElementExplainDao; 
	 
	 @Autowired
	 DualRuleHeaderExplainDaoImpl 		dualRuleHeaderExplainDao; 
	    
     @Autowired
     DualRuleDetailExplainDaoImpl 		dualRuleDetailExplainDao; 
     
	 @Autowired
	 DualRuleDetailExplainDaoImpl		dualDetailDao;
	    
	 @Autowired
	 DualRuleHeaderExplainDaoImpl		dualSummaryDao;
	 
	 @Autowired
	 MenuDaoImpl						menuDao;
	 
	 @Autowired
	 SingleElementExplainDaoImpl 		singleElementExplainDao; 
	 
	 @Autowired
	 SingleRuleHeaderExplainDaoImpl 	singleRuleHeaderExplainDao; 
	 
	 @Autowired
	 SingleRuleDetailExplainDaoImpl 	singleRuleDetailExplainDao; 

	 @Autowired
	 Transform1DaoImpl					transform1Dao;
    
     /******************************************************************************************************
      ******************************************************************************************************
      */
 	
 	@RequestMapping("/explainMenu")
 	public ModelAndView explainMenu(){
 		String now = (new Date()).toString();
 		log.info("Logging Return from explainMenu " + now);
 		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Explain Menu");
 		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/menu/explainMenu");
 		model.addObject("list", list);
 		model.addObject("now", now);
 		return model;
 	}

 	@RequestMapping(value="/explainMenuJSPHref/{id}",method = RequestMethod.GET)
 	public ModelAndView explainMenu2(@PathVariable int id){
 		String now = (new Date()).toString();
 		log.info("Logging Return from explainMenu " + now);
 		return new ModelAndView("redirect:/explainMenu");
 	}
 	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/viewSingleElement")
 	public ModelAndView viewSingleElement2 (){
 		String now = (new Date()).toString();
 		log.info("Logging return from viewSingleElement3 " + now);
 		List<SingleElementExplainBean> list = singleElementExplainDao.select();
 		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/element/elementSingleColumnListForm");
 		model.addObject("list", list);
 		model.addObject("now", now);
 		return model;
 	}
  
	@RequestMapping(value="/viewSingleElementJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSingleElement3 (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSingleElement4 " + now);
		return new ModelAndView("redirect:/viewSingleElement");
	}
 	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/singleElementExplainScreen")
	public ModelAndView singleElementExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from singleElementExplainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/singleElementExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/singleElementExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView singleElementExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from singleElementExplainScreen " + now);
		return new ModelAndView("redirect:/singleElementExplainScreen");
	}
	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/singleRuleDetailExplainScreen")
	public ModelAndView singleRuleDetailExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from singleRuleDetailExplainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/singleRuleDetailExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/singleRuleDtlExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView singleRuleDetailExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from singleRuleDetailExplainScreen " + now);
		return new ModelAndView("redirect:/singleRuleDetailExplainScreen");
	}
	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/singleRuleHeaderExplainScreen")
	public ModelAndView singleRuleHeaderExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from singleRuleHeaderExplainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/singleRuleHeaderExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/singleRuleHdrExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView singleRuleHeaderExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from singleRuleHeaderExplainScreen " + now);
		return new ModelAndView("redirect:/singleRuleHeaderExplainScreen");
	}

	
 	@RequestMapping("/viewSingleHeader")
 	public ModelAndView viewSingleHeader1 (){
 		String now = (new Date()).toString();
 		log.info("Logging return from viewSingleHeader " + now);
 		List<SingleRuleHeaderExplainBean> list=singleRuleHeaderExplainDao.select();
 		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/ruleHeader/ruleHeaderSingleColumnListForm");
 		model.addObject("list", list);
 		model.addObject("now", now);
 		return model;
 	}
 
	@RequestMapping(value="/viewSingleHeaderJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSingleHeader2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSingleHeader " + now);
		return new ModelAndView("redirect:/viewSingleHeader");
	}
 	
	//--------------------------------------------------------------------------------------------------------
 	
	@RequestMapping("/viewSingleDetail")
	public ModelAndView viewSingleDetail2 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewSingleDetail " + now);
		List<SingleRuleDetailExplainBean> list=singleRuleDetailExplainDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/ruleDetail/ruleDetailSingleColumnListForm");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewSingleDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewSingleDetail2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewSingleDetail " + now);
		return new ModelAndView("redirect:/viewSingleDetail");
	}
 	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/dualElementExplainScreen")
	public ModelAndView dualElementExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from dualElementExplainScreen " + now);
		List<transform1Bean> list=transform1Dao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/dualElementExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/dualElementExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView dualElementExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from dualElementExplainScreen " + now);
		return new ModelAndView("redirect:/dualElementExplainScreen");
	}
	
 	@RequestMapping("/viewDualElement")
 	public ModelAndView viewDualElement1 (){
 		String now = (new Date()).toString();
 		log.info("Logging return from viewDualElement " + now);
 		List<DualElementExplainBean> list=dualElementExplainDao.select();
 		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/element/elementDualColumnListForm");
 		model.addObject("list", list);
 		model.addObject("now", now);
 		return model;
 	}
  
	@RequestMapping(value="/viewDualElementJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewDualElement2 (@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewDualElement " + now);
		return new ModelAndView("redirect:/viewDualElement");
	}
 	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/dualRuleHeaderExplainScreen")
	public ModelAndView dualRuleHeaderExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from dualRuleHeaderExplainScreen " + now);
		List<DualRuleHeaderExplainBean> list=dualSummaryDao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/dualRuleHeaderExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/dualRuleHdrExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView dualRuleHeaderExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from dualRuleHeaderExplainScreen " + now);
		return new ModelAndView("redirect:/dualRuleHeaderExplainScreen");
	}
	
 	@RequestMapping("/viewDualHeader")
 	public ModelAndView viewDualHeader1 (){
 		String now = (new Date()).toString();
 		log.info("Logging return from viewDualHeader " + now);
 		List<DualRuleHeaderExplainBean> list=dualRuleHeaderExplainDao.select();
 		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/ruleHeader/ruleHeaderDualColumnListForm");
 		model.addObject("list", list);
 		model.addObject("now", now);
 		return model;
 	}
 
	@RequestMapping(value="/viewDualHeaderJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewDualHeader2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewDualHeader " + now);
		return new ModelAndView("redirect:/viewDualHeader");
	}
 	
	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/dualRuleDetailExplainScreen")
	public ModelAndView dualRuleDetailExplainScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from dualRuleDetailExplainScreen " + now);
		List<DualRuleDetailExplainBean> list=dualDetailDao.select();
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/explain/screen/dualRuleDetailExplainScreen");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/dualRuleDtlExplnScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView dualRuleDetailExplainScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from dualRuleDetailExplainScreen " + now);
		return new ModelAndView("redirect:/dualRuleDetailExplainScreen");
	}
	
	@RequestMapping("/viewDualDetail")
	public ModelAndView viewDualDetail2 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewDualDetail " + now);
		List<DualRuleDetailExplainBean> list=dualRuleDetailExplainDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/explain/ruleDetail/ruleDetailDualColumnListForm");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewDualDetailJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewDualDetail2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewDualDetail " + now);
		return new ModelAndView("redirect:/viewDualDetail");
	}
 	
}