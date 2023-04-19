package com.springcore.ci;

import java.util.List;

public class Person {
private int personid;
private String name;
private Certi cer;
private List<String> list;
public Person(int personid, String name,Certi cer,List<String> list) {
	super();
	this.personid = personid;
	this.name = name;
	this.cer = cer;
	this.list = list;
}
@Override
public String toString() {
	return "The person details are  "+this.personid+" : "+this. name+" : "+this.cer+" : "+this.list;
}

}
