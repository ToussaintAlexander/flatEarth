package com.region08.association.letter.requirements.web;

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

import com.region08.association.letter.requirements.dao.FieldEditDetailDaoImpl;
import com.region08.association.letter.requirements.dao.FieldEditElementDaoImpl;
import com.region08.association.letter.requirements.dao.FieldEditHeaderDaoImpl;
import com.region08.association.letter.requirements.dao.FieldEditRoutineDaoImpl;
import com.region08.association.letter.requirements.dao.RejectCodeDaoImpl;
import com.region08.association.letter.requirements.dao.UsageDaoImpl;
import com.region08.association.letter.requirements.dao.ValidCodeDaoImpl;
import com.region08.association.letter.requirements.model.FieldEditDetailBean;
import com.region08.association.letter.requirements.model.FieldEditElementBean;
import com.region08.association.letter.requirements.model.FieldEditHeaderBean;
import com.region08.association.letter.requirements.model.RejectCodeBean;
import com.region08.association.letter.requirements.model.UsageBean;
import com.region08.association.letter.requirements.model.ValidCodeBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class RequirementsController {

	 private static final Log log = LogFactory.getLog(RequirementsController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	    @Autowired
		FieldEditDetailDaoImpl 		fieldEditDetailDao; 
	    @Autowired
	    FieldEditElementDaoImpl		fieldEditElementDao;
	    @Autowired
	    FieldEditHeaderDaoImpl 		fieldEditHeaderDao; 
	    @Autowired
	    FieldEditRoutineDaoImpl 	fieldEditRoutineDao; 

		@Autowired
		MenuDaoImpl					menuDao;	

	    @Autowired
		RejectCodeDaoImpl 			rejectCodeDao; 

	    @Autowired
	 	UsageDaoImpl 				usageDao; 
	    @Autowired
	 	ValidCodeDaoImpl 			validCodeDao; 

	/********************************************************************************** 
	**********************************************************************************
	*/

		@RequestMapping("/requirementMenu")
		public ModelAndView requirementMenu1() {
			String now = (new Date()).toString();
			log.info("Logging Return from requirementMenu " + now);
			List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Requirement Menu");
			ModelAndView model = new ModelAndView("menu/maintenance/association/menu/requirementMenu");
			model.addObject("list", list);
			model.addObject("now", now);
			return model;
		}

		@RequestMapping(value = "/requirements117MenuJSPHref/{id}", method = RequestMethod.GET)
		public ModelAndView requirementMenu2(@PathVariable int id) {
			String now = (new Date()).toString();
			log.info("Logging Return from requirementMenu " + now);
			return new ModelAndView("redirect:/requirementMenu");
		}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewUsage")
	public ModelAndView viewUsage1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewUsage " + now);
		List<UsageBean> list = usageDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/usage/viewUsage");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/usageScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewUsage2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewUsage " + now);
		return new ModelAndView("redirect:/viewUsage");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateUsageJSPHref/{id}")
	public ModelAndView editUsage(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateUsage " + now);
		UsageBean usage = usageDao.selectUsageById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/usage/usageEditForm", "command", usage);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewFieldEditDetail")
	public ModelAndView viewFieldEditDetail1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewFieldEditDetail " + now);
		List<FieldEditDetailBean> list = fieldEditDetailDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditDetail/viewFieldEditDetail");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/fieldEditDetailScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewFieldEditDetail2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewFieldEditDetail " + now);
		return new ModelAndView("redirect:/viewFieldEditDetail");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/fieldEditDetailEditFormJSPHref/{id}")
	public ModelAndView fieldEditDetailEditForm(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from fieldEditDetailEditForm " + now);
		FieldEditDetailBean fieldEditDetail = fieldEditDetailDao.selectFieldEditDetailById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditDetail/fieldEditDetailEditForm", "command", fieldEditDetail);
		model.addObject("now", now);
		return model;
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewFieldEditElement")
	public ModelAndView viewFieldEditElement1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewFieldEditElement " + now);
		List<FieldEditElementBean> list = fieldEditElementDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditElement/viewFieldEditElement");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/fieldEditElementScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewFieldEditElement2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewFieldEditElement " + now);
		return new ModelAndView("redirect:/viewFieldEditElement");
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/fieldEditElementEditFormJSPHref/{id}")
	public ModelAndView fieldEditElementEditForm(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from fieldEditElementEditForm " + now);
		FieldEditElementBean fieldEditElement = fieldEditElementDao.selectFieldEditElementById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditElement/fieldEditElementEditForm", "command", fieldEditElement);
		model.addObject("now", now);
		return model;
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewFieldEditHeader")
	public ModelAndView viewFieldEditHeader1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewFieldEditHeader " + now);
		List<FieldEditHeaderBean> list = fieldEditHeaderDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditHeader/viewFieldEditHeader");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/fieldEditHeaderScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewFieldEditHeader2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewFieldEditHeader " + now);
		return new ModelAndView("redirect:/viewFieldEditHeader");
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateFieldEditHeaderEditJSPHref/{id}")
	public ModelAndView updateFieldEditHeaderEdit(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from fieldEditHeaderEditForm " + now);
		FieldEditHeaderBean fieldEditHeader = fieldEditHeaderDao.selectFieldEditHeaderById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditHeader/fieldEditHeaderEditForm", "command", fieldEditHeader);
		model.addObject("now", now);
		return model;
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewFieldEditRoutine")
	public ModelAndView viewFieldEditRoutine1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewFieldEditRoutine " + now);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/fieldEditRoutine/viewFieldEditRoutine");
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/fieldEditRoutineScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewFieldEditRoutine2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewFieldEditRoutine " + now);
		return new ModelAndView("redirect:/viewFieldEditRoutine");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewValidCode")
	public ModelAndView viewValidCode1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewValidCode " + now);
		List<ValidCodeBean> list = validCodeDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/validCode/viewValidCode");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/validCodeScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewValidCode2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewValidCode " + now);
		return new ModelAndView("redirect:/viewValidCode");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/validCodeFormJSPHref/{id}")
	public ModelAndView validCodeForm(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from validCodeForm " + now);
		ValidCodeBean validCode = validCodeDao.selectValidCodeById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/validCode/validCodeEditForm", "command", validCode);
		model.addObject("now", now);
		return model;
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewRejectCode")
	public ModelAndView viewRejectCode1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewRejectCode " + now);
		List<RejectCodeBean> list = rejectCodeDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/rejectCode/viewRejectCode");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/rejectCodeScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewRejectCode2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewRejectCode " + now);
		return new ModelAndView("redirect:/viewRejectCode");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/rejectCodeEditFormJSPHref/{id}")
	public ModelAndView rejectCodeForm(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from rejectCodeForm " + now);
		RejectCodeBean rejectCode = rejectCodeDao.selectRejectCodeById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/requirements/rejectCode/rejectCodeEditForm", "command", rejectCode);
		model.addObject("now", now);
		return model;
	}

}