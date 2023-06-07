package StudentMenu;
//Write a program to maintain student information. For each student store studid, name, m1, 
//m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as 
//follows


public class Student {

	private int studId,m1,m2,m3;
	private String name;

	public Student()
	{
		studId=0;
		m1=0;
		m2=0;
		m3=0;
		name=null;
	}
	
	public Student(int studId,String name,int m1,int m2,int m3)
	{
		this.studId=studId;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.name=name;
		
	}

	public int getStudId() {
		return studId;
	}

	public int getM1() {
		return m1;
	}

	public int getM2() {
		return m2;
	}

	public int getM3() {
		return m3;
	}

	public String getName() {
		return name;
	}
	
//	public int getStudId()
//	{
//		return studId;
//	}
//	
//	public void getName(String nm)
//	{
//		this.name=nm;
//	}
//	
//	public void getM1(int m1)
//	{
//		this.m1=m1;
//	}
//	
//	public void getM2(int m2)
//	{
//		this.m2=m2;
//	}
//	
//	public void getM3(int m3)
//	{
//		this.m3=m3;
//	}
//	
	
	
}
