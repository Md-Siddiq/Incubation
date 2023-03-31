package practice;

public class PracticeDemo implements sid {
public static void main(String[] args) {
	System.out.println(sid.get());
}
}

interface sid
{
	private static int set()
	{
		int a=3;
		a=(int)(a*Math.random());
		return a;
	}
	public static int get()
	{
		int a=set();
		return a;
	}
}
