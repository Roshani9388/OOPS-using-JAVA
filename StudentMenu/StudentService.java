package StudentMenu;
import java.util.Scanner;

public class StudentService {
	
	static Student[] ss;
	static float gpa;
	static int cnt;
	static {
		ss=new Student[2];
		cnt=0;
		gpa=0;
		
	}
	//static StudentService[] ss=new StudentService[2];

	public static  void getInfo() {
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<ss.length;i++)
		{
			System.out.println("Enter Student Id: ");
			int sid=s.nextInt();
			
			System.out.println("Enter Student name: ");
			String sname=s.next();
			
			System.out.println("Enter m1: ");
			int m1=s.nextInt();
			
			System.out.println("Enterm2: ");
			int m2=s.nextInt();
			
			System.out.println("Enter m3: ");
			int m3=s.nextInt();
			
			
			
			 ss[i]=new Student(sid,sname,m1,m2,m3);
			 
		}
		cnt++;
		
		
		
	
		
		
	}

	public static void displayAll() {
		
		for(int i=0;i<cnt;i++)
		{
			System.out.println("Student Details:\n");
			System.out.println("_____________________");
			
			System.out.println("Student Id : "+ss[i].getStudId());
			System.out.println("Student name : "+ss[i].getName());
			
			System.out.println("M1 : "+ss[i].getM1());
			System.out.println("M2 : "+ss[i].getM2());
			System.out.println("m3 : "+ss[i].getM3());
			
			
		}
		
	}

	public static void searchByName(String nm) {
		for(int i=0;i<cnt;i++)
		{
			if(ss[i].getName().equals(nm))
			{
				System.out.println("Student Details:\n");
				System.out.println("_____________________");
				
				System.out.println("Student Id : "+ss[i].getStudId());
				System.out.println("Student name : "+ss[i].getName());
				
				System.out.println("M1 : "+ss[i].getM1());
				System.out.println("M2 : "+ss[i].getM2());
				System.out.println("m3 : "+ss[i].getM3());
			}
			
				
		}
		
	}

	public static Student searchById(int id) {
		for(int i=0;i<cnt;i++)
		{
			if(ss[i].getStudId()==id)
			{
				System.out.println("Student Details:\n");
				System.out.println("_____________________");
				
				System.out.println("Student Id : "+ss[i].getStudId());
				System.out.println("Student name : "+ss[i].getName());
				
				System.out.println("M1 : "+ss[i].getM1());
				System.out.println("M2 : "+ss[i].getM2());
				System.out.println("m3 : "+ss[i].getM3());
				
				return ss[i];
			}
			
			
			
				
		}
		return null;
		
	}

	public static void searchByIdGPA(int id1) {
		
		
			Student temp=searchById(id1);
			int per=(temp.getM1()+temp.getM2()+temp.getM3())/3;
		
			gpa=(float) (((0.34)*temp.getM1())+((0.5)*temp.getM2())+((0.25)*temp.getM3()));
			
			// gpa=(per/100)*4;
			
			System.out.println("per for student id ="+id1+ " is " + per);
			System.out.println("GPA for student id ="+id1+ " is " + gpa);
				
		
		
	}

	

}
