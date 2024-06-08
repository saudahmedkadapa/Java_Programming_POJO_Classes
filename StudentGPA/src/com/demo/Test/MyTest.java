package com.demo.Test;

import java.util.Scanner;

import com.demo.Beans.Student;
import com.demo.Service.StudentService;

public class MyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		ss.addstudent();
		Student[] s = ss.display();
		for(Student st:s)
		{
			if(st!=null)
			{
				System.out.println(st.getStudid()+" "+st.getName()+" "+st.getM1()+" "+st.getM2()+" "+st.getM3());
			}
			
		}
		System.out.println("enter id of student you want gpa: ");
		int i = sc.nextInt();
		System.out.println(ss.gpa(i));
		
		System.out.println("Enter Id you want search=");
		int id=sc.nextInt();
		ss.searchById(id);
		
		System.out.println("Enter name to search=");
		String name=sc.next();
		
		Student[] nm=ss.searchByName(name);
		 
		for(Student st:nm)
		{
			if(st!=null)
			{
				System.out.println(st.getStudid()+" "+st.getName()+" "+st.getM1()+" "+st.getM2()+" "+st.getM3());
			}
			
		}
		
		
		
	

	}

}
