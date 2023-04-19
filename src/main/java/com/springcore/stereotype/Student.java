package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
@Scope("prototype")
public class Student {
	@Value("aziz")
private String studentName;
	@Value ("mumbai")
private String city;
	@Value("#{list1}")
	private List<String> phone;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public List<String> getPhone() {
	return phone;
}
public void setPhone(List<String> phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
