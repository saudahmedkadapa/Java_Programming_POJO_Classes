package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Medicine;
import com.demo.dao.MedicineDao;
import com.demo.dao.MedicineDaoImpl;

public class MedicineServiceImpl implements MedicineService {
	
	private MedicineDao mdao =null;
	Scanner sc=new Scanner(System.in);
	Medicine Mobj=null;
	
	public MedicineServiceImpl()
	{
		mdao=new MedicineDaoImpl();
	}

	@Override
	public boolean Addnew() {
		
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		
		System.out.println("Enter Name of Medicine");
		String Name=sc.next();
		
		System.out.println("Enter Expiry Date of Medicine dd/MM/yyyy");
		String dt=sc.next();
		LocalDate expdt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Enter Company Name of Medicine");
		String C_name=sc.next();
		
		System.out.println("Enter Quantity of Medicine");
		int qty=sc.nextInt();
		
		System.out.println("Enter Price of Medicine");
		float price=sc.nextFloat();
		
		System.out.println("Enter Manufracturing Date of Medicine dd/MM/yyyy");
		String dt1=sc.next();
		LocalDate mfgdt=LocalDate.parse(dt1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Mobj=new Medicine(id,Name,expdt,C_name,qty,price,mfgdt);
		return mdao.Save(Mobj);
		
		
	}

	@Override
	public boolean Delete(String medname) {
		return mdao.remove(medname);
		
	}

	@Override
	public List<Medicine> Serchonexp(String dt) {
		String dt1=sc.next();
		LocalDate expdt=LocalDate.parse(dt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return mdao.expsaerch(expdt);
		
	}

	@Override
	public List<Medicine> Searchonprice(float price) {
		return mdao.findbyprice(price);
		
	}

	@Override
	public List<Medicine> Display() {
		return mdao.findall();
		
	}
	public void readfile() {
		// TODO Auto-generated method stub
		mdao.read();
		
	}


	@Override
	public void writefile() {
		mdao.write();	
	}
		
	
	

}
