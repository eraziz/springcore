package com.springcorele.lifecyc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pen implements InitializingBean,DisposableBean {
private double price;

public Pen(double price) {
	super();
	this.price = price;
}

public Pen() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("inside setter");
	this.price = price;
}

@Override
public String toString() {
	return "Pen [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside init");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside destroy");
}

}
