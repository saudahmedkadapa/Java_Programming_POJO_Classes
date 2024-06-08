package com.demo.Test;

import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("demo.txt");
			fos.write(83);
			fos.write(65);
			fos.write(85);
			fos.write(68);
			fos.close();
			System.out.println("Success");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
