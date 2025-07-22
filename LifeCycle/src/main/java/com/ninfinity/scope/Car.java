package com.ninfinity.scope;

public class Car {
	String company;
	int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", price=" + price + "]";
	}
	public Car(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
