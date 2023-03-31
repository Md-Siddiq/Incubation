package practice;
import java.util.Scanner;
class RecurrsionDemo19
{
   	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		subSeq(input,"");
	}
	static void subSeq(String up,String p)
	{
		if(up.length()==0)
		{
			System.out.println(p);
		return;
		}
	char c=up.charAt(0);
	//String str=subString(up,1);
	subSeq(subString(up,1),p+c);
	subSeq(subString(up,1),p);
	}
	static String subString(String cop,int index)
	{
		String temp="";
		for(;index<cop.length();index++)
			temp+=cop.charAt(index);
		return temp;
	}
}