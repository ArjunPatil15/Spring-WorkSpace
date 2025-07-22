package com.ninfinity.Autowiring.Standalone;

import java.util.List;

public class Teacher {
	List<String> frnds;

	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}

	@Override
	public String toString() {
		return "Teacher [frnds=" + frnds + "]";
	}

	public Teacher(List<String> frnds) {
		super();
		this.frnds = frnds;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
