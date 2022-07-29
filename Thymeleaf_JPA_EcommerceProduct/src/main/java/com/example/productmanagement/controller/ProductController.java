package com.example.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.productmanagement.Service.ProductService;
import com.example.productmanagement.entity.Product;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService proService;
	
	@GetMapping("/prodlist")
	public String findll(Model model){
		List<Product> pro=proService.findAll();
		model.addAttribute("PRODUCT", pro);
		return "proUI/product.html";
	}
	
	@GetMapping("/addpro")
	public String proForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "proUI/productForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("Product") Product pro) {
		proService.save(pro);
		
		return "redirect:/product/prodlist";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("proId") int id, Model model) {
		Product pro = proService.findById(id);
		model.addAttribute("PRODUCT", pro);
		return "proUI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("proId") int id) {
		proService.deleteById(id);
		return "redirect:/product/prodlist";
	}
	

}

