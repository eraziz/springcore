package com.springcorele.lifecyc;

public class Book {
private String edition;

public String getEdition() {
	return edition;
}

public void setEdition(String edition) {
	this.edition = edition;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Book [edition=" + edition + "]";
}
 public void inIt() {
	 System.out.println("inside init");
 }
 public void destroy() {
	 System.out.println("inside destroy");
 }

}
