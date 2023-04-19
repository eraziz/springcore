 package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\collection\\collection_configer.xml");
		Student s = (Student) context.getBean("student1");
	System.out.println(s);
	System.out.println(s.getName());
	System.out.println(s.getPhones());
	System.out.println(s.getAddress());
	System.out.println(s.getCourse());
	System.out.println(s.getPro());
	
	
	}

}
