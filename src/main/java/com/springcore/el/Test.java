package com.springcore.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com\\springcore\\el\\elconfiger.xml");
	Demo de = con.getBean("demo",Demo.class);
	
	System.out.println(de);
	System.out.println(de.getZ());
	System.out.println(de.getE());
	System.out.println(de.getName());
	System.out.println(de.isActive());
	SpelExpressionParser t1 = new SpelExpressionParser();
	Expression ex = t1.parseExpression("89+87+89");
	System.out.println(ex.getValue());
	}
 
}
