package Test;

public class Test1 
{
	public static void main(String[] args) 
	{
	 Output o=new Output();
	 o.a*=10;
	 System.out.println(o.a);
	 Output b=o;
	 System.out.println(b.a);
	}
}
class Output
{
	byte a=127;
}