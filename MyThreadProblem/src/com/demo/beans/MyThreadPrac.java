package com.demo.beans;

import java.util.Scanner;

public class MyThreadPrac extends Thread{
	public void run()
	{
		int i;
		System.out.println("Enter the number =");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Even number");
		for( i=0;i<a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}
		}
		System.out.println("Table of greatest number in series:-");
		if(i==a)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(a+"*"+i+"="+a*i);
			}
		}
		
	}

}
