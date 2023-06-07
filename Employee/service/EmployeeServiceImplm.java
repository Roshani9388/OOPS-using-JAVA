package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImplm implements EmployeeService{
	
	private EmployeeDao ed;
	
	

	public EmployeeServiceImplm() {
		super();
		this.ed=new EmployeeDaoImpl();
	}



	@Override
	public void addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emloyee id ");
		int id=sc.nextInt();
		
		System.out.println("Enter emloyee name ");
		String name=sc.next();
		
		System.out.println("Enter emloyee designation ");
		String desg=sc.next();
		
		System.out.println("Enter emloyee Salary ");
		long sal=sc.nextLong();
		
		Employee e=new Employee(id,name,desg,sal);
		ed.save(e);
		
	
	}



	@Override
	public List<Employee> displayAll() {
		return ed.getAllEmployees();
		
	}



	@Override
	public Employee displayById(int id) {
		 return ed.dispalyInFoById(id);
		
		
	}



	@Override
	public void displayByName(String nm) {
		ed.dispalyInFoByName(nm);
		
	}



	@Override
	public List<Employee> sortBySalary() {
		return ed.sortBySal();
		
	}



	@Override
	public List<Employee> sortByName() {
		
		return ed.sortByNm();
	}



	@Override
	public boolean modifySalary(int id, long sal) {
		
		return ed.modifySal(id,sal);
	}



	@Override
	public boolean deleteById(int id) {
			return ed.deleteInfoById(id);
	}



	@Override
	public List<Employee> sortByDesig() {
		
		return ed.sortByDesignation();
	}



	




	



	

}
