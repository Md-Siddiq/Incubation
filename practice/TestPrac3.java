package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPrac3 {
	final static short i=2;
	public static int j=0;
public static void main(String[] args) {
//	for(int k=0;k<3;k++)
//	{
//		switch(k)
//		{
//		case i:
//			System.out.print("1");
//		case i-1:
//			System.out.print("2");
//		default:
//			System.out.print("0");
//		}
//	}
//	LinkedList<Integer> al=new LinkedList<>();
//	al.add(new Integer(2));
//	al.add(new Integer(8));
//	al.add(new Integer(5));
//	al.add(new Integer(1));
//	Iterator i=al.iterator();
//	Collections.reverse(al);
//	System.out.println(al);
//	Collections.sort(al);
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//	System.out.println(al);
//	Integer i = new Integer(257);
//	byte k =i.byteValue();
//	System.out.println(k);
	System.out.println(new Derived1().getName());
	System.out.println(new Derived1().name);
	
}
}

class Base
{
	String name="Base";
	
}
class Derived1 extends Base
{
	private String name="Derived";
	public String getName()
	{
		return name;
	}
	
}