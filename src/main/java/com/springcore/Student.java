package com.springcore;

public class Student {
private int stdid;
private String stdname;
private String stdAddress;
public Student(int stdid, String stdname, String stdAddress) {
	super();
	this.stdid = stdid;
	this.stdname = stdname;
	this.stdAddress = stdAddress;
}
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	System.out.println("Setting student id");
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	System.out.println("Setting student name");
	this.stdname = stdname;
}
public String getStdAddress() {
	return stdAddress;
}
public void setStdAddress(String stdAddress) {
	System.out.println("Setting student Addresss");
	this.stdAddress = stdAddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdAddress=" + stdAddress + "]";
}

}
