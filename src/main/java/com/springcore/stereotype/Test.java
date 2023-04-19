package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext con= new ClassPathXmlApplicationContext("com\\springcore\\stereotype\\stereoconfiger.xml");
Student s = con.getBean("st",Student.class);
Student s1 = con.getBean("st",Student.class);
Teacher t1 = con.getBean("tec",Teacher.class);
Teacher t2 = con.getBean("tec",Teacher.class);
System.out.println(t1.hashCode());
System.out.println(t2.hashCode());
System.out.println(s.hashCode());
System.out.println(s1.hashCode());
System.out.println(s);
System.out.println(s.getPhone());
	}

}
  