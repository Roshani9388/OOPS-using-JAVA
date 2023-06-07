package com.demo.test;

import java.util.Scanner;

import com.demo.ShapeService.ShapeService;



public class ShapeTester {

	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
	
		do
		{
			System.out.println("**************** MENU *****************\n");
		
			System.out.println("1. Add new Shape \n 2. Display all \n 3. Calculate area and Perimeter of specific shape\n 4. Exit.");
			System.out.println("Enter choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			
			
				case 1:
					System.out.println("\n 1. Circle \n 2. Rectangle\n 3. Triangle");
					int choice=sc.nextInt();
					ShapeService.addNewShape(choice);
				break;
				
				case 2:
					ShapeService.dispalyAll();
				break;
				
				case 3:
					System.out.println("Enter id to search:");
					int id=sc.nextInt();
					String d=ShapeService.calculateDetails(id);
					if(d!=null)
					 System.out.println("Area and Perimeter is "+d);
					else
						System.out.println("Not Found");
					break;
					
				case 4:
					sc.close();
					System.out.println("Thanks for visiting");
					break;
				
				default:
					System.out.println("Enter valid choice....");
			}
			
		}while(ch!=4);
		
		String ans=ShapeService.calculateNumber();
		System.out.println(ans);
		

	}

}
