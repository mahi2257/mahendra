package com.viral.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viral.product.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
	
	@Query(value = "select * from product p, category c where p.CAT_ID_FK=c.CAT_ID and c.NAME=?1",nativeQuery = true)
	public List<Product> findProductsByCategory(String category);
	
}
