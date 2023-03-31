package practice;

import java.util.Scanner;

public class Sample {
	static {
	System.out.println("static");
	}
	public Sample() {
	System.out.println("Cons");
	}
	{
		System.out.println("Instance");
	}
public static void main(String[] args) {
	Sample ob=new Sample();
	Sample obd=new Sample();
	System.out.println("Main");
//	Integer i=new Integer(4);
//	Integer j=new Integer(4);
//	Float f=new Float(4);
//	Scanner sc=new Scanner(System.in);
//	
//	String s = sc.next();
//	if(j.equals(f))
//		System.out.println("Equal");
//	else
//		System.out.println("NOt");
//	if(j.equals(i))
//		System.out.println("Same");
//	else
//		System.out.println("Not");
//	String s=new String("HI");
//	String b="hello";
//	s=s+b;
//	System.out.println(s);
//	if(i==j)
//		System.out.println("same");
//	else
//		System.out.println("not same");
}
}
