package com.cg.demo.ui;

import java.util.*;

import com.cg.demo.bean.Order;
import com.cg.demo.bean.Product;
import com.cg.demo.dao.ProductDaoImpl;

public class TestProductDemo {
	
	public static void main(String[] args) {
		ProductDaoImpl daoimpl = new ProductDaoImpl();
		Product electronics= new Product("LED TV",45000);
		Product menprod= new Product("FastTrack",6500);
		Product sports= new Product("Nivia",1800);
		Product trek= new Product("Camp",7500);
		
		
		Order order1= new Order(new Date());
		HashSet<Product> firstOrderProdSet = new HashSet();
		firstOrderProdSet.add(trek);
		firstOrderProdSet.add(sports);
		firstOrderProdSet.add(menprod);
		order1.setProductSet(firstOrderProdSet);
		daoimpl.addOrder(order1);
		
		
		System.out.println("---------------**************------------------");
		Order order2= new Order(new Date());
		HashSet<Product> SecondOrderProdSet = new HashSet();
		SecondOrderProdSet.add(trek);
		SecondOrderProdSet.add(electronics);
		order2.setProductSet(SecondOrderProdSet);
		daoimpl.addOrder(order2);
	
		

	}

}
