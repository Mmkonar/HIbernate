package com.cg.demo.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="order_master")
public class Order {
	@Id
	@Column(name="order_id",length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
private int orderId;
	@Column(name="order_date")
	@Temporal(TemporalType.DATE)
private Date orderDate;
	public Set<Product> getProductSet() {
		return productSet;
	}
	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="product_orders",
	joinColumns= {
			@JoinColumn(name="order_id")},
	inverseJoinColumns= {
		@JoinColumn(name="product_id")})
	private Set<Product> productSet;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderDate=" + orderDate + "]";
}
public Order() {
	super();
}
public Order(Date orderDate) {
	super();
	this.orderDate = orderDate;
}

}
