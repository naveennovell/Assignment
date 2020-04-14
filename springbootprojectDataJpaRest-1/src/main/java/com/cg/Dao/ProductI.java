package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;
@Repository
public interface ProductI {
	public void create(Product p);
	public List retrive();
	public Product findbyid(int id);
	public void Update(Product p);
	public void delete(int id);

}
