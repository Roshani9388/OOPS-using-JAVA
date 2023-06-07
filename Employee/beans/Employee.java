package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String name;
	private String desg;
	private long salary;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, String desg,long salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desg = desg;
		this.salary=salary;
	}
	public Employee(int id) {
		super();
		this.empid=id;
		this.name = null;
		this.desg = null;
		this.salary=0;
	}
	
	public boolean equals(Object ob)
	{
		return this.empid==((Employee)ob).empid;
		
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}
	

	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary)
			return 1;
		else if(this.salary==o.salary)
		return 0;
		else
			return -1;
	}
	
}
