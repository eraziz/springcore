package com.springcorele.lifecyc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	@PostConstruct
	public void starter() {
		System.out.println("inside starter");
	}
	@PreDestroy
public void closed() {
	System.out.println("inside close ");	
	}

}
