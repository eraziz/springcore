package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\ci\\ci_configer.xml");
	Person p = context.getBean("person", Person.class);
	Person p1 = context.getBean("person1", Person.class);
	Addition a = context.getBean("add", Addition.class);
	System.out.println(p);
	System.out.println(p1);
	System.out.println();
	a.dosum();
	}

}
