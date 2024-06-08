package com.demo.enums;

public enum Grade {
	Distinction(80,100),First(65,79),Second(50,64),Pass(40,49),Fail(0,39),user;
	private int min,max;

	private Grade(int min, int max) {
		this.min = min;
		this.max = max;
	}
	private Grade()
	{
		
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	
	
	

}
