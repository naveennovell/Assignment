package com.cg.service;

import java.util.List;


import com.cg.entity.Product;

public interface ProductServiceI {
	public void create(Product p);
	public List retrieve();
	public Product findbyid(int id);
	public void Update(Product p);
	public void delete(int id);

}
