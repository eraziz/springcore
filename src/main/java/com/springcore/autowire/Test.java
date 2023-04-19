package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext c= new ClassPathXmlApplicationContext("com\\springcore\\autowire\\configer.xml");
 Emp e = c.getBean("emp",Emp.class);
 System.out.println(e);
	}

}
