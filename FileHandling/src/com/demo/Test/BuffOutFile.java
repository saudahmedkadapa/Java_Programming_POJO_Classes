package com.demo.Test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffOutFile {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("demo.txt");
			BufferedOutputStream bf=new BufferedOutputStream(fos);
			String s="Welcome to Strange World";
			byte b[]=s.getBytes();
			bf.write(b);
			bf.flush();
			bf.close();
			fos.close();
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
