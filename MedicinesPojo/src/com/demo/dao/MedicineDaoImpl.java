package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Medicine;

public class MedicineDaoImpl implements MedicineDao {
	
	static List<Medicine> medlist=null;
	
	static {
		medlist=new ArrayList<>();
		String dt1="05/05/2024";
		String dt2="05/05/2024";
		LocalDate mfgdt=LocalDate.parse(dt1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate expdt=LocalDate.parse(dt2,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		medlist.add(new Medicine(1,"Combiflame",mfgdt,"Cipla",10,5.5f,expdt));
		
		dt1="01/02/2013";
		dt2="02/10/2025";
		mfgdt=LocalDate.parse(dt1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		expdt=LocalDate.parse(dt2,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		medlist.add(new Medicine(2,"Dolo650",mfgdt,"Cipla",10,5.5f,expdt));
		
		dt1="06/06/2013";
		dt2="05/05/2024";
		
	   mfgdt=LocalDate.parse(dt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	   expdt=LocalDate.parse(dt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	   medlist.add(new Medicine(3,"Pan-D",mfgdt,"Cipla",10,2.5f,expdt));
		
		
		
	}

	@Override
	public boolean Save(Medicine mobj) {
		return medlist.add(mobj);
}

	public boolean remove(String medname) {
		Medicine M=null;

		for(int i=0;i<medlist.size();i++)
		{
			M=medlist.get(i);
			if(M.getMed_name().equals(medname))
			{
			   return medlist.remove(M);
			}
		}
		return false;
}

	public List<Medicine> expsaerch(LocalDate expdt) {
		 List<Medicine> expiredmed=new ArrayList<>();
			for(Medicine M:medlist)
		  {
			  if(expdt.isAfter(M.getDate_of_expiry()))
			  {
				  expiredmed.add(M);
			  }
		  }
			return expiredmed;

		}

	@Override
	public List<Medicine> findbyprice(float price) {
		List<Medicine> plist=new ArrayList<>();
		Medicine M=null;
		for(int i=0;i<medlist.size();i++)
		{
			M=medlist.get(i);
			if(M.getPrice()>=price)
			{
			    plist.add(M);	
			}
		}
		if(plist.isEmpty())
		{
			return null;
		}
		else
		{
			return plist;
	
		}
	}

	@Override
	public List<Medicine> findall() {
		// TODO Auto-generated method stub
		return medlist;
	}

	public void write() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("MedicineRecord.txt")))
		{
			for(int i=0;i<medlist.size();i++)
			{
				oos.writeObject(medlist.get(i));
			}
		} 
		catch(EOFException e)
		{
			System.out.println("At The End of file");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	@Override
	public void read() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("MedicineRecord.txt")))
		{
			 Medicine M=(Medicine) ois.readObject();
			while(M!=null)
			{
				if(M.getMed_id()>4)
				{
					medlist.add(M);	
				}
				
				 
			     M=(Medicine) ois.readObject();
			  
			}
		}catch(EOFException e)
		{
			System.out.println("Welcome");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
	}
	


