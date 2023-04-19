package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new	ClassPathXmlApplicationContext("com\\springcore\\ref\\ref_configer.xml");
A a = (A) context.getBean("aref");
System.out.println(a);
System.out.println(a.getX());
System.out.println(a.getOb());
System.out.println(a.getOb().getY());
	}

}
