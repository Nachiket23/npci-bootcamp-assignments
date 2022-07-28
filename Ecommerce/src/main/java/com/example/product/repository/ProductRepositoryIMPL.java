package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
@Transactional
public class ProductRepositoryIMPL implements ProductRepository {

	@Autowired
	EntityManager entityManager;
	
	public List<Product> findAll(){
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("select e from Product e",Product.class);
		List<Product> prodList = query.getResultList();
		
		return prodList;
	
	}
	
	public Product findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(product);
	}

	@Transactional
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :prodId");
		query.setParameter("prodId", id);
		query.executeUpdate();
	}
	
}
