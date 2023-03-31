package practice;
import java.util.ArrayList;
public class Practice1 {
	static   int a=4;
public static void main(String[] args) {
Static ob=new Static1();
Practice1 o=null;
System.out.println(o.a);
ArrayList<String> al=new ArrayList<>();
al.add("Siddiq");
al.add("maadu");

}
}

class Static extends Practice1
{
	public static void met()
	{
		System.out.println("Parent");
	}
}
class Static1 extends Static
{
	public static void met()
	{
		System.out.println("Child");
	}
}
