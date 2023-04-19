package com.springcore.aconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
Student st = con.getBean("con",Student.class);
System.out.println(st);
st.done();
	}

}
