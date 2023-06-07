package StudentMenu;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		int ch;
		do {
			Scanner s=new Scanner(System.in);
				System.out.println("1. Add Student\n 2. Display All Student\n 3. Search by Name\n 4. Search by id \n 5. Calculate GPA \n 6. Exit");
				System.out.println("Enter choice : ");
				 ch=s.nextInt();
				switch(ch)
				{
				
					case 1:
					StudentService.getInfo();
					break;
					
					case 2:
						StudentService.displayAll();
					break;
						
					case 3:
						System.out.println("Enter Name to search: ");
						String nm=s.next();
						StudentService.searchByName(nm);
						break;
						
					case 4:
						System.out.println("Enter id to search: ");
						int id=s.nextInt();
						Student s1=StudentService.searchById(id);
						if(s1!=null)
							System.out.println("Student Details: \n"+s1);
						else
							System.out.println("Record not found....");
						break;
						
					case 5:
						System.out.println("Enter id to calculate GPA: ");
						int id1=s.nextInt();
						StudentService.searchByIdGPA(id1);
						break;
						
					case 6:
						s.close();
						System.out.println("Thanks for Visiting....");
						System.exit(0);
				}
			}while(ch!=6);

	}

}
