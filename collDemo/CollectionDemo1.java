package collDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {
public static void main(String[] args) 
	{
	List<String> list=new ArrayList();
	ArrayList<Integer> al=new ArrayList<>();
	al.add(3);
	al.add(2);
	al.add(4);
	al.ensureCapacity(3);
	ArrayList<Integer> al1=new ArrayList<>();
	al1.add(al.get(0));
	System.out.println(al1);
	list.add("sid");
	list.add("sukish");
	list.add("aadhil");
	System.out.println(list);
	List<Employee> emp=new ArrayList<>();
	emp.add(new Employee());
	emp.add(new Employee());
	emp.add(new Employee());
	System.out.println(emp);
	Iterator<String> iter=list.iterator();
		while(iter.hasNext())	
		{
			System.out.println(iter.next());
		}
		Iterator<String> itera=list.iterator();
		while(itera.hasNext())
		{
			System.out.println(itera.next());
		}
		String st[]=new String[2];

	}
}
class Employee
{
	String name;
	String age;
	String work;
}