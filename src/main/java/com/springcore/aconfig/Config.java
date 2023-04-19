package com.springcore.aconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages=" com.springcore.aconfig")
public class Config {
	@Bean
	public Book getBook() {
		return new Book();
	}
	@Bean(name= {"st","con","fill"})
public Student getStudent() {
	Student st=new Student(getBook());
	return st;
}
}
