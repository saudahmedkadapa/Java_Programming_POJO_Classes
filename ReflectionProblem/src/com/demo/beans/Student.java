package com.demo.beans;

public class Student {
	private String name;
	private int Id;
	public Student() {
		super();
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + "]";
	}
	

}
