package com.springcore.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> name;
private Map<String,Integer> salary;
private Properties pro;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
public Map<String, Integer> getSalary() {
	return salary;
}
public void setSalary(Map<String, Integer> salary) {
	this.salary = salary;
}

public Properties getPro() {
	return pro;
}
public void setPro(Properties pro) {
	this.pro = pro;
}
@Override
public String toString() {
	return "Person [name=" + name + ", salary=" + salary + ", pro=" + pro + "]";
}

}
