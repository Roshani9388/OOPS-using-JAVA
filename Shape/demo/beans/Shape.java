package com.demo.beans;

 public abstract class Shape {
	private String color;
	private int id;
	private static int cnt;
	
	static {
		cnt=1;
	}
	public Shape() {
		super();
		
	}
	
	public Shape(String color) {
		super();
		this.color = color;
		id=cnt++;
	}

	public int getId() {
		return id;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public float calculateArea();
	abstract public float calculatePerimeter();
	
	
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}


	
}
