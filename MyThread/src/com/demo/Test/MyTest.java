package com.demo.Test;

import com.demo.Thread.AdditionThread;
import com.demo.Thread.PrimeThread;
import com.demo.Thread.Squarthread;
import com.demo.beans.MyClass;

public class MyTest {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.Isprime(11);
	System.out.println(obj.Addition(21));
		obj.sqaure(169);
		
		
	PrimeThread pt=new PrimeThread(obj,6);
		pt.start();
	
		AdditionThread nth =new AdditionThread(obj,25);
		nth.start();
		
		Squarthread sth=new Squarthread(obj,169);
		sth.start();
		

	}

}
