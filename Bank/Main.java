package Bank;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
    	
	}
}
class UpiClass
{
	private Scanner scan=new Scanner(System.in);
	private IndianBank indianBank=new IndianBank();
	private String name;
	private long number;
	private int accNum;
	private String pass;
	private int index;
	public void start()
	{
		System.out.println("Online Money Transfer");
		int input;
		do
		{
			System.out.println("1.Register\n2.Login");
			input=scan.nextInt();
			switch(input)
			{
			case 1:
					System.out.println("In which bank do you want to create account \n1.Indian Bank \n 2.Hdfc Bank");
					int choose=scan.nextInt();
					switch(choose)
					{
						case 1:
							indianBank.createAccount();
							break;
						case 2:
							login();
							break;
							
					}
				break;
			case 2:
				System.out.println("Enter the name");
				name=scan.next();
				System.out.println("Enter the number");
				number=scan.nextInt();
				System.out.println("Enter the account number");
				accNum=scan.nextInt();
				
			}
		}
		while(input!=4);
	}
	public void login()
	{
		int ind=-1;
		for(int i=0;i<2;i++)
		{
			if(ind==-1)
			{
				ind=indianBank.findAccount(name,number,accNum,pass);
			}
			if(ind==-1)
			{
				ind=i;
			}
		}
	}
}
 abstract class Bank
{          
	public abstract void createAccount();
	public abstract int findAccount(String name,long num,int acc,String pass);
	public abstract void transferAmount();
	public abstract void checkBalance();
}
 class Details
 {
	 String name;
	 long phoneNumber;
	 int accountNumber;
	 String password;
	 public Details(String name,long phoneNumber,int accountNumber,String password) 
	 {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.accountNumber=accountNumber;
		this.password=password;
	 }
 }
class IndianBank extends Bank
  {
	public IndianBank() 
	{
		indBank.add(new Details("Sid",9840709373L,1000,"sid_duke"));
		indBank.add(new Details("Harun",9840709371L,1001,"Harun1"));
		indBank.add(new Details("Aadhil",9840709372L,1002,"Aadhil2"));
		indBank.add(new Details("Thabrez",9840709374L,1003,"Thabrez3"));
		indBank.add(new Details("Anas",9840709375L,1004,"Anas4"));
		indBank.add(new Details("Jameel",9840709376L,1005,"Jameel5"));
		indBank.add(new Details("Riyaz",9840709377L,1006,"Riyaz6"));
	}
	private static ArrayList<Details> indBank=new ArrayList<>();
	private static int ac=1007;
	Scanner scan=new Scanner(System.in);
	public void createAccount() 
		{
			System.out.println("Enter the name");
			String name=scan.next();
			System.out.println("Enter the phone number");
			long num=scan.nextInt();
			System.out.println("Your Account Number is "+ac);
			System.out.println("Enter the password ");
			String pass=scan.next();
			indBank.add(new Details(name,num,ac++,pass));
		}
	
	public int findAccount(String name,long num,int acc,String pass) 
	{
		int check=-1;
		for(int i=0;i<indBank.size();i++)
		{
			if(indBank.get(i).phoneNumber==num)
			{
				if(indBank.get(i).accountNumber==acc)
				{
					if(indBank.get(i).password.equals(pass))
					{
						System.out.println("User Found");
						check=i;
					}
				}
			}
		}
		return check;
	}
	
	public void transferAmount() 
	{
		System.out.println("Enter the destination account number");
		int ac=scan.nextInt();
		for(int i=0;i<indBank.size();i++)
		{
			if(indBank.get(i).accountNumber==ac)
			{
				
			}
		}
	}
	
	public void checkBalance() 
	{
	
		
	}

  }
class HdfcBank extends Bank
{
	private ArrayList<Details> hdfcBank=new ArrayList<>();
	private static int acc=2005;
	public HdfcBank() 
	{
		hdfcBank.add(new Details("Naruto",1234567890,2000,"uzumaki"));
		hdfcBank.add(new Details("Sasuke",1234567891,2001,"uchiha"));
		hdfcBank.add(new Details("Jiraya",1234567892,2002,"sannin"));
		hdfcBank.add(new Details("Itachi",1234567893,2003,"uchiha"));
		hdfcBank.add(new Details("Minato",1234567894,2004,"namikaze"));
	}
	public void checkBalance() 
	{
		
	}
	
	public void createAccount() 
	{
		
	}
	
	public int findAccount(String name, long num, int acc, String pass) 
	{
		return 0;
	}
	
	
	public void transferAmount() 
	{
		
	}
}