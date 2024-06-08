package com.demo.test;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.demo.bean.MyClass;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		Class cls=obj.getClass();
		System.out.println(obj.getClass());
		Constructor[] c1=cls.getConstructors();
		
		
		
//

		
		
	

	}

}
