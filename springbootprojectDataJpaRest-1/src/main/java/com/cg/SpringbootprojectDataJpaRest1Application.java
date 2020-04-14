package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.ProductI;
import com.cg.entity.Product;

@SpringBootApplication
public class SpringbootprojectDataJpaRest1Application  {
	
	@Autowired
	ProductI productdao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectDataJpaRest1Application.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {
//		Product p = new Product(1001,"laptop",35000.0);
//		Product p1 = new Product(1002,"Mouse",450.0);
//		Product p2 = new Product(1003,"keyboard",35410.);
//		Product p3 = new Product(1004,"cpu",15420.0);
//		Product p4 = new Product(1005,"speaker",6500.0);
//		productdao.create(p);
//		productdao.create(p1);
//		productdao.create(p2);
//		productdao.create(p3);
//		productdao.create(p4);
//		List<Product> list1 = productdao.retrive();
//		for(Product pro:list1)
//		{
//			System.out.println(pro.getProductId()+" "+pro.getProductName()+" "+pro.getProductPrice());
//		}
		
//		Product list1 = productdao.findbyid(1001);
//			System.out.println(list1.getProductName()+" "+list1.getProductPrice());
//		productdao.Update(1001);
//		productdao.delete(1004);
		
	
		
		
		
	

}
