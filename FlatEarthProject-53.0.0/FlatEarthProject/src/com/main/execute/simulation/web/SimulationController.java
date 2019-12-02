package com.main.execute.simulation.web;

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

import com.main.execute.simulation.dao.SimulationDaoImpl;
//import com.simulation.model.SimulationBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class SimulationController {

	private static final Log log = LogFactory.getLog(SimulationController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	 @Autowired
	 SimulationDaoImpl			simulationDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/environmentMenu")
	public ModelAndView environmentMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from environmentMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Environment Menu");
		ModelAndView model = new ModelAndView("simulation/environment/menu/environmentMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/environmentMenu.htm/{id}",method = RequestMethod.GET)
	public ModelAndView environmentMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from environmentMenu2 " + now);
		return new ModelAndView("redirect:/environmentMenu");
	}

	//--------------------------------------------------------------------------------
		
	@RequestMapping("/mainMenu")
	public ModelAndView mainMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from mainMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Main Menu");
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/menu/mainMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/mainMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView mainMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from mainMenu2 " + now);
		return new ModelAndView("redirect:/mainMenu");
	}

	//--------------------------------------------------------------------------------
		
	@RequestMapping("/productionEnvironment")
	public ModelAndView productionEnvironment1(){
		String now = (new Date()).toString();
		log.info("Logging Return from productionEnvironment1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Environment Menu");
		ModelAndView model = new ModelAndView("simulation/environment/menu/environmentMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/productionEnvironmentJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView productionEnvironment2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from productionEnvironment2 " + now);
		return new ModelAndView("redirect:/productionEnvironment");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/simulationScreen")
	public ModelAndView simulationScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from simulationScreen1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Associations Menu");
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/menu/associationMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/simulationScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView simulationScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from simulationScreen2 " + now);
		return new ModelAndView("redirect:/simulationScreen");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatScreen")
	public ModelAndView diplomatScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatScreen1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Associations Menu");
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/viewsMenu/menu/viewsMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatScreen2 " + now);
		return new ModelAndView("redirect:/diplomatScreen");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportScreen")
	public ModelAndView passportScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportScreen1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Views Menu");
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/viewsMenu/menu/viewsMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportScreen2 " + now);
		return new ModelAndView("redirect:/passportScreen");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewsMenu")
	public ModelAndView viewsMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from viewsMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Views Menu");
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/viewsMenu/menu/viewsMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewsMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewsMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewsMenu2 " + now);
		return new ModelAndView("redirect:/viewsMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/actorViewScreen")
	public ModelAndView actorViewScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from actorViewScreen1 " + now);
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/viewsMenu/actorView/actorViewScreen");
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/actorViewScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView actorViewScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from actorViewScreen2 " + now);
		return new ModelAndView("redirect:/actorViewScreen");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/transactionViewScreen")
	public ModelAndView transactionViewScreen1(){
		String now = (new Date()).toString();
		log.info("Logging Return from transactionViewScreen1 " + now);
		ModelAndView model = new ModelAndView("simulation/environment/mainMenu/association/viewsMenu/transactionView/transactionViewScreen");
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/transactionViewScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView transactionViewScreen2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from transactionViewScreen2 " + now);
		return new ModelAndView("redirect:/transactionViewScreen");
	}
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/diplomatAssociation")
	public ModelAndView diplomatAssociation1(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatAssociation1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Association");
		ModelAndView model = new ModelAndView("simulation/environment/menu/environmentMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
		
	@RequestMapping(value="/diplomatAssociationJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatAssociation2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatAssociation2 " + now);
		return new ModelAndView("redirect:/diplomatAssociation");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatMenu")
	public ModelAndView diplomatMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Association Menu");
		ModelAndView model = new ModelAndView("menu/simulation/menu/diplomatMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatAssocMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatMenu2 " + now);
		return new ModelAndView("redirect:/diplomatMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatLetter181Menu")
	public ModelAndView diplomatLetter1811(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter181Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 18.1");
		ModelAndView model = new ModelAndView("menu/simulation/menu/diplomatLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatLetter181JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatLetter1812(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter181Menu2 " + now);
		return new ModelAndView("redirect:/diplomatLetter181Menu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatLetter182Menu")
	public ModelAndView diplomatLetter1821(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter182Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 18.2");
		ModelAndView model = new ModelAndView("menu/simulation/menu/diplomatLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatLetter182JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatLetter1822(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter182Menu2 " + now);
		return new ModelAndView("redirect:/diplomatLetter182Menu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatLetter191Menu")
	public ModelAndView diplomatLetter1911(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter191Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 19.1");
		ModelAndView model = new ModelAndView("menu/simulation/menu/diplomatLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatLetter191JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatLetter1912(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter191Menu2 " + now);
		return new ModelAndView("redirect:/diplomatLetter191Menu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/diplomatLetter192Menu")
	public ModelAndView diplomatLetter1921(){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter192Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 19.2");
		ModelAndView model = new ModelAndView("menu/simulation/menu/diplomatLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/diplomatLetter192JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView diplomatLetter1922(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from diplomatLetter192Menu2 " + now);
		return new ModelAndView("redirect:/diplomatLetter192Menu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportMenu")
	public ModelAndView passportMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Passport Association Menu");
		ModelAndView model = new ModelAndView("menu/simulation/menu/passportMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportAssocMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportMenu2 " + now);
		return new ModelAndView("redirect:/passportMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportLetter181Menu")
	public ModelAndView passportLetter1811(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter181Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 18.1");
		ModelAndView model = new ModelAndView("menu/simulation/menu/passportLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportLetter181JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportLetter1812(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter181Menu2 " + now);
		return new ModelAndView("redirect:/passportLetter181Menu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportLetter182Menu")
	public ModelAndView passportLetter1821(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter182Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 18.2");
		ModelAndView model = new ModelAndView("menu/simulation/menu/passportLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportLetter182JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportLetter1822(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter182Menu2 " + now);
		return new ModelAndView("redirect:/passportLetter182Menu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportLetter191Menu")
	public ModelAndView passportLetter1911(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter191Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 19.1");
		ModelAndView model = new ModelAndView("menu/simulation/menu/passportLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportLetter191JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportLetter1912(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter191Menu2 " + now);
		return new ModelAndView("redirect:/passportLetter191Menu");
	}

	//--------------------------------------------------------------------------------
	
	@RequestMapping("/passportLetter192Menu")
	public ModelAndView passportLetter1921(){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter192Menu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Diplomat Technical Letter 19.2");
		ModelAndView model = new ModelAndView("menu/simulation/menu/passportLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/passportLetter192JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView passportLetter1922(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from passportLetter192Menu2 " + now);
		return new ModelAndView("redirect:/passportLetter192Menu");
	}
	
}
