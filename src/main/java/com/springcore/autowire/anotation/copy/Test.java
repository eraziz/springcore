package com.springcore.autowire.anotation.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext c= new ClassPathXmlApplicationContext("com\\springcore\\autowire\\anotation\\copy\\configer.xml");
 Emp e = c.getBean("emp",Emp.class);
 System.out.println(e);
	}
 
}
