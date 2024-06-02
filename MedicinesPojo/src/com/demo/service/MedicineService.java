package com.demo.service;

import java.util.List;

import com.demo.beans.Medicine;

public interface MedicineService {

	boolean Addnew();

	boolean Delete(String medname);

	List<Medicine> Serchonexp(String dt);

	List<Medicine> Searchonprice(float price);

	List<Medicine> Display();

	void writefile();

}
