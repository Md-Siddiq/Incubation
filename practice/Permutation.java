package practice;
import java.util.Scanner;
public class Permutation {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=scan.next();
	per(s,"");
}
public static void per(String up,String p)
{
	if(up.length()==0)
	{
		System.out.println(p);
		return;
	}
	char c=up.charAt(0);
	for(int i=0;i<=p.length();i++)
	{
		String one=subString(p, 0,i);
		String two=subString(p, i,p.length());
		per(subString(up, 1),one+c+two);
	}
}
public static String subString(String s,int index)
{
	String temp="";
	for(;index<s.length();index++)
	{
		temp+=s.charAt(index);
	}
	return temp;
}
public static String subString(String s,int st,int end)
{
	String temp="";
	for(;st<end;st++)
	{
		temp+=s.charAt(st);
	}
	return temp;
}
}
