package com.region08.association.letter.web;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.servlet.ModelAndView;

import com.region08.association.certification.dao.CertificationDaoImpl;
import com.region08.association.certification.model.CertificationBean;
import com.region08.association.letter.dao.AcronymDaoImpl;
import com.region08.association.letter.dao.AppendixDaoImpl;
import com.region08.association.letter.dao.BusinessOverviewDaoImpl;
import com.region08.association.letter.dao.CoverDaoImpl;
import com.region08.association.letter.dao.EmpDao;
import com.region08.association.letter.dao.LetterDaoImpl;
import com.region08.association.letter.dao.MessageTypeImpactDaoImpl;
import com.region08.association.letter.dao.PlatformImpactDaoImpl;
import com.region08.association.letter.dao.ProcessingImpactDaoImpl;
import com.region08.association.letter.dao.ProcessorImpactDaoImpl;
import com.region08.association.letter.dao.RegionImpactDaoImpl;
import com.region08.association.letter.dao.RelatedDocumentDaoImpl;
import com.region08.association.letter.dao.ReleaseOverviewDaoImpl;
import com.region08.association.letter.dao.SectionDaoImpl;
import com.region08.association.letter.dao.SubSectionDaoImpl;
import com.region08.association.letter.dao.SystemImpactDaoImpl;
import com.region08.association.letter.model.AcronymBean;
import com.region08.association.letter.model.BusinessOverviewBean;
import com.region08.association.letter.model.CoverBean;
import com.region08.association.letter.model.Emp;
import com.region08.association.letter.model.MessageTypeImpactBean;
import com.region08.association.letter.model.PlatformImpactBean;
import com.region08.association.letter.model.ProcessingImpactBean;
import com.region08.association.letter.model.ProcessorImpactBean;
import com.region08.association.letter.model.RegionImpactBean;
import com.region08.association.letter.model.RelatedDocumentBean;
import com.region08.association.letter.model.SystemImpactBean;
import com.region08.association.scheme.dao.SchemeDaoImpl;
import com.region08.association.scheme.model.SchemeBean;
import com.region08.association.template.dao.TemplateDaoImpl;
import com.region08.association.template.model.TemplateBean;
import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class LetterController {

	 private static final Log log = LogFactory.getLog(LetterController.class);
	 
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	    @Autowired
		AcronymDaoImpl 				acronymDao; 
	    @Autowired
		AppendixDaoImpl 			appendixDao; 
	    @Autowired
	    BusinessOverviewDaoImpl 	businessOverviewDao; 
		@Autowired
		CertificationDaoImpl		certificationDao;	
	    @Autowired
		CoverDaoImpl 				coverDao; 

	    @Autowired
		LetterDaoImpl 				letterDao; 
		@Autowired
		MenuDaoImpl					menuDao;	
	    @Autowired
		MessageTypeImpactDaoImpl 	messageTypeImpactDao; 
	    @Autowired
	    PlatformImpactDaoImpl 		platformImpactDao; 
	    @Autowired
	    ProcessorImpactDaoImpl 		processorImpactDao;  
	    @Autowired
	    ProcessingImpactDaoImpl		processingImpactDao;  
	    @Autowired
	    RegionImpactDaoImpl 		regionImpactDao; 

	    @Autowired
		RelatedDocumentDaoImpl 		relatedDocumentDao; 
	    @Autowired
		ReleaseOverviewDaoImpl 		releaseOverviewDao; 
	    @Autowired
		SchemeDaoImpl 				schemeDao; 
	    @Autowired
		SectionDaoImpl 				sectionDao; 
	    @Autowired
		SubSectionDaoImpl 			subSectionDao; 
	    @Autowired
	 	SystemImpactDaoImpl 		systemImpactDao; 
	    @Autowired
	    TemplateDaoImpl 			templateDao; 
	    
	    @Autowired  
	    EmpDao 						empDao; 

	/********************************************************************************** 
	**********************************************************************************
	*/
	@RequestMapping("/associationMenu")
	public ModelAndView associationMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from associationMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Association Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/associationMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/associationMenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView associationMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from associationMenu2 " + now);
		return new ModelAndView("redirect:/associationMenu");
	}

	// ---------------------------------------------------------------------------------
	
	@RequestMapping("/viewCertification")
	public ModelAndView viewCertification1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewCertification " + now);
		List<CertificationBean> list = certificationDao.select();
		ModelAndView model = new ModelAndView("region08/association/certification/viewCertification");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/viewCertificationJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewCertification2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewCertification " + now);
		return new ModelAndView("redirect:/viewCertification");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/letterMenu")
	public ModelAndView letterMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from letterMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Letter Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/letterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/letterMenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView letterMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from letterMenu2 " + now);
		return new ModelAndView("redirect:/letterMenu");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/technicalLetterMenu")
	public ModelAndView technicalLetterMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from technicalLetterMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Technical Letter 17.1 Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/technicalLetterMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/letter17JSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView technicalLetterMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from technicalLetterMenu2 " + now);
		return new ModelAndView("redirect:/technicalLetterMenu");
	}

	// ---------------------------------------------------------------------------------
	// Release Overview List
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewCover")
	public String viewCover(Model model){    
		String now = (new Date()).toString();
		log.info("Logging return from View Cover " + now);
		List<CoverBean> list = coverDao.select();
		model.addAttribute("list", list);
		model.addAttribute("now", now);
		return "region08/association/letter/cover/viewCover";
	}

	@RequestMapping(value = "/coverScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewCover2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("From the Letter Menu then Redirect" + now);
		return new ModelAndView("redirect:/viewCover");
	}
	
	// ---------------------------------------------------------------------------------
	
    @RequestMapping("/coverForm")  
    public String showform(Model model){  
    	String now = (new Date()).toString();
    	log.info("Logging Return from Cover Form " + now);
    	model.addAttribute("command", new CoverBean());
    	return "region08/association/letter/cover/coverForm"; 
    } 
    
    // ---------------------------------------------------------------------------------
    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
      public String save(@ModelAttribute("cover") CoverBean cover){   
		String now = (new Date()).toString();
		log.info("Logging return from Add Cover " + now);
        coverDao.insert(cover);    
        return "redirect:/viewCover";     
    }    

    // ---------------------------------------------------------------------------------

	@RequestMapping(value="/updateCover/{id}") 
	 public String edit(@PathVariable int id, Model model){    
		String now = (new Date()).toString();
		log.info("Logging return from updateCover " + now);
		CoverBean cover = coverDao.selectCoverById(id);
		model.addAttribute("command",cover);  
		model.addAttribute("now", now);
		return "region08/association/letter/cover/coverEditForm";
	}
	
	// ---------------------------------------------------------------------------------
	
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("cover") CoverBean cover){    
    	String now = (new Date()).toString();
    	log.info("Logging return from editsave " + now);
    	
       	cover.setId(1);
    	cover.setTitle("American Express");
    	cover.setSubtitle("Technical Letter");
    	cover.setEffectiveDate("2019-10-15");
    	cover.setMajorVersion(1);
    	cover.setCreateUser("TALEXAND");
    	cover.setCreateTimestamp("2019-1115 23:59:59.123");
    	cover.setModifyUser("TALEXAND");
    	cover.setModifyTimestamp("2019-1115 23:59:59.123");	
    	
    	coverDao.update(cover);    
    	return "redirect:/viewCover"; 
    }    
	
    // ---------------------------------------------------------------------------------
    
    @RequestMapping(value="/deleteCover/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	String now = (new Date()).toString();
    	log.info("Logging return from delete " + now);
    	coverDao.delete(id);    
        return "redirect:/viewCover";    
    }     
    
	// ---------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------
    
	@RequestMapping("/sectionMenu")
	public ModelAndView sectionMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from sectionMenu " + now);

		// Lists All Subsections under Section Menu 1

		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Section 1.0 - Multiregion Mandatory Changes");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/sectionMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/section10MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView sectionMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from sectionMenu " + now);
		return new ModelAndView("redirect:/sectionMenu");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/subSectionMenu")
	public ModelAndView subSectionMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from subSectionMenu " + now);

		// Lists All Screens under Sub Section Menu 1

		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Subsection 1.1 Africa Region Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/subsectionMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/subsection11MenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView subSectionMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from subSectionMenu " + now);
		return new ModelAndView("redirect:/subSectionMenu");
	}

	// ---------------------------------------------------------------------------------
	// No Separate Screen, but rather Part of all Screens
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewBusinessOverview")
	public ModelAndView viewBusinessOverview1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewBusinessOverview1 " + now);
		List<BusinessOverviewBean> list = businessOverviewDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/businessOverview/viewBusinessOverview");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/business111ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewBusinessOverview2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewBusinessOverview2 " + now);
		return new ModelAndView("redirect:/viewBusinessOverview");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateBusinessOverviewJSPHref/{id}")
	public ModelAndView editBusinessOverview(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateBusinessOverview " + now);
		BusinessOverviewBean overview = businessOverviewDao.selectBusinessOverviewById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/businessOverview/businessOverviewEditForm",
				"command", overview);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------
	// No Separate Screen, but rather Part of all Screens
	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewProcessorImpact")
	public ModelAndView viewProcessorImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewProcessorImpact " + now);
		List<ProcessorImpactBean> list = processorImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/processorImpact/viewProcessorImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/processor112ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewProcessorImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewProcessorImpact " + now);
		return new ModelAndView("redirect:/viewProcessorImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateProcessorImpactJSPHref/{id}")
	public ModelAndView editProcessorImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateProcessorImpact " + now);
		ProcessorImpactBean impact = processorImpactDao.selectProcessorImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/processorImpact/processorImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewPlatformImpact")
	public ModelAndView viewPlatformImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewPlatformImpact " + now);
		List<PlatformImpactBean> list = platformImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/platformImpact/viewPlatformImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/platform113ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewPlatformImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewPlatformImpact " + now);
		return new ModelAndView("redirect:/viewPlatformImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updatePlatformImpactJSPHref/{id}")
	public ModelAndView editPlatformImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updatePlatformImpact " + now);
		PlatformImpactBean impact = platformImpactDao.selectPlatformImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/platformImpact/platformImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewRegionImpact")
	public ModelAndView viewRegionImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewRegionImpact " + now);
		List<RegionImpactBean> list = regionImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/regionImpact/viewRegionImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/region114ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewRegionImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewRegionImpact " + now);
		return new ModelAndView("redirect:/viewRegionImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateRegionImpactJSPHref/{id}")
	public ModelAndView editRegionImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateRegionImpact " + now);
		RegionImpactBean impact = regionImpactDao.selectRegionImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/regionImpact/regionImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewProcessingImpact")
	public ModelAndView viewProcessingImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewProcessingImpact " + now);
		List<ProcessingImpactBean> list = processingImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/processingImpact/viewProcessingImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/processing115ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewProcessingImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewProcessingImpact " + now);
		return new ModelAndView("redirect:/viewProcessingImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateProcessingImpactJSPHref/{id}")
	public ModelAndView editProcessingImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateProcessingImpact " + now);
		ProcessingImpactBean impact = processingImpactDao.selectProcessingImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/processingImpact/processingImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewMessageTypeImpact")
	public ModelAndView viewMessageTypeImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewMessageTypeImpact " + now);
		List<MessageTypeImpactBean> list = messageTypeImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/messageTypeImpact/viewMessageTypeImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/message116ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewMessageTypeImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewMessageTypeImpact " + now);
		return new ModelAndView("redirect:/viewMessageTypeImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateMessageTypeImpactJSPHref/{id}")
	public ModelAndView editMessageImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateMessageImpact " + now);
		MessageTypeImpactBean impact = messageTypeImpactDao.selectMessageTypeImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/messageTypeImpact/messageTypeImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateSystemImpactJSPHref/{id}")
	public ModelAndView editSystemImpact(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateSystemImpact " + now);
		SystemImpactBean impact = systemImpactDao.selectSystemImpactById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/systemImpact/systemImpactEditForm",
				"command", impact);
		model.addObject("now", now);
		return model;
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewSystemImpact")
	public ModelAndView viewSystemImpact1() {
		String now = (new Date()).toString();
		log.info("Logging return from viewSystemImpact " + now);
		List<SystemImpactBean> list = systemImpactDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/systemImpact/viewSystemImpact");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/system118ScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView viewSystemImpact2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewSystemImpact " + now);
		return new ModelAndView("redirect:/viewSystemImpact");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/appendixMenu")
	public ModelAndView appendixMenu1() {
		String now = (new Date()).toString();
		log.info("Logging Return from appendixMenu " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Appendix Menu");
		ModelAndView model = new ModelAndView("menu/maintenance/association/menu/appendixMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/appendixMenuJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView appendixMenu2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from appendixMenu " + now);
		return new ModelAndView("redirect:/appendixMenu");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/acronymForm")
	public ModelAndView acronymForm1() {
		String now = (new Date()).toString();
		log.info("Logging return from acronymForm " + now);
		List<AcronymBean> list = acronymDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/acronym/viewAcronym", "command",
				new AcronymBean());
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/acronymScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView acronymForm2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from acronymForm " + now);
		return new ModelAndView("redirect:/acronymForm");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateAcronymJSPHref/{id}")
	public ModelAndView editUpdateAcronym(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from updateAcronym " + now);
		AcronymBean acronym = acronymDao.selectAcronymById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/acronym/acronymEditForm",
				"command", acronym);
		model.addObject("now", now);
		return model;
	}
	
	// ---------------------------------------------------------------------------------

	@RequestMapping("/relatedDocumentForm")
	public ModelAndView relatedDocumentForm1() {
		String now = (new Date()).toString();
		log.info("Logging return from relatedDocumentForm " + now);
		List<RelatedDocumentBean> list = relatedDocumentDao.select();
		ModelAndView model = new ModelAndView("region08/association/letter/relatedDocument/viewRelatedDocument",
				"command", new RelatedDocumentBean());
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/relatedDocumentScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView relatedDocumentForm2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from relatedDocumentForm " + now);
		return new ModelAndView("redirect:/relatedDocumentForm");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping(value = "/updateRelatedDocumentJSPHref/{id}")
	public ModelAndView editUpdateRelatedDocument(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging return from relatedDocument " + now);
		RelatedDocumentBean relatedDocument = relatedDocumentDao.selectRelatedDocumentById(id);
		ModelAndView model = new ModelAndView("region08/association/letter/relatedDocument/relatedDocumentEditForm",
				"command", relatedDocument);
		model.addObject("now", now);
		return model;
	}
	
	/********************************************************************************** 
	**********************************************************************************
	*/

	@RequestMapping("/viewScheme")
	public ModelAndView viewScheme() {
		String now = (new Date()).toString();
		log.info("Logging Return from viewScheme " + now);
		List<SchemeBean> list = schemeDao.select();
		ModelAndView model = new ModelAndView("region08/association/scheme/viewScheme");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/schemeScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView schemeScreen2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from schemeScreen " + now);
		return new ModelAndView("redirect:/viewScheme");
	}

	// ---------------------------------------------------------------------------------

	@RequestMapping("/viewTemplate")
	public ModelAndView viewTemplate() {
		String now = (new Date()).toString();
		log.info("Logging return from viewTemplate " + now);
		List<TemplateBean> list = templateDao.select();
		ModelAndView model = new ModelAndView("region08/association/template/viewTemplate");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value = "/templateScreenJSPHref/{id}", method = RequestMethod.GET)
	public ModelAndView templateScreen2(@PathVariable int id) {
		String now = (new Date()).toString();
		log.info("Logging Return from viewTemplate " + now);
		return new ModelAndView("redirect:/viewTemplate");
	}

}