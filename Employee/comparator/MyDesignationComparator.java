package com.demo.comparator;

import java.util.Comparator;



import com.demo.beans.Employee;

public class MyDesignationComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDesg().compareTo(o2.getDesg());
	}
}
