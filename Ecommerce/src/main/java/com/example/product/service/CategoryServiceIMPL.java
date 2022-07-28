package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Category;
import com.example.product.repository.CategoryRepositoryIMPL;

@Service
public class CategoryServiceIMPL implements CategoryService {

	@Autowired
	CategoryRepositoryIMPL categoryRepo;
	
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	
}
