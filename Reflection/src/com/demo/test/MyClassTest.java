package com.demo.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.*;
public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass(1,"krunal");
		Class cls = obj.getClass();
		
//		Constructor[] c1 = cls.getConstructors();
//		
//		for(Constructor a:c1)
//		{
//			System.out.println(a.getName()+"-->"+a.getParameters());
//		}
//		
//		Method[] m = cls.getMethods();
//		for(Method me: m)
//		{
//			System.out.println(me.getName()+"--->"+me.getParameters());
//		}
		
		Field[] f = cls.getDeclaredFields();
		for(Field fi:f)
		{
			System.out.println("name: "+fi.getName());
			System.out.println("type: "+fi.getType());
			System.out.println("type: "+fi.getType().getName());
			System.out.println("class: "+fi.getClass());
		}
		f[0].setAccessible(true);
		f[1].setAccessible(true);
		
		try {
			f[0].set(obj,1);
			System.out.println(obj);
			f[1].set(obj,"krunal");
			System.out.println(obj);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method tm;
		try {
			tm = cls.getDeclaredMethod("method1", int.class);
			try {
//				tm.invoke(obj, 5);
				System.out.println(tm.invoke(obj, 5));
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
