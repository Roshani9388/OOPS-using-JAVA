package com.demo.beans;

public class Triangle extends Shape {
	private int base;
	private int height;
	private int s1;
	private int s2;
	public Triangle() {
		super();
	}
	public Triangle(String c,int base, int height, int s1, int s2) {
		super(c);
		this.base = base;
		this.height = height;
		this.s1 = s1;
		this.s2 = s2;
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
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", s1=" + s1 + ", s2=" + s2 + "]";
	}
	@Override
	public float calculateArea() {
		float a=(base*height)/2;
		return a;
		
	}
	@Override
	public float calculatePerimeter() {
		float p=base+s1+s2;
		return p;
		
	}
	
	
}
