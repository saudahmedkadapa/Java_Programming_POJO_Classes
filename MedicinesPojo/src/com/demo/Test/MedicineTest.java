package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Medicine;
import com.demo.service.MedicineService;
import com.demo.service.MedicineServiceImpl;

public class MedicineTest {

	public static void main(String[] args) {
		
		int Choice ;
		Scanner sc=new Scanner(System.in);
		MedicineService mservice=new MedicineServiceImpl();
		
		List<Medicine>mtemp=null;
		boolean Status;
		
		do {
			//Functionalities and Choice For user 
			
			System.out.println("1.Add New Medicine\n2.Delete Medicine"
		      		+ "\n3.Search Medicine\n4.Search Medicine based on price"
		      		+ "\n5.Display\n6.Exit\nChoice :");
			Choice=sc.nextInt();
			
			switch(Choice)
			{
			case 1:
				Status=mservice.Addnew();
				if(Status)
				{
					System.out.println("Medicine Added Successfully");
				}
				else
				{
					System.out.println("Something Went Wrong!!");
				}
					break;
					
			case 2:
				System.out.println("Enter Name of Medicine To be Deleted");
				  String Medname=sc.next();
				  Status=mservice.Delete(Medname);
				  if(Status)
				  {
					  System.out.println("Medicine Deleted Successfully Successfully");
				  }
				  else
				  {
					  System.out.println("No Such Record Found");
				  }
				  break;
			case 3:
				 System.out.println("Enter Date of Expiry To Search Medicines");
				  String dt=sc.next();
				  
				  mtemp=mservice.Serchonexp(dt);
				  if(mtemp==null)
				  {
					  System.out.println("No record");
				  }
				  for(Medicine M:mtemp)
				  {
					  System.out.println(M);
				  }
				  break;
			case 4:
				 System.out.println("Enter Price To Search Medicines");
				  float price=sc.nextFloat();
				  
				  mtemp=mservice.Searchonprice(price);
				  
				  for(Medicine M:mtemp)
				  {
					  System.out.println(M);
				  }
				  break;
			case 5:
				 mtemp=mservice.Display();
				  for(Medicine M:mtemp)
				  {
					  System.out.println(M);
				  }
				  break;
			 case 6:
				  mservice.writefile();
				  System.out.println("Exit Successfull");
				  break;
			  default :
				 System.out.println("Thank You!!!");
				
			}
			
				

	}while(Choice > 0 && Choice < 6);

}
}
