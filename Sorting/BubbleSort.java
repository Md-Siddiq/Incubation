package Sorting;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size ");
	int size=scan.nextInt();
	int ar[]=new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++)
		ar[i]=scan.nextInt();
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(ar[j]>ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
	for(int i=0;i<size;i++)
		System.out.print(ar[i]+" ");
}
}
