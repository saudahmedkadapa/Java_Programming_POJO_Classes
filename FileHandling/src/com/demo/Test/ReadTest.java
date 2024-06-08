package com.demo.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream fn=new FileInputStream("demo.txt");
			int i=0;
			while((i=fn.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
			fn.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		

	}

}
