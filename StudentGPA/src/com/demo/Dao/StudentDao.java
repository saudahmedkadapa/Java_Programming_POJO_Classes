package com.demo.Dao;

import com.demo.Beans.Student;

public class StudentDao {
	static Student[] stud;
	static int count=0;
	static
	{
	stud=new Student[10];
	
	stud[0]=new Student(0,"krunal",1,2,3);
	count=1;
	}
	
	public void add(Student s)
	{
		if(count<stud.length) {
			stud[count]=s;
			count++;	
			System.out.println("added");
		}
		else {
			System.out.println("array is full");
		}
	}

	public Student[] get() {
		
		return stud;
	}

	public double getgpa(int id) {
//		double gpa=(((1/3)*stud[id].getM1())+((1/2)*stud[id].getM2())+((1/4)*stud[id].getM3()));
		double gpa = (stud[id].getM1()+stud[id].getM2()+stud[id].getM3())/3;
		return gpa;
	}

	public void getId(int id) {
		System.out.println(stud[id]);
		
		
	}

	public Student[] getsearchName(String name) {
		Student[] n=new Student[10];
		int index=0;
		for(Student e:stud)
		{
			if(e!=null)
			{
				if(e.getName().equals(name))
				{
					n[index]=e;
					index++;
				}
			}				
		}
		return n;
	}

}
