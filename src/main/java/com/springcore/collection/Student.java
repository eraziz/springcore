package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
private String name;
private List<String> phones;
private Set<String> Address;
private Map<String,String> course;
private Properties pro;

public Student(String name, List<String> phones, Set<String> address, Map<String, String> course, Properties pro) {
	super();
	this.name = name;
	this.phones = phones;
	Address = address;
	this.course = course;
	this.pro = pro;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddress() {
	return Address;
}
public void setAddress(Set<String> address) {
	Address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}

public Properties getPro() {
	return pro;
}
public void setPro(Properties pro) {
	this.pro = pro;
}
@Override
public String toString() {
	return "Student [name=" + name + ", phones=" + phones + ", Address=" + Address + ", course=" + course + ", pro="
			+ pro + "]";
}

	
	
	
	
	
}
