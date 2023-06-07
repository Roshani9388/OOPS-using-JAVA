package com.demo.beans;

public class Circle extends Shape{
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String c,int radius) {
		super(c);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		float a=(float)3.14*radius*radius;
		return a;
		
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public float calculatePerimeter() {
		float p=(float) ((float)2*3.14*radius);
		
		return p;
		
	}
	
	
}
