package Test;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Test2 
{
public static void main(String[] args) 
{
	int ar[]=new int[4];
	System.out.println(ar.length);
	Test2 tt=null;
	System.out.println(tt);
	//Import.met();
	int a=0;
	int b=3;
	int c=5;
	byte x=2;
	byte y=3;
	String s1="Siddiq";
	String s2="Aslam";
	String s3="Anas";
	met1("Hi","Bye");
}
public static void met1(String...strings)
{
	System.out.println(strings.length);
}
//public void met(Test2 t)
//{
//	t=null;
//}
}
class Import
{
	public static void met()
	{
		int a=2;
		//int b=(int)sqrt(a);
		System.out.println();
		a=(int)pow(a,4);
		System.out.println(a);
	}
	public int sqrt(int in)
	{
		return 0;
	}
}
