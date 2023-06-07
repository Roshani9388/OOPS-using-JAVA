package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {
		
		void addNewEmployee();

		List<Employee> displayAll();

		Employee displayById(int id);

		

		void displayByName(String nm);

		List<Employee> sortBySalary();

		List<Employee> sortByName();

		boolean modifySalary(int id, long sal);

		boolean deleteById(int id);

		List<Employee> sortByDesig();

}
