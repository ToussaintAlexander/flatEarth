package com.region09.processor.issuer.knowledge.web;

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

import com.region09.processor.issuer.knowledge.dao.BinLevelDaoImpl;
import com.region09.processor.issuer.knowledge.dao.CardVerificationDaoImpl;
import com.region09.processor.issuer.knowledge.dao.DomesticLimitDaoImpl;
import com.region09.processor.issuer.knowledge.dao.ForeignLimitDaoImpl;
import com.region09.processor.issuer.knowledge.model.BinLevelBean;
import com.region09.processor.issuer.knowledge.model.CardVerificationBean;
import com.region09.processor.issuer.knowledge.model.DomesticLimitBean;
import com.region09.processor.issuer.knowledge.model.ForeignLimitBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;
@Controller
public class RangeController {
	
	 private static final Log log = LogFactory.getLog(RangeController.class);
	
	    
	    @Autowired
	    BinLevelDaoImpl					binLevelDao;
	 
    @Autowired
	BinLevelDaoImpl binRangeDao; 
    @Autowired
	CardVerificationDaoImpl cardVerificationDao; 
    @Autowired
	DomesticLimitDaoImpl domesticLimitDao; 
    @Autowired
	ForeignLimitDaoImpl foreignLimitDao; 
    
    @Autowired
    MenuDaoImpl						menuDao;
    

