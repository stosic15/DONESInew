package com.comtrade.domen;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	private int id;
	private LocalTime  orderTime;
	private LocalDate orderDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	 
	
	
	
	

}
