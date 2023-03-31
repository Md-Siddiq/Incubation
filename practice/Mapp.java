package practice;

import java.util.HashMap;
import java.util.Map;

public class Mapp 
{
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
//		m.put(1,"Siddiq");
//		System.out.println(m);
//		System.out.println(m.put(1, "Suthish"));
//		System.out.println(m);
		Integer i=new Integer(null);
		System.out.println(i.s);
	}
	
	protected void finalize() throws Throwable {
	
		super.finalize();
	}
}
class Integer
{
	String s;
	public Integer(String s) 
	{
	this.s=s;
	}
}
