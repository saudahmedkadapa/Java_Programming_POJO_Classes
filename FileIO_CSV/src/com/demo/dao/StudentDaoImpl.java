package com.demo.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static List<Student> slist = new ArrayList<>();
	

	@Override
	public boolean save(Student s) {
		return slist.add(s);
	}


	@Override
	public List<Student> findAlll() {
		return slist;
	}


	@Override
	public void writeFile() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));){
			for(Student s:slist) {
				bw.write(s.getSid()+s.getSname()+","+s.getSdegree()+","+s.getSemail()+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
