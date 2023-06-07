package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.comparator.MyDesignationComparator;
import com.demo.comparator.MyNameComparator;

public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> elist;
	
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(11,"Roshani","manager",90000));
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}
	@Override
	public List<Employee> getAllEmployees() {
		for(int i=0;i<elist.size();i++)
		{
			System.out.println(elist.get(i));
		}
	return null;
}

	

	@Override
	public Employee dispalyInFoById(int id) {
//		for(int i=0;i<elist.size();i++)
//		{
//			if(elist.get(i).getEmpid()==id) {
//				return elist.get(i);
//			}
//			
//		}
//		
//		return null;
		
		
		int pos=elist.indexOf(new Employee(id));
		if(pos!=-1)
			return elist.get(pos);
		
			return null;
		
		
	}
	@Override
	public List<Employee> dispalyInFoByName(String nm) {
		for(int i=0;i<elist.size();i++)
		{
			if(elist.get(i).getName().equals(nm)) {
				System.out.println(elist.get(i));
				return null;
			}
		}
		System.out.println("Not Found");
		return null;
		
	}
	@Override
	public List<Employee> sortBySal() {
		List<Employee> newlist=new ArrayList<>();
		for(Employee e:elist) {
			newlist.add(e);
		}
		 newlist.sort(null);
		return newlist;
		
		
		
	}
	@Override
	public List<Employee> sortByNm() {
		List<Employee> newlist=new ArrayList<>();
		for(Employee e:elist)
			newlist.add(e);
		newlist.sort(new MyNameComparator());
		return newlist;
	}
	@Override
	public boolean modifySal(int id, long sal) {
		Employee e=dispalyInFoById(id);
		e.setSalary(sal);
		return true;
		
		
	}

	@Override
	public boolean deleteInfoById(int id) {
		Employee e=dispalyInFoById(id);
		elist.remove(e);
		return true;
		
	}
	@Override
	public List<Employee> sortByDesignation() {
		
		List<Employee> newlist=new ArrayList<>();
		for(Employee e:elist)
			newlist.add(e);
		newlist.sort(new MyDesignationComparator());
		return newlist;
	}

}
