package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com\\springcore\\standalonecollection\\standconfiger.xml");
Person p = con.getBean("p1",Person.class);
System.out.println(p.getName());
System.out.println(p.getSalary());
System.out.println(p.getPro());
System.out.println(p.getName().getClass().getName());
System.out.println(p.getSalary().getClass().getName());


	}
 
}
