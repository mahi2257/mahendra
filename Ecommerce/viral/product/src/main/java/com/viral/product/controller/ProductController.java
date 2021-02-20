package com.viral.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viral.product.model.GenericSearchFilter;
import com.viral.product.model.Product;
import com.viral.product.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	//viralBazaar.com
	
	@Autowired
	private IProductService productService;
	
	//this api used for generic search
	@GetMapping("/findProductsBySearch/{search}")
	public List<Product> findProductsBySearch(@PathVariable GenericSearchFilter search){
		return productService.findProductsByGenericSearch(search);
	}
		
	//this api used for search when we apply filter from UI
	@GetMapping("/findProductsByFilter")
	public List<Product> findProductByFilter(@RequestBody Product product){
		return productService.findProductByFilter(product);
	}
	
	@GetMapping("/findProductsByCategory/{category}")
	public List<Product> findProductByCategory(@PathVariable String category){
		return productService.findByProdCategory(category);
	}
	
	@GetMapping("/findProductById/{prodId}")
	public Product findByProductd(@PathVariable Long prodId) {
		return productService.findByProdId(prodId);
	}
	
	@GetMapping("/findProducts")
	public List<Product> findProducts(){
		return productService.findProducts();
	}
	
}
