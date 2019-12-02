package com.system.cryptography.encoding.web;

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

import com.system.security.authorization.menu.dao.MenuDaoImpl;
import com.system.security.authorization.menu.model.MenuBean;

@Controller
public class EncodingController {

	private static final Log log = LogFactory.getLog(EncodingController.class);
	
	/**********************************************************************************
	 *  Inject DAO from XML file
	 **********************************************************************************
	 */
	
	 @Autowired
	 MenuDaoImpl				menuDao;
	
	//--------------------------------------------------------------------------------
		
	@RequestMapping("/encodingMenu")
	public ModelAndView encodingMenu1(){
		String now = (new Date()).toString();
		log.info("Logging Return from encodingMenu1 " + now);
		List<MenuBean> list = menuDao.selectChildMenuByParentMenu("Character Encoding Menu");
		ModelAndView model = new ModelAndView("system/cryptography/encoding/menu/encodingMenu");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
			
	@RequestMapping(value="/encodingMenuJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView encodingMenu2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from encodingMenu2 " + now);
		return new ModelAndView("redirect:/encodingMenu");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewAsciiToEbcdic")
	public ModelAndView asciiToEbcdic1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAsciiToEbcdic1 " + now);
//		AsciiToEbcdicBean asciiEbcdicBean = asciiEbcdicDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewAsciiToEbcdic");
//		model.addObject("bean", asciiEbcdicBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/asciiToEbcdicJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView asciiToEbcdic2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from asciiToEbcdic2 " + now);
		return new ModelAndView("redirect:/viewAsciiToEbcdic");
	}
	
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewAsciiToBinary")
	public ModelAndView asciiToBinary1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAsciiToBinary1 " + now);
//		AsciiToBinaryBean asciiBinaryBean = asciiBinaryDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewAsciiToBinary");
//		model.addObject("bean", asciiBinaryBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/asciiToBinaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView asciiToBinary2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from asciiToBinary2 " + now);
		return new ModelAndView("redirect:/viewAsciiToBinary");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewAsciiToHexadecimal")
	public ModelAndView asciiToHexadecimal1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewAsciiToHexadecimal1 " + now);
//		AsciiToHexadecimalBean asciiHexadecimalBean = asciiHexadecimalDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewAsciiToHexadecimal");
//		model.addObject("bean", asciiHexadecimalBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/asciiToHexadecimalJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView asciiToHexadecimal2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from asciiToHexadecimal2 " + now);
		return new ModelAndView("redirect:/viewAsciiToHexadecimal");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewEbcdicToBinary")
	public ModelAndView ebcdicToBinary1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewEbcdicToBinary1 " + now);
//		EbcdicToBinaryBean ebcdicToBinaryBean = ebcdicToBinaryDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewEbcdicToBinary");
//		model.addObject("bean", ebcdicToBinaryBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/ebcdicToBinaryJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView ebcdicToBinary2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from ebcdicToBinary2 " + now);
		return new ModelAndView("redirect:/viewEbcdicToBinary");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewEbcdicToHexadecimal")
	public ModelAndView EbcdicToHexadecimal1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewEbcdicToHexadecimal1 " + now);
//		EbcdicToHexadecimalBean ebcdicToHexadecimalBean = ebcdicToHexadecimalDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewEbcdicToHexadecimal");
//		model.addObject("bean", ebcdicToHexadecimalBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/ebcdicToHexadecimalJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView ebcdicToHexadecimal2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from ebcdicToHexadecimal2 " + now);
		return new ModelAndView("redirect:/viewEbcdicToHexadecimal");
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping("/viewBinaryToHexadecimal")
	public ModelAndView binaryToHexadecimal1(){
		String now = (new Date()).toString();
		log.info("Logging return from viewBinaryToHexadecimal1 " + now);
//		BinaryToHexadecimalBean binaryToHexadecimalBean = binaryToHexadecimalDao.select();
		ModelAndView model = new ModelAndView("system/cryptography/encoding/form/viewBinaryToHexadecimal");
//		model.addObject("bean", binaryToHexadecimalBean);
		model.addObject("now", now);
		return model;
	}

	@RequestMapping(value="/binaryToHexadecimalJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView binaryToHexadecimal2(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from binaryToHexadecimal2 " + now);
		return new ModelAndView("redirect:/viewBinaryToHexadecimal");
	}
	
}
