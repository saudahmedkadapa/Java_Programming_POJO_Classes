package com.demo.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStream2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("demo.txt");
			String s="Welcome to CDAC";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("SUccess");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
