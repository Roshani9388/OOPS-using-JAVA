package friends;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FriendService {
	
	private static Friends farr[];
	private static int count;
	
	
	static
	{
		farr=new Friends[50];
		farr[0]=new Friends(1,"Sagar","sagar@gmail.com","44444",new Date(),"warje");
		farr[1]=new Friends(2,"roshani","rosh@gmail.com","663434",new Date(),"chinchwad");
		farr[2]=new Friends(3,"rutu","rutu@yahoo.com","989897",new Date(),"baner");
		count=3;
		
	}

	public static Friends searchById(int id) {
		for(int i=0;i<count;i++)
		{
			if(id==farr[i].getFid())
				return farr[i];
		}
		return null;
	}

	public static int searchByName(String name) {
		int c=0;
		for(int i=0;i<count;i++)
		{
			if(farr[i].getFname().equals(name))
			{
				c++;
				System.out.println(farr[i]);
			}
			
			else
				System.out.println("Record not Found.....");
				
		}
		return c;
	}

	public static void display() {
		for(int i=0;i<count;i++)
		{
			System.out.println(farr[i]);
		}
		
	}

	public static void addNewFriend() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		int fid=s.nextInt();
		
		s.nextLine();
		System.out.println("Enter name");
		String fname=s.nextLine();
		
		System.out.println("Enter mailid");
		String fmid=s.nextLine();
		
		System.out.println("Enter mobile no");
		String fno=s.nextLine();
		
		System.out.println("Enter date(dd/mm/yyyy)");
		String fdate=s.next();
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		try {
		  dt=sdt.parse(fdate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		s.nextLine();
		System.out.println("Enter adress");
		String faddress=s.nextLine();
		
		
		farr[count]=new Friends(fid,fname,fmid,fno,dt,faddress);
		count++;
		
		}

	public static void serachByAdress(String add) {
		
		for(int i=0;i<count;i++)
		{
			if(farr[i].getAddress().equals(add))
			{
				
				System.out.println(farr[i]);
			}
			
		}
		System.out.println("Record not Found.....");
	}

	public static int serachByMonth(int m) {
		int cnt1=0;
		for(int i=0;i<count;i++)
		{
			int dm=farr[i].getBdate().getMonth();
			if((m-1)==dm)
			{
				
				System.out.println(farr[i]);
				cnt1++;
			}
			
		}
		return cnt1;
		
	}
	


}
