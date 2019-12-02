package com.region02.bank.issuer.card.chipcard.web;

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

import com.region02.bank.issuer.card.chipcard.dao.ChipCardDaoImpl;
import com.region02.bank.issuer.card.chipcard.model.ChipCardBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class CardChipController {
	
	 private static final Log log = LogFactory.getLog(CardChipController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
    @Autowired
    ChipCardDaoImpl 			chipCardDao;
    
	@Autowired
	MenuDaoImpl					menuDao;
	
	/**********************************************************************************
     **********************************************************************************
     */
    
/********************************************************************************** 
 **********************************************************************************
 */
@RequestMapping("/cardMenu")
public ModelAndView cardMenu1(){
	String now = (new Date()).toString();
	log.info("Logging Return from cardMenu1 " + now);
	List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Card Menu");
	ModelAndView model = new ModelAndView("menu/maintenance/card/menu/cardMenu");
	model.addObject("list", list);
	model.addObject("now", now);
	return model;
}

@RequestMapping(value="/cardMenuJSPHref/{id}",method = RequestMethod.GET)
public ModelAndView cardMenu2(@PathVariable int id){
	String now = (new Date()).toString();
	log.info("Logging Return from cardMenu2 " + now);
	return new ModelAndView("redirect:/cardMenu");
}
	
	@RequestMapping("/viewChipCard")
	public ModelAndView viewChipCard1(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewChipCard1 " + now);
		List<ChipCardBean> list = chipCardDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chipCard/viewChipCard");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewChipCardJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewChipCard2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewChipCard2 " + now);
		return new ModelAndView("redirect:/viewChipCard");
		
	}
	
    /**********************************************************************************
     * It displays a form to input data, here "command" is a reserved request attribute
     * which is used to display object data into form
     **********************************************************************************
     */
	@RequestMapping("/chipCardForm")
	public ModelAndView showChipCardForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from chipCardForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chipCard/chipCardForm","command",new ChipCardBean());
	}
	/**********************************************************************************
	 * It saves object into database. The @ModelAttribute puts request data
	 * into model object. You need to mention RequestMethod.POST method 
	 * because default request is GET
	 **********************************************************************************
	 */
	@RequestMapping(value="/chipCardFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveChipCard(@ModelAttribute("chipCard") ChipCardBean chipCard){
		log.info("Logging Return from insertChipCard");
		chipCardDao.insert(chipCard);
		log.info("Redirect to viewChipCard3 request mapping");
		return new ModelAndView("redirect:/viewChipCard");
	}

	/********************************************************************************** 
	 * It displays object data into form for the given id. 
	 * The @PathVariable puts URL data into variable.
	 **********************************************************************************
	 */
	@RequestMapping(value="/updateChipCardJSPHref/{id}")
	public ModelAndView editChipCard(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateChipCard");
		ChipCardBean chipCard = chipCardDao.selectChipCardById(id);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chipCard/chipCardEditForm","command",chipCard);
		model.addObject("now", now);
		return model;
	}
	/********************************************************************************** 
	 * It updates model object. 
	 **********************************************************************************
	 */
	@RequestMapping(value="/chipCardEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editSaveChipCard(@ModelAttribute("chipCard") ChipCardBean chipCard){
		log.info("Logging return from chipEditForm");
		chipCardDao.update(chipCard);
		return new ModelAndView("redirect:/viewChipCard");
	}
	/********************************************************************************** 
	 * It deletes record for the given id in URL and redirects to /viewChipCard 
	 **********************************************************************************
	 */
	@RequestMapping(value="/deleteChipCardJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteChipCard(@PathVariable int id){
		log.info("Logging return from deleteChipCard");
		chipCardDao.delete(id);
		return new ModelAndView("redirect:/viewChipCard");
	}
	 
}