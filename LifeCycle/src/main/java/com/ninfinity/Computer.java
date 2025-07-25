package com.ninfinity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Computer implements InitializingBean,DisposableBean{
	
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
		return "Computer [company=" + company + ", price=" + price + "]";
	}
	public Computer(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public Computer() {
		super();
		System.out.println("Creating Object");
		// TODO Auto-generated constructor stub
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing .........");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroyed bean");
	}
	
	
}
