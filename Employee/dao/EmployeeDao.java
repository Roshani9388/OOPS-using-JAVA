package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	

	List<Employee> getAllEmployees();

	Employee dispalyInFoById(int id);

	

	List<Employee> dispalyInFoByName(String nm);

	List<Employee> sortBySal();

	List<Employee> sortByNm();



	boolean modifySal(int id, long sal);

	boolean deleteInfoById(int id);



	List<Employee> sortByDesignation();
	

}
