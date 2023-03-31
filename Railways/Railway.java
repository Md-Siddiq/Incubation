package Railways;
import java.util.Scanner;
import java.util.ArrayList;
class Railway 
	{
	public static void main(String[] args) 
		{
			Working ob=new Working();
			ob.start();
		}
	}
class Working
{
	int lb;
	int mb;
	int ub;
	int rac;
	int wl;
	private Scanner scan=new Scanner(System.in);
	public void start()
	{
		int lb;
		int mb;
		int ub;
		int rac;
		int wl;
		System.out.println("Seats Initialization");
		System.out.println("How many lower berth ?");
		lb=scan.nextInt();
		System.out.println("How many upper berth ?");
		ub=scan.nextInt();
		System.out.println("How many middle berth ?");
		mb=scan.nextInt();
		System.out.println("How many rac berth ?");
		rac=scan.nextInt();
		System.out.println("How many waiting list");
		wl=scan.nextInt();
		IndianRailways obj=new IndianRailways(lb,mb,ub,rac,wl);
		obj.work();
	}
}
class IndianRailways
{
	private Scanner scan=new Scanner(System.in);
	int lb;
	int mb;
	int ub;
	int rac;
	int wl;
	int index;
	int Countlb=0;//Count
	int Countmb=0;
	int Countub=0;
	int Countrac=0;
	int Countwl=0;
	int pnr=1111;
	int size;
	int total;
	int Gentotal;
	int seatNo=1;
	ArrayList<Data> data;
	public IndianRailways(int lb,int mb,int ub,int rac,int wl)
	{
		this.lb=lb;
		this.mb=mb;
		this.ub=ub;
		this.rac=rac;
		this.wl=wl;
		this.size=lb+mb+ub+rac+wl;
		Gentotal=lb+mb+ub;//To book the general
		total=size;//Total Space in ArrayList
		data=new ArrayList<Data>(size);
	}
	public IndianRailways() 
	{
	}
	public void work()
	{
		int input=-1;
		do
		{
			System.out.println("1.Book\n2.Cancel\n3.Print Booked Tickets\n4.Print Available Tickets\n5.Exit");
			input=scan.nextInt();
			switch(input) 
			{
			case 1:
				booking();
				break;
			}
		}
		while(input!=5);
	}
	public void booking()
	{
		System.out.println("How many tickets are you going to book");
		int ticket=scan.nextInt();
		if(ticket<total)
		{
			if(ticket<=Gentotal)
			{	
				for(int i=0;i<ticket;i++)
				{
					System.out.println("Enter the name");
					String name=scan.next();
					System.out.println("Enter the age");
					int age=scan.nextInt();
					System.out.println("Enter the gender");
					char gender=scan.next().charAt(0);
					String berthpreference=checkBerth(age);	
					int amt=0;
					boolean baby=false;
					if(berthpreference.equals("child"))
					baby=true;
					if(berthpreference.equals("lb"))
						amt=250;
					else if(berthpreference.equals("mb"))
						amt=200;
					else if(berthpreference.equals("ub"))
						amt=180;
					data.add(new Data(name,age,gender,berthpreference,baby,pnr,seatNo++,amt));
					total--;
					Gentotal--;
				}
			}
		}
		else
		{
			System.out.println(Gentotal+"" +total);
			System.out.println("Insufficient Seats");
			display();
		}
	}
	public String checkBerth(int age)
	{
		if(age>60)
		{
			if(lb>0)
			{
				lb--;
				return "lb";
			}
			else if(mb>0)
			{
				mb--;
				return "mb";
			}
			else if(ub>0)
			{
				ub--;
				return "ub";
			}
		}
		else if(age<=5)
			return "child";
		else 
		{
			int booked =-1;
			do
			{
				System.out.println("Enter the berth lb,mb,ub");
				String b=scan.next();
				if(b.equals("lb"))
				{
					if(lb>0)
					{	
						booked =1;
						return "lb";
					}
					else 
						System.out.println("Requested Berth Not Available");
				}
				else if(b.equals("mb"))
				{
					if(mb>0)
					{
						booked=1;
						return "mb";
					}
					else 
						System.out.println("Requested Berth Not Available");
				}
					
				else if(b.equals("ub"))
				{
					if(ub>0)
					{
						booked=1;
						return "ub";
					}
					else 
						System.out.println("Requested Berth Not Available");
				}
			}
			while (booked!=1);
		}
	}
	public void display()
	{
		System.out.println("Available Seats");
		System.out.println("Number of Lower Berth : "+lb);
		System.out.println("Number of Middle Berth : "+mb);
		System.out.println("Number of Upper Berth : "+ub);
		System.out.println("Number of Rac : "+rac);
		System.out.println("Number of Waiting List : "+wl);
	}
	
}
class Data
{
	public Data(String name,int age,char gender,String berthpreference,boolean baby,int pnr,int seatNo,int cost) 
	{

		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berthpreference=berthpreference;
		this.baby=baby;
		this.pnr=pnr;
		this.seatNo=seatNo;
		this.cost=cost;
	}
	String name;
	int age;
	char gender;
	String berthpreference;
	boolean baby;
	int pnr;
	int cost;
	int seatNo;
}