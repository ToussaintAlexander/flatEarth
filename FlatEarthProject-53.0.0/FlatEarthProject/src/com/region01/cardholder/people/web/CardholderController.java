package com.region01.cardholder.people.web;

//import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Validator;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.region01.cardholder.people.dao.CardholderDaoImpl;
import com.region01.cardholder.people.model.CardholderBean;
//import com.region01.cardholder.people.model.Colour;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
//@RequestMapping("/colour.htm")
public class CardholderController {
	
	private static final Log log = LogFactory.getLog(CardholderController.class);

//  @Autowired
    //@Qualifier("CardholderValidator")
//  private Validator cardholderValidator;

    @Autowired
	CardholderDaoImpl 		cardholderDao; 

    @Autowired
    MenuDaoImpl				menuDao;
    
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
    
	@RequestMapping("/cardholderMenu")
	public ModelAndView cardholderMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from cardholderMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Cardholder Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/cardholder/menu/cardholderMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/cardholderMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView cardholderMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from cardholderMenu2 " + now);
		return new ModelAndView("redirect:/cardholderMenu");
	}
	
	//--------------------------------------------------------------------------------
    
	@RequestMapping("/viewCardholder")
	public ModelAndView viewCardholder(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCardholder2 " + now);
//		List<CardholderBean> list=cardholderDao.select();
		List<CardholderBean> list=cardholderDao.select(4, 7);
		ModelAndView model = new ModelAndView("region01/cardholder/people/viewCardholder");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewCardholderJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewCardholder2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCardholder1 " + now);
		return new ModelAndView("redirect:/viewCardholder");
	}
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/updateCardholderJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCardholderX " + now);
		CardholderBean cardholder=cardholderDao.selectCardholderById(id);
// 		ModelAndView model = new ModelAndView("region01/cardholder/people/cardholderEditForm","command",cardholder);
 		ModelAndView model = new ModelAndView("region01/cardholder/people/cardholderEditForm2","command",cardholder);
		model.addObject("now", now);
		return model;		

	}
	
	//--------------------------------------------------------------------------------
/* 	
    @InitBinder
    private void initBinder(WebDataBinder binder) {
		String now = (new Date()).toString();
		log.info("Logging Return from initBinder " + now);
        binder.setValidator(cardholderValidator);
    }
	
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		String now = (new Date()).toString();
		log.info("Logging Return from initForm " + now);
		Colour colour = new Colour();
		model.addAttribute("colour", colour);
		initModelList(model);
		return "colour";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(Model model, @Validated Colour colour, BindingResult result) {
		String now = (new Date()).toString();
		log.info("Logging Return from submitForm " + now);
		model.addAttribute("colour", colour);
		String returnVal = "successColour";
		if(result.hasErrors()) {
			initModelList(model);
			returnVal = "colour";
		} else {
			model.addAttribute("colour", colour);
		}		
		return returnVal;
	}

	private void initModelList(Model model) {
		String now = (new Date()).toString();
		log.info("Logging Return from initModelList " + now);
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("red");
		coloursList.add("green");
		coloursList.add("yellow");
		coloursList.add("pink");
		coloursList.add("blue");
		model.addAttribute("colours", coloursList);
	}
*/
}
