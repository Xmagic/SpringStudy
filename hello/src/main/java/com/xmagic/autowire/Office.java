package com.xmagic.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Office {
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
