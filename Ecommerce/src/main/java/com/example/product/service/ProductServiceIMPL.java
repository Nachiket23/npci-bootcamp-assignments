package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepositoryIMPL;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	ProductRepositoryIMPL productrepo;
	
	
	public List<Product> findAll() {
		
		return productrepo.findAll();
	}

	
	@Override
	public Product findById(int id) {
		return productrepo.findById(id);
	}


	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productrepo.saveProduct(product);
	}


	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		productrepo.deleteById(id);
	}

	
}
