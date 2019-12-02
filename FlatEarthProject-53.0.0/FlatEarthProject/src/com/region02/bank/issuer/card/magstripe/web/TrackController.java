package com.region02.bank.issuer.card.magstripe.web;

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

import com.region02.bank.issuer.card.magstripe.dao.Track1DaoImpl;
import com.region02.bank.issuer.card.magstripe.dao.Track2DaoImpl;
import com.region02.bank.issuer.card.magstripe.dao.Track3DaoImpl;
import com.region02.bank.issuer.card.magstripe.model.Track1Bean;
import com.region02.bank.issuer.card.magstripe.model.Track2Bean;
import com.region02.bank.issuer.card.magstripe.model.Track3Bean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class TrackController {
	
	 private static final Log log = LogFactory.getLog(TrackController.class);
	
    @Autowired
    MenuDaoImpl		menuDao;
	 
    @Autowired
	Track1DaoImpl 	track1Dao; 
    
    @Autowired
	Track2DaoImpl 	track2Dao;
    
    @Autowired
	Track3DaoImpl 	track3Dao;
    
	/**********************************************************************************
	 **********************************************************************************
	 */  
	
	@RequestMapping("/magstripeMenu")
	public ModelAndView magstripeMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from magstripeMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Magstripe Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/card/magstripe/menu/magstripeMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/magstripeMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView magstripeMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from magstripeMenu " + now);
		return new ModelAndView("redirect:/magstripeMenu");
	}
	
	/**********************************************************************************
	 **********************************************************************************
	 */
	
	@RequestMapping("/viewTrack1")
	public ModelAndView viewTrack1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTrack1 " + now);
		List<Track1Bean> list = track1Dao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track1/viewTrack1");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/track1ScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewTrack1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTrack1 " + now);
		return new ModelAndView("redirect:/viewTrack1");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewTrack2")
	public ModelAndView viewTrack2(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTrack2 " + now);
		List<Track2Bean> list = track2Dao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track2/viewTrack2");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/track2ScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewTrack2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTrack2 " + now);
		return new ModelAndView("redirect:/viewTrack2");
		
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewTrack3")
	public ModelAndView viewTrack3(){
		String now = (new Date()).toString();
		log.info("Logging return from viewTrack3 " + now);
		List<Track3Bean> list = track3Dao.select();
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track3/viewTrack3");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/track3ScreenJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView viewTrack3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewTrack3 " + now);
		return new ModelAndView("redirect:/viewTrack3");
		
	}
	/**********************************************************************************
	 **********************************************************************************
	 */	
	@RequestMapping("/track1Form")
	public ModelAndView showformTrack1(){
		String now = (new Date()).toString();
		log.info("Logging return from track1Form " + now);
		return new ModelAndView("region02/bank/issuer/card/magstripe/track1/track1Form","command",new Track1Bean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/track2Form")
	public ModelAndView showformTrack2(){
		String now = (new Date()).toString();
		log.info("Logging return from track2Form " + now);
		return new ModelAndView("region02/bank/issuer/card/magstripe/track2/track2Form","command",new Track2Bean());
	}
	//---------------------------------------------------------------------------------
	@RequestMapping("/track3Form")
	public ModelAndView showformTrack3(){
		String now = (new Date()).toString();
		log.info("Logging return from track3Form " + now);
		return new ModelAndView("region02/bank/issuer/card/magstripe/track3/track3Form","command",new Track3Bean());
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/track1FormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveTrack1 (@ModelAttribute("track") Track1Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track1Form " + now);
		track1Dao.insert(track);
		return new ModelAndView("redirect:/viewTrack1"); 
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/track2FormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveTrack2 (@ModelAttribute("track") Track2Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track2Form " + now);
		track2Dao.insert(track);
		return new ModelAndView("redirect:/viewTrack2"); 
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/track3FormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView saveTrack3 (@ModelAttribute("track") Track3Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track3Form " + now);
		track3Dao.insert(track);
		return new ModelAndView("redirect:/viewTrack3"); 
	}
	/**********************************************************************************
	 **********************************************************************************
	 */
	@RequestMapping(value="/updateTrack1JSPHref/{id}")
	public ModelAndView editTrack1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTrack1 " + now);
		Track1Bean track1 = track1Dao.selectTrackById(id);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track1/track1EditForm","command",track1);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateTrack2JSPHref/{id}")
	public ModelAndView editTrack2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTrack2 " + now);
		Track2Bean track2 = track2Dao.selectTrackById(id);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track2/track2EditForm","command",track2);
		model.addObject("now", now);
		return model;
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/updateTrack3JSPHref/{id}")
	public ModelAndView editTrack3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateTrack3 " + now);
		Track3Bean track3 = track3Dao.selectTrackById(id);
		ModelAndView model = new ModelAndView("region02/bank/issuer/card/magstripe/track3/track3EditForm","command",track3);
		model.addObject("now", now);
		return model;
	}
	/**********************************************************************************
	 **********************************************************************************
	 */	
	@RequestMapping(value="/track1EditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveTrack1(@ModelAttribute("track") Track1Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track1EditForm " + now);
		track1Dao.update(track);
		return new ModelAndView("redirect:/viewTrack1");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/track2EditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveTrack2(@ModelAttribute("track") Track2Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track2EditForm " + now);
		track2Dao.update(track);
		return new ModelAndView("redirect:/viewTrack2");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/track3EditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsaveTrack3(@ModelAttribute("track") Track3Bean track){
		String now = (new Date()).toString();
		log.info("Logging return from track3EditForm " + now);
		track3Dao.update(track);
		return new ModelAndView("redirect:/viewTrack3");
	}
	/**********************************************************************************
	 **********************************************************************************
	 */	 
	@RequestMapping(value="/deleteTrack1JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteTrack1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTrack1 " + now);
		track1Dao.delete(id);
		return new ModelAndView("redirect:/viewTrack1");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/deleteTrack2JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteTrack2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTrack2 " + now);
		track2Dao.delete(id);
		return new ModelAndView("redirect:/viewTrack2");
	}
	//---------------------------------------------------------------------------------
	@RequestMapping(value="/deleteTrack3JSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView deleteTrack3(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteTrack3 " + now);
		track3Dao.delete(id);
		return new ModelAndView("redirect:/viewTrack3");
	}
	 
}