package com.xmagic.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private String type;
	private String maxSpeed;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return this.type + " " + this.maxSpeed;
	}
}
