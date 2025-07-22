package com.ninfinity;

public class Car {
	String company;
	int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
		System.out.println("Setting Properties");
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
		System.out.println("Object is Created");
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("WOW : Bean init method Called");
	}
	
	public void destroy() {
		System.out.println("So Sad : Bean is Destroyed");
	}
	
}
