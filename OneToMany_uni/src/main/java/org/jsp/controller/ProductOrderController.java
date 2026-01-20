package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.ProductOrderDao;
import org.jsp.dto.Orderr;
import org.jsp.dto.Product;

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
		
		
		Orderr order = new Orderr();
		order.setId(1121);
		order.setOrderName("Croma");
		order.setProducts(products);
		order.setModeOfPayment("Credit Card");
		order.setTotalCost(166000);
		
		
		dao.saveOrder(order);
	}
}
