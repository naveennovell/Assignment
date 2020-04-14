package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Dao.ProductI;
import com.cg.entity.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductI {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Product p) {
		
		em.persist(p);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List retrive() {
		Query q = em.createQuery(" from Product p");
		// TODO Auto-generated method stub
		return q.getResultList();
	}

	@Override
	public Product findbyid(int id) {
		
		// TODO Auto-generated method stub
		return em.find(Product.class,id);
	}

	@Override
	public void Update(Product p) {
		
		p.setProductName(p.getProductName());
		p.setProductPrice(p.getProductPrice());
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		Product p = em.find(Product.class, id);
		System.out.println(p.getProductId()+""+p.getProductPrice());
		em.remove(p);
		// TODO Auto-generated method stub
		
	}
	

}

