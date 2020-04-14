package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.ProductI;
import com.cg.entity.Product;
@Service
public class ProductServiceImpl implements ProductServiceI {
	
	@Autowired
	ProductI productdao;

	@Override
	public void create(Product p) {
		if(p.getProductId() != 0)
		{
			if(p.getProductName()!= null)
			{
				productdao.create(p);
			}
			else
			{
				throw new RuntimeException("product name should could not be null");
			}
		}
		else
		{
			throw new RuntimeException("id cannot be null");
		}
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List retrieve() {
		// TODO Auto-generated method stub
		return productdao.retrive();
	}

	@Override
	public Product findbyid(int id) {
		// TODO Auto-generated method stub
		return productdao.findbyid(id);
	}

	@Override
	public void Update(Product p) {
		Product pro = productdao.findbyid(p.getProductId());
		if(pro !=null)
		{
			productdao.Update(p);
		}
		else
		{
			throw new RuntimeException("Id doesn't Exit");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		Product pro = productdao.findbyid(id);
		if(pro != null)
		{
			productdao.delete(id);
		}
		else
		{
			throw new RuntimeException("Id is not Exist");
		}
		// TODO Auto-generated method stub
		
	}

}
