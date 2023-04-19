package com.springcorele.lifecyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\springcorele\\lifecyc\\configer.xml");
context.registerShutdownHook();
	Book b = context.getBean("book",Book.class);
	Pen p = context.getBean("pen",Pen.class);
	Samosa s = context.getBean("sa",Samosa.class);
	System.out.println(b);
	System.out.println(p);
	System.out.println(s);
	
	
	}

}
