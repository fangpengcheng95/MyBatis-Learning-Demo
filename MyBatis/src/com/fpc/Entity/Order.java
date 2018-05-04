package com.fpc.Entity;

/*
 * 定义orders表对应的实体类
 * */
public class Order {
	/*
	 * Order实体类中属性名和orders表中的字段名是不一样的
	 * */
	private int id; //id & order_id
	private String orderNo; //orderNo & order_no
	private float orderPrice; //orderPrice & order_price
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + orderPrice+ "]";
	}
}
