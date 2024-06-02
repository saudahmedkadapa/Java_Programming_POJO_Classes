package com.demo.beans;

import java.io.Serializable;
import java.time.LocalDate;

public class Medicine implements Serializable {
	int Med_id;
	String Med_name;
	LocalDate date_of_expiry;
	String Company_name;
	int qty;
	float price;
	LocalDate date_mfg;
	public Medicine() {
		super();
	}
	public Medicine(int med_id, String med_name, LocalDate date_of_expiry, String company_name, int qty, float price,
			LocalDate date_mfg) {
		super();
		Med_id = med_id;
		Med_name = med_name;
		this.date_of_expiry = date_of_expiry;
		Company_name = company_name;
		this.qty = qty;
		this.price = price;
		this.date_mfg = date_mfg;
	}
	public int getMed_id() {
		return Med_id;
	}
	public void setMed_id(int med_id) {
		Med_id = med_id;
	}
	public String getMed_name() {
		return Med_name;
	}
	public void setMed_name(String med_name) {
		Med_name = med_name;
	}
	public LocalDate getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(LocalDate date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public String getCompany_name() {
		return Company_name;
	}
	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getDate_mfg() {
		return date_mfg;
	}
	public void setDate_mfg(LocalDate date_mfg) {
		this.date_mfg = date_mfg;
	}
	@Override
	public String toString() {
		return "Medicine [Med_id=" + Med_id + ", Med_name=" + Med_name + ", date_of_expiry=" + date_of_expiry
				+ ", Company_name=" + Company_name + ", qty=" + qty + ", price=" + price + ", date_mfg=" + date_mfg
				+ "]";
	}
	

}
