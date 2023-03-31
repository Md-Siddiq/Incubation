package practice;
import java.util.Scanner;
public class ImmutableClass {
	public static void main(String[] args) {
		Immutable obj=new Immutable(10);
Immutable ob=new Derived();
System.out.println(ob.getValue());
System.out.println(obj.getValue());

	}

}
class Immutable
{
	private final int value;
	public Immutable(int value)
	{
		this.value=value;
	}
	int getValue()
	{
		return value;
	}
}
class Derived extends Immutable
{
	public Derived() {
	super(5);
	}
	public void change()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to change ");
		int c=scan.nextInt();
		
	}
}
