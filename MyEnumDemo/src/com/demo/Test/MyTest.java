package com.demo.Test;

import java.util.Scanner;

import com.demo.enums.Grade;

public class MyTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a grade \n ('Distinction '\n 'First' \n 'Second' \n 'Pass' \n 'Fail'):");
		String user=sc.nextLine();
		Grade grade=Grade.valueOf(user);
		
		switch(grade)
		{
		case Distinction:
			System.out.println("You passses with Distinction"+grade.getMax()+ " "+grade.getMin());
			break;
		case First:
			System.out.println("First Class Pass"+grade.getMax() +" "+grade.getMin());
			break;
		case Second:
			System.out.println("Second Class Pass"+grade.getMax() +" "+grade.getMin());
			break;
		case Pass:
			System.out.println("Just Pass"+grade.getMax() +" "+grade.getMin());
			break;
		case Fail:
			System.out.println("!!Fail "+grade.getMax() +" "+grade.getMin());
			break;
			default:
				System.out.println("Invalid!!!");
		
		}
		
		
		

	}

}
