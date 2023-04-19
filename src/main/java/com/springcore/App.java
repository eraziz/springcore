package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("configer.xml");
    Student s = (Student) con.getBean("student1");
    Student s1 = (Student) con.getBean("student2");
    Student s2= (Student) con.getBean("student3");
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s2);
    
    }
}
