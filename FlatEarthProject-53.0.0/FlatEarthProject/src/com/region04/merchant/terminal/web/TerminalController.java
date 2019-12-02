package com.region04.merchant.terminal.web;

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

import com.region04.merchant.terminal.dao.CurrencyDaoImpl;
import com.region04.merchant.terminal.dao.TerminalDaoImpl;
import com.region04.merchant.terminal.dao.TransactionDaoImpl;
import com.region04.merchant.terminal.model.CurrencyBean;
import com.region04.merchant.terminal.model.TerminalBean;
import com.region04.merchant.terminal.model.TransactionBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class TerminalController {
	
	 private static final Log log = LogFactory.getLog(TerminalController.class);
	
	 @Autowired
	 MenuDaoImpl			menuDao;
	 
    @Autowired
	CurrencyDaoImpl currencyDao; 
    @Autowired
	TerminalDaoImpl terminalDao; 
    @Autowired
	TransactionDaoImpl transactionDao; 
    
	@RequestMapping("/terminalMenu")
	public ModelAndView terminalMenu(){
		String now = (new Date()).toString();
		log.info("Logging Return from terminalMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Terminal Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/merchant/terminal/menu/terminalMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/terminalMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView terminalMenu1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from terminalMenu " + now);
		return new ModelAndView("redirect:/terminalMenu");
	}
    
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewCurrency")
	public ModelAndView viewCurrency1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewCurrency " + now);
		List<CurrencyBean> list=currencyDao.select();
		ModelAndView model = new ModelAndView("region04/merchant/terminal/currrency/viewCurrency");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewCurrencyJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView currencyScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewCurrency " + now);
		return new ModelAndView("redirect:/viewCurrency");
	}
	
	@RequestMapping("/currencyForm")
	public ModelAndView showCurrencyform(){
		String now = (new Date()).toString();
		log.info("Logging return from currencyForm " + now);
		return new ModelAndView("region04/merchant/terminal/currrency/currencyForm","command",new CurrencyBean());
	}
	
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewTerminal")
	public ModelAndView viewTerminal1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTerminal 1" + now);
		List<TerminalBean> list=terminalDao.select();
		ModelAndView model = new ModelAndView("region04/merchant/terminal/terminal/viewTerminal");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewTerminalJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewTerminal2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTerminal 2" + now);
		return new ModelAndView("redirect:/viewTerminal");
		
	}
	
	@RequestMapping("/terminalForm")
	public ModelAndView showTerminalform(){
		String now = (new Date()).toString();
		log.info("Logging return from terminalForm " + now);
		return new ModelAndView("region04/merchant/terminal/terminal/terminalForm","command",new TerminalBean());
	}
	//----------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/viewTransaction")
	public ModelAndView transactionScreen1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTransaction " + now);
		List<TransactionBean> list=transactionDao.select();
		ModelAndView model = new ModelAndView("region04/merchant/terminal/transaction/viewTransaction");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewTransactionJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView transactionScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTransaction " + now);
		return new ModelAndView("redirect:/viewTransaction");
		
	}
	
	@RequestMapping("/transactionForm")
	public ModelAndView showTransactionform(){
		String now = (new Date()).toString();
		log.info("Logging return from transactionForm " + now);
		return new ModelAndView("region04/merchant/terminal/transaction/transactionForm","command",new TransactionBean());
	}	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/currencyFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveCurrency (@ModelAttribute("currency") CurrencyBean currency){
		String now = (new Date()).toString();
		log.info("Logging return from currencyForm " + now);
		currencyDao.insert(currency);
		return new ModelAndView("redirect:/viewCurrency"); 
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/terminalFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveTerminal (@ModelAttribute("terminal") TerminalBean terminal){
		String now = (new Date()).toString();
		log.info("Logging return from terminalForm " + now);
		terminalDao.insert(terminal);
		return new ModelAndView("redirect:/viewTerminal"); 
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/transactionFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveTransaction (@ModelAttribute("transaction") TransactionBean transaction){
		String now = (new Date()).toString();
		log.info("Logging return from transactionForm " + now);
		transactionDao.insert(transaction);
		return new ModelAndView("redirect:/viewTransaction"); 
	}	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/updateCurrencyJSPHref/{id}")
	public ModelAndView editCurrency(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateCurrency " + now);
		CurrencyBean currency=currencyDao.selectCurrencyById(id);
		//return new ModelAndView("region04/merchant/terminal/currrency/currencyEditForm","command",currency);
		ModelAndView model = new ModelAndView("region04/merchant/terminal/currrency/currencyEditForm","command",currency);
		model.addObject("now", now);
		return model;
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/updateTerminalJSPHref/{id}")
	public ModelAndView editTerminal(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTerminal " + now);
		TerminalBean terminal=terminalDao.selectTerminalById(id);
		//return new ModelAndView("region04/merchant/terminal/terminal/terminalEditForm","command",terminal);
		ModelAndView model = new ModelAndView("region04/merchant/terminal/terminal/terminalEditForm","command",terminal);
		model.addObject("now", now);
		return model;
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/updateTransactionJSPHref/{id}")
	public ModelAndView editTransaction(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTransaction " + now);
		TransactionBean transaction=transactionDao.selectTransactionById(id);
		//return new ModelAndView("region04/merchant/terminal/transaction/transactionEditForm","command",transaction);
		ModelAndView model = new ModelAndView("region04/merchant/terminal/transaction/transactionEditForm","command",transaction);
		model.addObject("now", now);
		return model;
	}	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------	
	@RequestMapping(value="/currencyEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editSaveCurrency(@ModelAttribute("currency") CurrencyBean currency){
		String now = (new Date()).toString();
		log.info("Logging return from currencyEditForm " + now);
		currencyDao.update(currency);
		return new ModelAndView("redirect:/viewCurrency");
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/terminalEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editSaveTerminal(@ModelAttribute("terminal") TerminalBean terminal){
		String now = (new Date()).toString();
		log.info("Logging return from terminalEditForm " + now);
		terminalDao.update(terminal);
		return new ModelAndView("redirect:/viewTerminal");
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/transactionEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editSaveTransaction(@ModelAttribute("transaction") TransactionBean transaction){
		String now = (new Date()).toString();
		log.info("Logging return from transactionEditForm " + now);
		transactionDao.update(transaction);
		return new ModelAndView("redirect:/viewTransaction");
	}	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------	 
	@RequestMapping(value="/deleteCurrencyJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteCurrency(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteCurrency " + now);
		currencyDao.delete(id);
		return new ModelAndView("redirect:/viewCurrency");
	}
	//----------------------------------------------------------------------------------------------------------	 
	@RequestMapping(value="/deleteTerminalJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteTerminal(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTerminal " + now);
		terminalDao.delete(id);
		return new ModelAndView("redirect:/viewTerminal");
	}
	//----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/deleteTransactionJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteTransaction(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTransaction " + now);
		transactionDao.delete(id);
		return new ModelAndView("redirect:/viewTransaction");
	}
}