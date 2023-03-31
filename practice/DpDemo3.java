package practice;

public class DpDemo3 
{
public static void main(String[] args) 
{
	int ar[]= {7,5,1};
	int n=40;
	int ans=minCoins(n, ar);
	System.out.println(ans);
}
static int minCoins(int n,int a[])
{ 
	if(n==0)
		return 0;
	int ans=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(n-a[i]>=0)
		{
			int subAns=minCoins(n-a[i],a);
			if(subAns+1<ans)
				ans=subAns+1;
		}
	}
	return ans;
}
}
