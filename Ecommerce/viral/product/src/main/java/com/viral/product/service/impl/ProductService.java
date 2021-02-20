package com.viral.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viral.product.dao.ProductRepo;
import com.viral.product.model.GenericSearchFilter;
import com.viral.product.model.Product;
import com.viral.product.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product findByProdId(Long prodId) {
		return productRepo.findById(prodId).get();
	}

	@Override
	public List<Product> findProducts() {
		return null;
	}

	@Override
	public List<Product> findProductByFilter(Product product) {
		return null;
	}

	@Override
	public List<Product> findProductsByGenericSearch(GenericSearchFilter search) {
		return null;
	}

	@Override
	public List<Product> findByProdCategory(String category) {
		System.out.println("Category : "+category);
		return productRepo.findProductsByCategory(category);
	}

}
