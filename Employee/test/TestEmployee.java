package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImplm;

public class TestEmployee {
	public static void main(String ar[]) {
		int choice=0;
		EmployeeService es=new EmployeeServiceImplm();
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\t\t ************************ MENU *********************");
				System.out.println("\n 1. Add new Employee \n 2. DisplayAll\n 3. Display By Id\n 4. Display by Name\n 5. Sort by Salary\n 6. Sort by Name\n 7. Modify Salary\n 8. Delete by Id\n 9. Sort By Designation \n 10. Exit");
				System.out.println("\n Enter Choice: ");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					es.addNewEmployee();
					break;
					
				case 2:
					
					es.displayAll();
					
					break;
					
				case 3:
					System.out.println("Enter Id to serach: ");
					int id=sc.nextInt();
					Employee e=es.displayById(id);
					if(e!=null)
						System.out.println(e);
					else
						System.out.println("Record not found");
					break;
					
				case 4:
					System.out.println("Enter name to serach: ");
					String nm=sc.next();
					es.displayByName(nm);
					break;
	
				case 5:
					List<Employee> elist= es.sortBySalary();
					elist.forEach(a->{System.out.println(a);});
					break;
					
				case 6:
					 elist=es.sortByName();
					 for(int i=0;i<elist.size();i++)
						 System.out.println(elist.get(i));
					//elist.forEach(a->{System.out.println(a);});
					break;
					
				case 7:
					System.out.println("Enter id : ");
					id=sc.nextInt();
					System.out.println("and salary to be modify: ");
					long sal=sc.nextLong();
					boolean ans=es.modifySalary(id,sal);
					if(ans)
						System.out.println("Salary Updated Successfully...");
					else
						System.out.println("Not found");
					break;
					
				case 8:
					System.out.println("Enter id : ");
					id=sc.nextInt();
					ans=es.deleteById(id);
					if(ans)
						System.out.println("Record deleted Successfully...");
					else
						System.out.println("Not found");
					break;
					
				case 9:
					 elist=es.sortByDesig();
//					 for(int i=0;i<elist.size();i++)
//						 System.out.println(elist.get(i));
					elist.forEach(a->{System.out.println(a);});
					break;
					
				case 10:
					sc.close();
					System.out.println("Thanks for visiting");
					break;
				
				default:
					System.out.println("Enter Valid Choice");
				}
		}while(choice!=10);	
	}
}
