package friends;

import java.util.Scanner;

public class FriendTesterArray {

	public static void main(String[] args) {
		int c=0;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("\n ************ MENU ************** ");
		System.out.println("\n 1. Add new Friend \n 2. Search by id \n 3. Search by name \n 4. Display All Friends \n 5. Search by Address\n 6. search by month \n 7. Exit");
		
		System.out.println("\n Enter Your choice: ");
		c=s.nextInt();
		
		
			switch(c)
			{
			
				case 1:
					FriendService.addNewFriend();
					break;
					
				case 2:
					System.out.println("Enter Id to serach: ");
					int id=s.nextInt();
					Friends f=FriendService.searchById(id);
					if(f!=null)
						System.out.println(f);
					else
						System.out.println("Not Found......");
					break;
					
				case 3:
					s.nextLine();
					System.out.println("Enter name to serach: ");
					String name=s.nextLine();
					FriendService.searchByName(name);
					break;
					
				case 4:
					FriendService.display();
					break;
					
				case 5:
					s.nextLine();
				
					System.out.println("Enter address to serach: ");
					String add=s.nextLine();
					FriendService.serachByAdress(add);
					break;
					
				case 6:
					//s.nextLine();
					System.out.println("Enter month to serach: ");
					int m=s.nextInt();
					int r=FriendService.serachByMonth(m);
					if(r!=0)
					{
						System.out.println(r+" No of friends having birthday in "+m);
					}
					else
						System.out.println("Record not Found.....");
					
					break;
					
				case 7:
					s.close();
					//System.exit(0);
					System.out.println("Thank you!!!!");

					
				default:
					System.out.println("Enter Valid Choice::");
			}
		}while(c!=7);
	}

}
