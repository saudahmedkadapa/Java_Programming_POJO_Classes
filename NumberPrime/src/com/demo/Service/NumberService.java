package com.demo.Service;

import com.demo.Dao.NumberDao;

public class NumberService {
	NumberDao ndao=new NumberDao();

	public NumberService() {
		super();
	}
	public boolean isPrime(int n) {
		return ndao.getPrime(n);
	}
	
}
	
	


