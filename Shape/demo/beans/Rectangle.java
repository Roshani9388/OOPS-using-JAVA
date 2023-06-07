package com.demo.beans;

public class Rectangle extends Shape {
	private int base;
	private int height;
	public Rectangle() {
		super();
	}
	public Rectangle(String c,int base, int height) {
		super(c);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + "]";
	}
	@Override
	public float calculateArea() {
		float a=base*height;
		return a;
		
	}
	@Override
	public float calculatePerimeter() {
		float p=2*(base+height);
		return p;
		
	}
	
	
}
