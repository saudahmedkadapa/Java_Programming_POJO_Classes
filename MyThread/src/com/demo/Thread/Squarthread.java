package com.demo.Thread;

import com.demo.beans.MyClass;

public class Squarthread extends Thread {
	private MyClass Obj;
	
	private int num;

	public Squarthread() {
		super();
	}

	public Squarthread(MyClass obj, int num) {
		super();
		Obj = obj;
		this.num = num;
	}
	
	public void run()
	{
		Obj.sqaure(num);
	}
	

}
