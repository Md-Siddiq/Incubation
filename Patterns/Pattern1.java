package Patterns;
import java.util.Scanner;
public class Pattern1 {

		public static void main(String[]args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=scan.nextInt();
			int a=n;
			a*=2;
			int count=0;
			for(int i=0;i<a;i++)
			{
				if(i<n)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("*");
						
					}
					count++;
				System.out.println();
				}
				else
				{
					for(int j=count-1;j>0;j--)
						System.out.print("*");
					count--;
					System.out.println();
				}
			}
			
		}
	}

