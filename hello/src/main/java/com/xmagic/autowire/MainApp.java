package com.xmagic.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("**/autoWired.xml");
		Boss obj = (Boss) context.getBean("boss");
		System.out.println(obj);
		context.close();
	}
}
