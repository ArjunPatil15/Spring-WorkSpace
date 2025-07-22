package com.ninfinity.Autowiring.Standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	List<String> friend;
	Map<String , Integer> marks;
	Properties dbc;
	public List<String> getFriend() {
		return friend;
	}
	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public Properties getDbc() {
		return dbc;
	}
	public void setDbc(Properties dbc) {
		this.dbc = dbc;
	}
	@Override
	public String toString() {
		return "Person [friend=" + friend + ", marks=" + marks + ", dbc=" + dbc + "]";
	}
	public Person(List<String> friend, Map<String, Integer> marks, Properties dbc) {
		super();
		this.friend = friend;
		this.marks = marks;
		this.dbc = dbc;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
