package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.ProductOrderDao;
import org.jsp.dto.Product;
import org.jsp.dto.Shop;

public class ProductOrderController {
	public static void main(String[] args) {
		ProductOrderDao dao = new ProductOrderDao();
		
		
		Product product1 = new Product();
		product1.setId(101);
		product1.setName("apple Iphone 17" );
		product1.setType("eletronics Device");
		product1.setCost(82000);
		
		Product product2 = new Product();
		product2.setId(102);
		product2.setName("apple I chaddi" );
		product2.setType("clothing");
		product2.setCost(98236);
		
		
		List<Product> products =new ArrayList<>();
		products.add(product1);
		products.add(product2);
		
		
		Shop shop =new Shop();
		shop.setId(1);
		shop.setName("Haricharan Shop");
		shop.setAdddress("JNTU");
		
		shop.setProducts(products);
		product1.setShop(shop);
		product2.setShop(shop);
		
		
		
		dao.saveProduct(product1);
		dao.saveProduct(product2);
		
	}
}
