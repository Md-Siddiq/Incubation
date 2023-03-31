package practice;
import java.util.ArrayList;
public class CollectionDem {
public static void main(String[] args) {
	ArrayList<Empty> empty=new ArrayList<>();
	empty.add(new Empty("First","Trial"));
	empty.add(new Empty("Second","Trial"));
	System.out.println(empty);
	ArrayList<Empty>emp=new ArrayList<>();
	empty.add(new Empty("Third","Trial"));
	System.out.println(empty);
	
	
}
final static int a;
}
class Empty
{
	String s;
	String b;
	public Empty(String s,String b) {
	this.s=s;
	this.b=b;
	}
	public Empty() {
	
	}
	@Override
	public String toString() {
	return s+" "+b;
	}
	public void d()
	{
		System.out.println("d");
	}
}
