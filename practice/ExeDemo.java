package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeDemo {
public static void main(String[] siddiq) {
	try {
	for(int i=0;i<5;i++)
	{
		Scanner scan=new Scanner(System.in);
		int a=10;
		System.out.println("Enter the input");
		int b=scan.nextInt();
		System.out.println(a/b);
	}
	}
	catch(InputMismatchException s)
	{
		main(siddiq);
	}
	catch(ArithmeticException e)
	{
		main(siddiq);
	}
}

}
