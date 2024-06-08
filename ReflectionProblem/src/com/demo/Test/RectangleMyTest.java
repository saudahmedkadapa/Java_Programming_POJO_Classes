package com.demo.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.demo.beans.Rectangle;

public class RectangleMyTest {

	public static void main(String[] args) {
		Rectangle reobj=new Rectangle();
		Class cls =reobj.getClass();
		
		Constructor[] c1 = cls.getConstructors();
		
		for(Constructor a:c1)
		{
			System.out.println(a.getName());
			System.out.println(a.getParameterCount());
		}
		
		Method[] m = cls.getMethods();
		for(Method me: m)
		{
			System.out.println(me.getName());
			
		}

	}

}
