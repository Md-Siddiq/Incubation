package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationDemo4 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Data> al=new ArrayList<>();
		ArrayList<Customer> al1=new ArrayList<>();
		String name;
		String age;
		String address;
		String acc;
		String num;
		String balance;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name");
			name=scan.next();
			System.out.println("Enter the age");
			age=scan.next();
			System.out.println("Enter the address");
			address=scan.next();
			System.out.println("Account Number");
			acc=scan.next();
			System.out.println("Enter the phone num");
			num=scan.next();
			System.out.println("Enter the balance");
			balance=scan.next();
			al.add(new Data(name,age,address));
			al1.add(new Customer(acc,num,balance));
		}
		Suthish s=new Suthish();
		s.seria(al,al1);
		s.doDeSerial();
	}
}
class Customer implements Serializable
{
	String accNo;
	String phoneNum;
	String balance;
	public Customer(String accNo, String phoneNum, String balance) 
	{
		
		this.accNo = accNo;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}
	public String toString()
	{
		return accNo+" "+phoneNum+" "+balance;
	}
}
class Data implements Serializable
{
	String name;
	String age;
	String address;
	public Data(String name, String age, String address) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"  "+age+"    "+address;
	}
}
class Suthish
{
	public void seria(ArrayList<Data> al,ArrayList<Customer> al1)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("Siddiq.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.writeObject(al1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doDeSerial()
	{
		ArrayList<Data> al;
		ArrayList<Customer> al1;
		try
		{
			FileInputStream fis=new FileInputStream("Siddiq.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			al=(ArrayList<Data>) ois.readObject();
			al1=(ArrayList<Customer>) ois.readObject();
			for(Data d: al)
				System.out.println(d);
			for(Customer c:al1)
				System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}