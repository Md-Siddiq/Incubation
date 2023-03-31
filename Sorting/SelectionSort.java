package Sorting;
import java.util.Scanner;
public class SelectionSort {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Size");
	int size=scan.nextInt();
	System.out.println("Elements");
	int ar[]=new int[size];
	for(int i=0;i<size;i++)
		ar[i]=scan.nextInt();
	for(int i=0;i<size;i++)
	{
		int temp=i;
		for(int j=i+1;j<size;j++)
			if(ar[temp]>ar[j])
				temp=j;
		int temp1=ar[i];
		ar[i]=ar[temp];
		ar[temp]=temp1;
	}
	for(int i=0;i<size;i++)
		System.out.print(ar[i]+" ");
}
}
