package com.demo.Dao;

import com.demo.beans.MyClass;

public class NumberDao {
	
	MyClass obj;
	
	public boolean isprime(int n)
	{
		boolean flag=true;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
				
			}	
		}
		return flag;
	}
	public void tableNo(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);	
		}
	}
	public int divide(int d)
	{
		return d/10;
		
	}
	public boolean getPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0) {
				return true;
			}
		
		}
		return false;
		
	}

}
