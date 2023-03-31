package practice;
import java.util.Scanner;
public class Temporary {
		public static void main(String[]args)
		{		
			int ar[][]={{ 5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0 },{ 6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 ,
								 0 },{ 0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0 },{ 8 , 0 , 0 , 0 , 6 , 0 , 0 ,
								 0 , 3 },{ 4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1 },{ 7 , 0 , 0 , 0 , 2 , 0 ,
								 0 , 0 , 6 },{ 0 , 6 , 0 , 0 , 0 , 0 , 2 , 8 , 0 },{ 0 , 0 , 0 , 4 , 1 ,
								 9 , 0 , 0 , 5 },{ 0 , 0 , 0 , 0 , 8 , 0 , 0, 7 , 9 }};
								 solve(ar);
					
				}
				public static void solve(int ar[][])
				{
					if(backtrack(ar,0,0))
						print(ar);
					else
						System.out.println("No Solution");
				}
				public static boolean backtrack(int ar[][],int r,int c)
				{
					if(r==9)
					{
						c++;
						if(c==9)
							return true;
						else
							r=0;
					}
					if(ar[r][c]!=0)
						return backtrack(ar,r+1,c);
					for(int i=1;i<=9;i++)
					{
						if(check(ar,r,c,i))
						{
							ar[r][c]=i;
							if(backtrack(ar,r+1,c))
								return true;	
							ar[r][c]=0;
						}
					}
					return false;
				}
				public static boolean check(int ar[][],int r,int c,int num)
				{
					for(int i=0;i<9;i++)
						if(ar[r][i]==num)
							return false;
					for(int i=0;i<9;i++)
						if(ar[i][c]==num)
							return false;				
						int rIndex=(r/3)*3;
						int cIndex=(c/3)*3;
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
							{
								if(ar[rIndex+i][cIndex+j]==num)
									return false;
							}
						}
						return true;
				}
				public static void  print(int ar[][])
				{
					for(int i=0;i<9;i++)
					{
						for(int j=0;j<9;j++)
							System.out.print(ar[i][j]+" ");
						System.out.println();
					}
				}
			}
		
//		{
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Enter the size of the array");
//			int size=scan.nextInt();
//			int ar[]=new int[size];
//			for(int i=0;i<size;i++)
//				ar[i]=scan.nextInt();
//			mergeSort(0,ar.length-1,ar);
//			for(int i=0;i<size;i++)
//				System.out.print(ar[i]+" ");
//		}
//		public static void mergeSort(int st,int end,int ar[])
//		{
//			if(st>=end)
//				return;
//				int mid=(st+end)/2;
//				mergeSort(st,mid,ar);
//				mergeSort(mid+1,end,ar);
//				merge(st,mid,end,ar);
//				
//		}
//		public static void merge(int st,int mid,int end,int ar[])
//		{
//			int ind1=st;
//			int ind2=mid+1;
//			int pos=0;
//			int mergeArr[]=new int[end-st+1];
//			while(ind1<=mid&&ind2<=end)
//			{
//				if(ar[ind1]<=ar[ind2])
//					mergeArr[pos++]=ar[ind1++];
//				else
//					mergeArr[pos++]=ar[ind2++];
//			}
//			while(ind1<=mid)
//			{
//				mergeArr[pos++]=ar[ind1++];
//			}
//			while(ind2<=end)
//			{
//				mergeArr[pos++]=ar[ind2++];
//			}
//			for(int i=0,j=st;i<mergeArr.length;i++,j++)
//			{
//				ar[j]=mergeArr[i];
//			}
//			
//		}
//	}