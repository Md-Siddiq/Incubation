package practice;

public class TestPrac {
	private int a=5;
	protected final int b=3;
public static void main(String[] args) {
	int a=4;
	final int b=3;
	TestPrac ob=new TestPrac();
	System.out.println(ob.a);
	Ty boj=new Ty();
	boj.met();
}
public void em() {
TestPrac ob=new TestPrac();
System.out.println(ob.a);
}

}
class Ty //extends TestPrac
{
	 public void met()
	 {
		// System.out.println(b);
		 TestPrac ob=new TestPrac();
		 System.out.println(ob.b);
	 }
}
