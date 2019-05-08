package com.cg.demo.bean;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="product_master")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prod_id",length=10)
private int productId;
	@Column(name="prod_name",length= 20)
private String productName;
	@Column(name="prod_price",length= 10)
private int productprice;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="productSet")
	private Set<Order> orderSet;
	
public Set<Order> getOrderSet() {
		return orderSet;
	}
	public void setOrderSet(Set<Order> orderSet) {
		this.orderSet = orderSet;
	}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductprice() {
	return productprice;
}
public void setProductprice(int productprice) {
	this.productprice = productprice;
}
public Product() {
	super();
}
public Product(String productName, int productprice) {
	super();
	this.productName = productName;
	this.productprice = productprice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productprice=" + productprice + "]";
}

}
