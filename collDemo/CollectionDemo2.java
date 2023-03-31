package collDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;;
public class CollectionDemo2 {
	static Scanner scan=new Scanner(System.in);
	static ArrayList<Info> info=new ArrayList<>();
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Siddiq");
	list.add("Thabrez");
	list.add("Harun");
	System.out.println(list);
	Iterator iter=list.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	info.add(new Info("Naruto",1,"10"));
	info.add(new Info("Sasuke",2,"10"));
	info.add(new Info("Kakashi",3,"Sensei"));
	for(int i=0;i<info.size();i++)
	{
		System.out.println(info.get(i));
	}
//	get();
//	set();
//	search();
	remove();
	}
public static void get()
{
	System.out.println("Enter the index to get value");
	int a=scan.nextInt();
	System.out.println(info.get(a));
}
public static void set()
{
	System.out.println("Enter the roll no");
	int roll=scan.nextInt();
	for(int i=0;i<info.size();i++)
	{
		if(roll==info.get(i).roll_no)
		{
			System.out.println("Enter the name");
			String name=scan.next();
			info.get(i).name=name;
			System.out.println("Enter the roll no");
			int rol=scan.nextInt();
			info.get(i).name=name;
			System.out.println("Enter the std");
			String std=scan.next();
			info.get(i).std=std;
			System.out.println("new edited details");
			System.out.println(info.get(i));
			break;
		}
		
	}
}
public static void search()
{
	System.out.println("Enter the roll no to search");
	int rol=scan.nextInt();
	for(int i=0;i<info.size();i++)
		if(info.get(i).roll_no==rol)
			System.out.println(info.get(i));
}
public static void remove()
{
	System.out.println("Enter the roll no");
	int rol=scan.nextInt();
//	for(int i=0;i<info.size();i++)
//		if(info.get(i).roll_no==rol)
			info.remove(rol);
			System.out.println(info);
}
public static void sorting()
{
	
}
}
class Info
{
	String name;
	int roll_no;
	String std;
	public Info(String name,int roll_no,String std)
	{
		this.name=name;
		this.roll_no=roll_no;
		this.std=std;
	}
	public String toString()
	{
		return name+","+roll_no+","+std;
	}

}