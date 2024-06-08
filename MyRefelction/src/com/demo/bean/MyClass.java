package com.demo.bean;

public class MyClass {
	public int num;
	private String name;
	public float sum;
	
	public MyClass() {
		super();
	}
	public MyClass(int num, String name,float sum) {
		super();
		this.num = num;
		this.name = name;
		this.sum=sum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyClass [num=" + num + ", name=" + name + "]";
	}
	
	

}
