package practice;
import java.util.Arrays;
import java.util.Scanner;
public class DynamicProgramming1 
{
	public static void main(String[]args)
	{
		System.out.println("Enter the number to find the fibonacci");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int ar[]=new int[num+1];
		Arrays.fill(ar,-1);
		System.out.println(ar[0]);
		System.out.println(dpRec(num,ar));
	}
	public static int dpRec(int num,int ar[])
	{
		if(num<=1)
			return num;
		if(ar[num]!=-1)
			return ar[num];
		return ar[num]=(dpRec(num-1,ar)+dpRec(num-2,ar));
	}
	
}
