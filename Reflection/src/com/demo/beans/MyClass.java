package com.demo.beans;

public class MyClass {
	private int Id;
	private String Name;
	public MyClass() {
	}
	public MyClass(int id, String name) {
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "MyClass [Id=" + Id + ", Name=" + Name + "]";
	}
	
	public int method1(int x)
	{
		System.out.println("method1 called");
		return 20+x;
	}

}
