package com.springcore.autowire.anotation.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temaddress1")
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("inside setter");
}

public Emp(Address address) {
	System.out.println("inside costr");
	
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

}
