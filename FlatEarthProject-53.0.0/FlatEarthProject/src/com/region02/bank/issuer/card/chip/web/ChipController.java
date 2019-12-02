package com.region02.bank.issuer.card.chip.web;

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

import com.region02.bank.issuer.card.chip.dao.AmountDaoImpl;
import com.region02.bank.issuer.card.chip.dao.ApplicationDaoImpl;
import com.region02.bank.issuer.card.chip.dao.IssuerDaoImpl;
import com.region02.bank.issuer.card.chip.dao.KeysDaoImpl;
import com.region02.bank.issuer.card.chip.dao.VerificationDaoImpl;
import com.region02.bank.issuer.card.chip.model.AmountBean;
import com.region02.bank.issuer.card.chip.model.ApplicationBean;
import com.region02.bank.issuer.card.chip.model.IssuerBean;
import com.region02.bank.issuer.card.chip.model.KeysBean;
import com.region02.bank.issuer.card.chip.model.VerificationBean;
import com.region02.bank.issuer.card.chipcard.dao.ChipCardDaoImpl;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class ChipController {
	
	 private static final Log log = LogFactory.getLog(ChipController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
    @Autowired
    AmountDaoImpl		amountDao;
    @Autowired
    ApplicationDaoImpl	applicationDao;
    @Autowired
    IssuerDaoImpl		issuerDao;
    @Autowired
    KeysDaoImpl			keysDao;
    @Autowired
    VerificationDaoImpl	verificationDao;
    
    @Autowired
    ChipCardDaoImpl		chipCardDao;
    
    @Autowired
    MenuDaoImpl			menuDao;
    
    /**********************************************************************************
     * It displays a form to input data, here "command" is a reserved request attribute
     * which is used to display object data into form
     **********************************************************************************
     */
    

	@RequestMapping("/chipMenu")
	public ModelAndView chipMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from chipMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Chip Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/card/chip/menu/chipMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/chipMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView chipMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from chipMenu2 " + now);
		return new ModelAndView("redirect:/chipMenu");
	}
	
	//--------------------------------------------------------------------------------
    
	@RequestMapping("/amountScreen")
	public ModelAndView amountScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from amountScreen1 " + now);
		List<AmountBean> list=amountDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/amount/viewAmount");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/amountScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView amountScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from amountScreen2 " + now);
		return new ModelAndView("redirect:/amountScreen");
	}
    
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/applicationScreen")
	public ModelAndView applicationScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from applicationScreen " + now);
		List<ApplicationBean> list=applicationDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/application/viewApplication");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/applicationScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView applicationScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from applicationScreen " + now);
		return new ModelAndView("redirect:/applicationScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/issuerScreen")
	public ModelAndView issuerScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerScreen " + now);
		List<IssuerBean> list=issuerDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/issuer/viewIssuer");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/issuerScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView issuerScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerScreen " + now);
		return new ModelAndView("redirect:/issuerScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/keysScreen")
	public ModelAndView keysScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from keysScreen " + now);
		List<KeysBean> list=keysDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/keys/viewKeys");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/keysScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView keysScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from keysScreen " + now);
		return new ModelAndView("redirect:/keysScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/verificationScreen")
	public ModelAndView verificationScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from verificationScreen " + now);
		List<VerificationBean> list=verificationDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/verification/viewVerification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/verificationScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView verificationScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from verificationScreen " + now);
		return new ModelAndView("redirect:/verificationScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/amountForm")
	public ModelAndView showAmountForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from amountForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chip/amount/amountForm","command",new AmountBean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/applicationForm")
	public ModelAndView showApplicationForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from applicationForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chip/application/applicationForm","command",new ApplicationBean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/issuerForm")
	public ModelAndView showIssuerForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chip/issuer/issuerForm","command",new IssuerBean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/keysForm")
	public ModelAndView showKeysForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from keysForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chip/keys/keysForm","command",new KeysBean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/verificationForm")
	public ModelAndView showVerificationForm(){
		String now = (new Date()).toString();
		log.info("Logging Return from verificationForm " + now);
		return new ModelAndView("region02/bank/issuer/card/chip/verification/verificationForm","command",new VerificationBean());
	}
	/**********************************************************************************
	 * It saves object into database. The @ModelAttribute puts request data
	 * into model object. You need to mention RequestMethod.POST method 
	 * because default request is GET
	 **********************************************************************************
	 */
	@RequestMapping(value="/amountFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView insertAmount(@ModelAttribute("amount") AmountBean amount){
		log.info("Logging Return from viewAmount");
		amountDao.insert(amount);
		log.info("Redirect to viewAmount Request Mapping");
		return new ModelAndView("redirect:/viewAmount");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/applicationFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView insertApplication(@ModelAttribute("application") ApplicationBean application){
		log.info("Logging Return from viewApplication");
		applicationDao.insert(application);
		log.info("Redirect to viewApplication Request Mapping");
		return new ModelAndView("redirect:/viewApplication");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/issuerFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView insertIssuer(@ModelAttribute("issuer") IssuerBean issuer){
		log.info("Logging Return from viewIssuer");
		issuerDao.insert(issuer);
		log.info("Redirect to viewIssuer Request Mapping");
		return new ModelAndView("redirect:/viewIssuer");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/keysFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView insertKeys(@ModelAttribute("keys") KeysBean keys){
		log.info("Logging Return from viewKeys");
		keysDao.insert(keys);
		log.info("Redirect to viewKeys Request Mapping");
		return new ModelAndView("redirect:/viewKeys");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/verificationFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView insertVerification(@ModelAttribute("verification") VerificationBean verification){
		log.info("Logging Return from viewVerification");
		verificationDao.insert(verification);
		log.info("Redirect to viewVerification Request Mapping");
		return new ModelAndView("redirect:/viewVerification");
	}
	/********************************************************************************** 
	 * It provides list of scheme rows in model object 
	 **********************************************************************************
	 */
	@RequestMapping("/viewAmount")
	public ModelAndView selectAmount(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewAmount " + now);
		List<AmountBean> list = amountDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/amount/viewAmount");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/viewApplication")
	public ModelAndView selectApplication(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewApplication " + now);
		List<ApplicationBean> list = applicationDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/application/viewApplication");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/viewIssuer")
	public ModelAndView selectIssuer(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewIssuer2 " + now);
		List<IssuerBean> list = issuerDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/issuer/viewIssuer");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/viewKeys")
	public ModelAndView selectKeys(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewKeys " + now);
		List<KeysBean> list = keysDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/keys/viewKeys");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/viewVerification")
	public ModelAndView selectVerification(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewVerification " + now);
		List<VerificationBean> list = verificationDao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/verification/viewVerification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	/********************************************************************************** 
	 * It displays object data into form for the given id. 
	 * The @PathVariable puts URL data into variable.
	 **********************************************************************************
	 */
	@RequestMapping(value="/updateAmountJSPHref/{id}")
	public ModelAndView editAmount(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from amountEditForm");
		AmountBean amount = amountDao.selectAmountById(id);
		//return new ModelAndView("region02/bank/issuer/card/chip/amount/amountEditForm","command",amount);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/amount/amountEditForm","command",amount);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateApplicationJSPHref/{id}")
	public ModelAndView editApplication(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from applicationEditForm");
		ApplicationBean application = applicationDao.selectApplicationById(id);
		//return new ModelAndView("region02/bank/issuer/card/chip/application/applicationEditForm","command",application);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/application/applicationEditForm","command",application);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateIssuerJSPHref/{id}")
	public ModelAndView editIssuer(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from issuerEditForm");
		IssuerBean issuer = issuerDao.selectIssuerById(id);
		//return new ModelAndView("region02/bank/issuer/card/chip/issuer/issuerEditForm","command",issuer);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/issuer/issuerEditForm","command",issuer);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateKeysJSPHref/{id}")
	public ModelAndView editKeys(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from keysEditForm");
		KeysBean keys = keysDao.selectKeysById(id);
		//return new ModelAndView("region02/bank/issuer/card/chip/keys/keysEditForm","command",keys);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/keys/keysEditForm","command",keys);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateVerificationJSPHref/{id}")
	public ModelAndView editVerification(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from verificationEditForm");
		VerificationBean verification = verificationDao.selectVerificationById(id);
		//return new ModelAndView("region02/bank/issuer/card/chip/verification/verificationEditForm","command",verification);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/chip/verification/verificationEditForm","command",verification);
		model.addObject("now", now);
		return model;
	}
	/********************************************************************************** 
	 * It updates model object. 
	 **********************************************************************************
	 */
	@RequestMapping(value="/amountEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveAmount(@ModelAttribute("amount") AmountBean amount){
		log.info("Logging Return from amountEditForm");
		amountDao.update(amount);
		return new ModelAndView("redirect:/viewAmount");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/applicationEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveApplication(@ModelAttribute("application") ApplicationBean application){
		log.info("Logging Return from applicationEditForm");
		applicationDao.update(application);
		return new ModelAndView("redirect:/viewApplication");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/issuerEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveIssuer(@ModelAttribute("issuer") IssuerBean issuer){
		log.info("Logging Return from issuerEditForm");
		issuerDao.update(issuer);
		return new ModelAndView("redirect:/viewIssuer");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/keysEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveKeys(@ModelAttribute("keys") KeysBean keys){
		log.info("Logging Return from keysEditForm");
		keysDao.update(keys);
		return new ModelAndView("redirect:/viewKeys");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/verificationEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveVerification(@ModelAttribute("verification") VerificationBean verification){
		log.info("Logging Return from verificationEditForm");
		verificationDao.update(verification);
		return new ModelAndView("redirect:/viewVerification");
	}
	/********************************************************************************** 
	 * It deletes record for the given id in URL and redirects to /VIEWSCHEME 
	 **********************************************************************************
	 */
	@RequestMapping(value="/deleteAmountJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteAmount(@PathVariable int id){
		log.info("Logging Return from deleteAmount");
		amountDao.delete(id);
		return new ModelAndView("redirect:/viewAmount");
	}
	//--------------------------------------------------------------------------------- 
	@RequestMapping(value="/deleteApplicationJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteApplication(@PathVariable int id){
		log.info("Logging Return from deleteApplication");
		applicationDao.delete(id);
		return new ModelAndView("redirect:/viewApplication");
	}
	//--------------------------------------------------------------------------------- 
	@RequestMapping(value="/deleteIssuerJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteIssuer(@PathVariable int id){
		log.info("Logging Return from deleteIssuer");
		issuerDao.delete(id);
		return new ModelAndView("redirect:/viewIssuer");
	}
	//--------------------------------------------------------------------------------- 
	@RequestMapping(value="/deleteKeysJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteKeys(@PathVariable int id){
		log.info("Logging Return from deleteKeys");
		keysDao.delete(id);
		return new ModelAndView("redirect:/viewKeys");
	}
	//--------------------------------------------------------------------------------- 
	@RequestMapping(value="/deleteVerificationJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteVerification(@PathVariable int id){
		log.info("Logging Return from deleteVerification");
		verificationDao.delete(id);
		return new ModelAndView("redirect:/viewVerification");
	}
}