package com.cg.demo.dao;

import java.util.ArrayList;

import javax.persistence.*;

import com.cg.demo.bean.Order;
import com.cg.demo.util.JPAutil;

public class ProductDaoImpl {
	EntityManager em = null;
	EntityTransaction trans=null;
public ProductDaoImpl() {
	em=JPAutil.getEntitymanager();
	trans = em.getTransaction();
	}
public Order addOrder(Order order) {
	trans.begin();
	em.persist(order);
	trans.commit();
	System.out.println("Order Info ie inserted");
	return order;
}
public ArrayList<Order> getAllOrders(){
	TypedQuery typeq = em.createQuery("Select ordrs from Order ords",Order.class);
	ArrayList orlist = (ArrayList<Order>) typeq.getResultList();
	return orlist;
}
}
