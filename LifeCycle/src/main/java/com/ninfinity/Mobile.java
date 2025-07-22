package com.ninfinity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile {
	String company;
	int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("Setting properties");
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
		return "Mobile [company=" + company + ", price=" + price + "]";
	}
	public Mobile(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public Mobile() {
		super();
		System.out.println("Creating Object");
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initializing bean ........");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroyed bean");
	}
}
