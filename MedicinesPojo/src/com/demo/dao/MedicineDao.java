package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Medicine;

public interface MedicineDao {

	boolean Save(Medicine mobj);

	boolean remove(String medname);

	List<Medicine> expsaerch(LocalDate expdt);

	List<Medicine> findbyprice(float price);

	List<Medicine> findall();

	void write();

	void read();

}
