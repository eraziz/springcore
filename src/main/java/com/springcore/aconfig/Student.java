package com.springcore.aconfig;

import org.springframework.stereotype.Component;


public class Student {
	private Book book;
	
public Student(Book book) {
		super();
		this.book = book;
	}

public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

public void done() {
this.book.reading();
	System.out.println("iniside method");
}
}
