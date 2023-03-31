package collDemo;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionDemo3 {
public static void main(String[] args)throws UserDefine {
//	ArrayList<Dummy> dum=new ArrayList<>();
//	String s1="Strings1";
//	String s2="Strings2";
//	System.out.println(s2.compareTo(s1));
//	dum.add(new Dummy("Siddiq","5"));
//	dum.add(new Dummy("Khader","5"));
//	Collections.sort(dum);
//	System.out.println(dum);
	Afru ob=new Afru();
	ob.met(3);
} 
}
//class Dummy implements Comparable<Dummy>
//{
//	public Dummy(String name,String batch) {
//	this.name=name;
//	this.batch=batch;
//	}
//	@Override
//	public int compareTo(Dummy o) 
//	{
//		return o.name.compareTo(name);
//	}
//	String name;
//	String batch;
//	@Override
//	public String toString() {
//	
//		return name+" "+batch;
//	}
//	
//}
class Afru
{
	int a=10;
	public void met(int temp) throws UserDefine
	{
		if(temp<a)
		{
			throw new UserDefine();
		}
	}
}
class UserDefine extends Exception
{
	
}
