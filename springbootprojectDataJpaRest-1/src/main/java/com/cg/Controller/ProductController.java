package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceI;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	ProductServiceI productservice;
	
	@GetMapping(value="/product")
	public List<Product> fetchProduct()
	{
		return productservice.retrieve();
	}
	
	@PostMapping(value="/product/add",consumes = {"application/json"})
	public String addProduct(@RequestBody Product product)
	{
	   productservice.create(product);
	   return "Product added";
	}
	
	@DeleteMapping(value="/product/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
	   productservice.delete(id);
	   return "Product deleted";
	}
	
	@PutMapping(value="/product/update",consumes= {"application/json"})
	public String updateProduct(@RequestBody Product product)
	{
		productservice.Update(product);
		return "product updated";
		
	}
	
}
	

