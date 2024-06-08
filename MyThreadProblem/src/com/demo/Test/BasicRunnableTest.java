package com.demo.Test;

import com.demo.beans.BasicRunnable;

public class BasicRunnableTest {

	public static void main(String[] args) {
		BasicRunnable obj=new BasicRunnable();
		BasicRunnable obj1=new BasicRunnable();
		Thread t1=new Thread(obj);
		Thread t2= new Thread(obj1);
		t1.start();
		t1.start();
		
		

	}

}
