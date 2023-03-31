package practice;
import java.util.Scanner;
public class GcDemo 
{
public static void main(String[] args) 
{
//	Scanner scan=new Scanner(System.in);
//	String s=scan.next();
//	sub("",s);
	try
	{
		Float f1=new Float("3.0");
		int x=f1.intValue();
		byte b=f1.byteValue();
		double d=f1.doubleValue();
		System.out.println(x+b+d);
		System.out.println();
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("Number Format Exception");
	}
}
public static void sub(String p,String up)
	{
		if(up.length()==0)
		{
			System.out.println(p);
			return ;
		}
		
		char c=up.charAt(0);
		
		sub(p+c,up.substring(1));
		sub(p,up.substring(1));
	}
}
