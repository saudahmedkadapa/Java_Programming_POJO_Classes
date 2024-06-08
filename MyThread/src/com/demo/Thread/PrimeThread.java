package com.demo.Thread;

import com.demo.beans.MyClass;

public class PrimeThread extends Thread {
	private MyClass obj;
	private int num;
	
	public PrimeThread() {
		super();
	}

	public PrimeThread(MyClass obj, int num) {
		super();
		this.obj = obj;
		this.num = num;
	}
	
	public void run()
	{
		obj.Isprime(num);
		
	}
	
	

}