	//--------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/knowledgeMenu")
	public ModelAndView knowledgeMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from knowledgeMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Knowledge Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/processor/menu/issuer/knowledge/menu/knowledgeMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/knowledgeMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView knowledgeMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from knowledgeMenu " + now);
		return new ModelAndView("redirect:/knowledgeMenu");
	}
    

	//--------------------------------------------------------------------------------------------------------

		@RequestMapping("/binLevelScreen")
		public ModelAndView binLevelScreen1(){
			String now = (new Date()).toString();
			log.info("Logging Return from binLevelScreen1 " + now);
			List<BinLevelBean> list=binLevelDao.select();
			ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/binLevel/viewBinLevel");
			model.addObject("list", list);
			model.addObject("now", now);
			return model;
		}

		@RequestMapping(value="/binLevelScreenJSPHref/{id}",method = RequestMethod.GET)
		public ModelAndView binLevelScreen2(@PathVariable int id){
			String now = (new Date()).toString();
			log.info("Logging Return from binLevelScreen2 " + now);
			return new ModelAndView("redirect:/binLevelScreen");
		}

		//--------------------------------------------------------------------------------------------------------

		@RequestMapping(value="/updateBINLevelJSPHref/{id}")
		public ModelAndView updateBinLevelScreen(@PathVariable int id){
			String now = (new Date()).toString();
			log.info("Logging return from binLevelEditForm " + now);
			BinLevelBean binLevel = binLevelDao.selectBinLevelById(id);
			ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/binLevel/binLevelEditForm","command",binLevel);
			model.addObject("now", now);
			return model;
		}
		
	
	@RequestMapping("/binRangeForm")
	public ModelAndView showform1(){
		String now = (new Date()).toString();
		log.info("Logging return from binRangeForm " + now);
		return new ModelAndView("region09/processor/issuer/range/binRange/binRangeForm","command",new BinLevelBean());
	}
	

	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/cardVerificationScreen")
	public ModelAndView cardVerificationScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from cardVerificationScreen1 " + now);
		List<CardVerificationBean> list=cardVerificationDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/cardVerification/viewCardVerification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/cardVerificationScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView cardVerificationScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from cardVerificationScreen2 " + now);
		return new ModelAndView("redirect:/cardVerificationScreen");
	}
	
	@RequestMapping("/cardVerificationForm")
	public ModelAndView showform2(){
		String now = (new Date()).toString();
		log.info("Logging return from cardVerificationForm " + now);
		return new ModelAndView("region09/processor/issuer/range/cardVerification/cardVerificationForm","command",new CardVerificationBean());
	}
	

	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/domesticLimitScreen")
	public ModelAndView domesticLimitScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from domesticLimitScreen1 " + now);
		List<DomesticLimitBean> list=domesticLimitDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/domesticLimit/viewDomesticLimit");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/domesticLimitScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView domesticLimitScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from domesticLimitScreen2 " + now);
		return new ModelAndView("redirect:/domesticLimitScreen");
	}
	
	@RequestMapping("/domesticLimitForm")
	public ModelAndView showform3(){
		String now = (new Date()).toString();
		log.info("Logging return from domesticLimitForm " + now);
		return new ModelAndView("region09/processor/issuer/range/domesticLimit/domesticLimitForm","command",new DomesticLimitBean());
	}
	
	//--------------------------------------------------------------------------------------------------------

	@RequestMapping("/foreignLimitScreen")
	public ModelAndView foreignLimitScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from foreignLimitScreen " + now);
		List<ForeignLimitBean> list=foreignLimitDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/foreignLimit/viewForeignLimit");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/foreignLimitScrnJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView foreignLimitScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from foreignLimitScreen " + now);
		return new ModelAndView("redirect:/foreignLimitScreen");
	}
	
	@RequestMapping("/foreignLimitForm")
	public ModelAndView showform4(){
		String now = (new Date()).toString();
		log.info("Logging return from foreignLimitForm " + now);
		return new ModelAndView("region09/processor/issuer/range/foreignLimit/foreignLimitForm","command",new ForeignLimitBean());
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/binRangeFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save1 (@ModelAttribute("binRange") BinLevelBean binRange){
		String now = (new Date()).toString();
		log.info("Logging return from binRangeForm " + now);
		binRangeDao.insert(binRange);
		return new ModelAndView("redirect:/viewBinRange"); 
	}
	
	@RequestMapping(value="/cardVerificationFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save2 (@ModelAttribute("cardVerification") CardVerificationBean cardVerification){
		String now = (new Date()).toString();
		log.info("Logging return from cardVerificationForm " + now);
		cardVerificationDao.insert(cardVerification);
		return new ModelAndView("redirect:/viewCardVerification"); 
	}
	
	@RequestMapping(value="/domesticLimitFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save3 (@ModelAttribute("domesticLimit") DomesticLimitBean domesticLimit){
		String now = (new Date()).toString();
		log.info("Logging return from domesticLimitForm " + now);
		domesticLimitDao.insert(domesticLimit);
		return new ModelAndView("redirect:/viewDomesticLimit"); 
	}
	
	@RequestMapping(value="/foreignLimitFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save4 (@ModelAttribute("foreignLimit") ForeignLimitBean foreignLimit){
		String now = (new Date()).toString();
		log.info("Logging return from foreignLimitForm " + now);
		foreignLimitDao.insert(foreignLimit);
		return new ModelAndView("redirect:/viewForeignLimit"); 
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewBinRange")
	public ModelAndView view1 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewBinRange " + now);
		List<BinLevelBean> list=binRangeDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/range/binRange/viewBinRange");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping("/viewCardVerification")
	public ModelAndView view2 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewCardVerification " + now);
		List<CardVerificationBean> list=cardVerificationDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/range/cardVerification/viewCardVerification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping("/viewDomesticLimit")
	public ModelAndView view3 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewDomesticLimit " + now);
		List<DomesticLimitBean> list=domesticLimitDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/range/domesticLimit/viewDomesticLimit");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping("/viewForeignLimit")
	public ModelAndView view4 (){
		String now = (new Date()).toString();
		log.info("Logging return from viewForeignLimit " + now);
		List<ForeignLimitBean> list=foreignLimitDao.select();
		ModelAndView model = new ModelAndView("region09/processor/issuer/range/foreignLimit/viewForeignLimit");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	//-----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateBinRangeJSPHref/{id}")
	public ModelAndView edit1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateBinRange " + now);
		BinLevelBean binRange=binRangeDao.selectBinLevelById(id);
		return new ModelAndView("region09/processor/issuer/range/binRange/binRangeEditForm","command",binRange);
	}
	
	@RequestMapping(value="/updateCardVerificationJSPHref/{id}")
	public ModelAndView edit2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCardVerification " + now);
		CardVerificationBean cardVerification=cardVerificationDao.selectCardVerificationById(id);
		//return new ModelAndView("region09/processor/issuer/knowledge/cardVerification/cardVerificationEditForm","command",cardVerification);
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/cardVerification/cardVerificationEditForm","command",cardVerification);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/updateDomesticLimitJSPHref/{id}")
	public ModelAndView edit3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateDomesticLimit " + now);
		DomesticLimitBean domesticLimit=domesticLimitDao.selectDomesticLimitById(id);
		//return new ModelAndView("region09/processor/issuer/knowledge/domesticLimit/domesticLimitEditForm","command",domesticLimit);
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/domesticLimit/domesticLimitEditForm","command",domesticLimit);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/updateForeignLimitJSPHref/{id}")
	public ModelAndView edit4(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateForeignLimit " + now);
		ForeignLimitBean foreignLimit=foreignLimitDao.selectForeignLimitById(id);
		//return new ModelAndView("region09/processor/issuer/knowledge/foreignLimit/foreignLimitEditForm","command",foreignLimit);
		ModelAndView model = new ModelAndView("region09/processor/issuer/knowledge/foreignLimit/foreignLimitEditForm","command",foreignLimit);
		model.addObject("now", now);
		return model;
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/binRangeEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave1(@ModelAttribute("binRange") BinLevelBean binRange){
		String now = (new Date()).toString();
		log.info("Logging return from binRangeEditForm " + now);
		binRangeDao.update(binRange);
		return new ModelAndView("redirect:/viewBinRange");
	}
	
	@RequestMapping(value="/cardVerificationEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave2(@ModelAttribute("cardVerification") CardVerificationBean cardVerification){
		String now = (new Date()).toString();
		log.info("Logging return from cardVerificationEditForm " + now);
		cardVerificationDao.update(cardVerification);
		return new ModelAndView("redirect:/viewCardVerification");
	}
	
	@RequestMapping(value="/domesticLimitEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave3(@ModelAttribute("domesticLimit") DomesticLimitBean domesticLimit){
		String now = (new Date()).toString();
		log.info("Logging return from domesticLimitEditForm " + now);
		domesticLimitDao.update(domesticLimit);
		return new ModelAndView("redirect:/viewDomesticLimit");
	}
	
	@RequestMapping(value="/foreignLimitEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave4(@ModelAttribute("foreignLimit") ForeignLimitBean foreignLimit){
		String now = (new Date()).toString();
		log.info("Logging return from foreignLimitEditForm " + now);
		foreignLimitDao.update(foreignLimit);
		return new ModelAndView("redirect:/viewForeignLimit");
	}
	 
	//-----------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/deleteBinRangeJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteBinRange " + now);
		binRangeDao.delete(id);
		return new ModelAndView("redirect:/viewBinRange");
	}
	
	@RequestMapping(value="/deleteCardVerificationJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCardVerification " + now);
		cardVerificationDao.delete(id);
		return new ModelAndView("redirect:/viewCardVerification");
	}
	
	@RequestMapping(value="/deleteDomesticLimitJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteDomesticLimit " + now);
		domesticLimitDao.delete(id);
		return new ModelAndView("redirect:/viewDomesticLimit");
	}
	
	@RequestMapping(value="/deleteForeignLimitJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete4(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteForeignLimit " + now);
		foreignLimitDao.delete(id);
		return new ModelAndView("redirect:/viewForeignLimit");
	}

}