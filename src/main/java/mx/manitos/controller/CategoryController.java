package mx.manitos.controller;

import java.util.List;

import mx.manitos.entity.Category;
import mx.manitos.service.CategoryService;
import mx.manitos.transformer.TransformerClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryServ;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	String showHome(Model model){
		/*
		List<Category> list = categoryServ.findAllCategories();
		model.addAttribute("categorias", list);
		*/
		List<TransformerClass> trans = categoryServ.findAllTransformer();
		model.addAttribute("transform", trans);
		return "index";
	}
	
	@RequestMapping(value="/category/list", method=RequestMethod.GET)
	String showCategoryList(Model model){
		List<Category> list = categoryServ.findAllCategories();
		model.addAttribute("categorias", list);
		return "index";
	}
}
