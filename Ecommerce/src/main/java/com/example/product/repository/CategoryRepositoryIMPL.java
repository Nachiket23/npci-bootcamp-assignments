package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Category;
import com.example.product.entity.Product;

@Repository
public class CategoryRepositoryIMPL implements CategoryRepository {

	@Autowired
	EntityManager entityManager;
	@Override
	public List<Category> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Category> query = currentSession.createQuery("select c from Category c", Category.class);
		List<Category> catList = query.getResultList();
		return catList;
	}

}
