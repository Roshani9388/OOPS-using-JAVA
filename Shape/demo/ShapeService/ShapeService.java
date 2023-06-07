package com.demo.ShapeService;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeService {
	
	private static Shape[] sarr;
	private static int cnt;
	
	
	static
	{
		 sarr=new Shape[20];
		 cnt=0;
		
	}

	public static void addNewShape(int ch) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color:");
		String color=sc.next();
		switch(ch)
		{
			case 1:
				System.out.println("Enter radius:");
				int r=sc.nextInt();
				sarr[cnt]=new Circle(color,r);
				break;
			
			case 2:
				System.out.println("Enter base:");
				int b=sc.nextInt();
				System.out.println("Enter height:");
				int h=sc.nextInt();
				sarr[cnt]=new Rectangle(color,b,h);
				break;
				
			case 3:
				System.out.println("Enter base:");
				 b=sc.nextInt();
				System.out.println("Enter height:");
				 h=sc.nextInt();
				System.out.println("Enter side 1:");
				int s1=sc.nextInt();
				System.out.println("Enter side 2:");
				int s2=sc.nextInt();
				sarr[cnt]=new Triangle(color,b,h,s1,s2);
				break;
		}
		
		cnt++;
		
		
	}

	public static void dispalyAll() {
		for(int i=0;i<cnt;i++)
		{
			System.out.println(sarr[i]);
		}
		
	}

	public static int serchById(int id)
	{
		for(int i=0;i<cnt;i++) {
			if(id==sarr[i].getId())
			{
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	public static String calculateDetails(int id) {
		int pos=serchById(id);
		if(pos!=-1)
		{
			float area=sarr[pos].calculateArea();
			float perimeter=sarr[pos].calculatePerimeter();
			
			return "area= "+area+" and perimeter = "+perimeter;
		}
		
		return null;
	}

	public static String calculateNumber() {
		int ccnt=0,rcnt=0,tcnt=0;
		for(int i=0;i<cnt;i++)
		{
			if(sarr[i] instanceof Circle)
				ccnt++;
			
			else if(sarr[i] instanceof Triangle)
				tcnt++;
			
			else
				rcnt++;
			
		}
		return "Circle count= "+ccnt+"\n Triangle count= "+tcnt +"\n Rectangle count= "+rcnt;
	}
}
