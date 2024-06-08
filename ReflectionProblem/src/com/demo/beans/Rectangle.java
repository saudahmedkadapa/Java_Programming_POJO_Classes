package com.demo.beans;

public class Rectangle {
	public float length;
	public double width;
	public double Area;
	
	public Rectangle() {
		super();
	}
	public Rectangle(float length, double width, double area) {
		super();
		this.length = length;
		this.width = width;
		Area = area;
		
		
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Area=" + Area + "]";
	}
	

}
