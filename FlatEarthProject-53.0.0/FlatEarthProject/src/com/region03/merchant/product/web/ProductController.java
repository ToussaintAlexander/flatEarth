package com.region03.merchant.product.web;

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

import com.region03.merchant.product.dao.ProductDaoImpl;
import com.region03.merchant.product.model.ProductBean;

@Controller
public class ProductController {
	
	 private static final Log log = LogFactory.getLog(ProductController.class);
	
    @Autowired
	ProductDaoImpl productDao; 
    
	@RequestMapping("/viewProduct")
	public ModelAndView viewProduct(){
		String now = (new Date()).toString();
		log.info("Logging return from viewProduct " + now);
		List<ProductBean> list=productDao.select();
		ModelAndView model = new ModelAndView("region03/merchant/product/viewProduct");
		model.addObject("list", list);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/viewProductJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView productScreen1(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging Return from viewProduct " + now);
		return new ModelAndView("redirect:/viewProduct");
	}
    
	@RequestMapping("/productForm")
	public ModelAndView showform(){
		String now = (new Date()).toString();
		log.info("Logging return from productForm " + now);
		return new ModelAndView("region03/merchant/product/productForm","command",new ProductBean());
	}
	
	@RequestMapping(value="/productFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("product") ProductBean product){
		String now = (new Date()).toString();
		log.info("Logging return from productForm " + now);
		productDao.insert(product);
		return new ModelAndView("redirect:/viewProduct"); 
	}

	@RequestMapping(value="/updateProductJSPHref/{id}")
	public ModelAndView edit(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from updateProduct " + now);
		ProductBean product=productDao.selectProductById(id);
		//return new ModelAndView("region03/merchant/product/productEditForm","command",product);
		ModelAndView model = new ModelAndView("region03/merchant/product/productEditForm","command",product);
		model.addObject("now", now);
		return model;
	}
	
	@RequestMapping(value="/productEditFormJSPPostAction",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("product") ProductBean product){
		String now = (new Date()).toString();
		log.info("Logging return from productEditForm " + now);
		productDao.update(product);
		return new ModelAndView("redirect:/viewProduct");
	}
	 
	@RequestMapping(value="/deleteProductJSPHref/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		String now = (new Date()).toString();
		log.info("Logging return from deleteProduct " + now);
		productDao.delete(id);
		return new ModelAndView("redirect:/viewProduct");
	}

}