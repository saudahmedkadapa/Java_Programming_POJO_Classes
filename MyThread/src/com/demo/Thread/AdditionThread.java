package com.demo.Thread;

import com.demo.beans.MyClass;

public class AdditionThread extends Thread{
	private MyClass obj;
	
	private int num;

	public AdditionThread() {
		super();
	}

	public AdditionThread(MyClass obj, int num) {
		super();
		this.obj = obj;
		this.num = num;
	}
	
	public void run()
	{
		int a=obj.Addition(num);
		System.out.println("Addtion="+a);
		
		
	}
	

}
