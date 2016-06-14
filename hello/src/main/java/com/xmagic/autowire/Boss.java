package com.xmagic.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
	@Autowired
	private Office office;
	@Autowired
	private Car car;
	
	@Override
	public String toString(){
		return this.office.getLocation() + " " + this.car; 
	}
}
