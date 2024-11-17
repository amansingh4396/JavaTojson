package com.cjc;

public class Student 
{

	
	private String name ;
	
	private int id ;
	
	private String address ;
	
	private float marks ;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, String address, float marks) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
}
