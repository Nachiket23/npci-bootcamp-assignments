package com.example.productmanagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.repository.ProductRepository;


@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAll() {
		
		return productRepo.findAll();
	}

	
	public void save(Product p) {
		productRepo.save(p);
		
	}

	public Product findById(int id) {
		Optional<Product> p = productRepo.findById(id);
		Product pro = null;
		
		if(p.isPresent())
			pro = p.get();
		
		return pro;
	}

	
	public void deleteById(int id) {
		productRepo.deleteById(id);
	}


	
	
}
