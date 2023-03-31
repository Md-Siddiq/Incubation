package practice;

import java.util.Scanner;

public class P1 
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first String: ");
		char ch1[]=scan.next().toCharArray();
		System.out.println("Enter second String: ");
		String str1=scan.next();
		boolean var=check(ch1,str1);
		boolean var1=check1(ch1,str1);
		if(var)
			System.out.println(var);
		else if(var1)
			System.out.println(var1);
		else{
			System.out.println("false");
		}
	}
	public static boolean check(char ch1[],String str1){
		for(int i=0;i<ch1.length;i++){
			String str="";
			for(int j=0;j<ch1.length;j++){
				if(j!=i)
					str+=ch1[j];
			}
			System.out.println(str+" "+str1);
			if(str.equals(str1)){
				return true;
			}
		}
		return false;
	}
	public static boolean check1(char ch1[],String str1){
		for(int i=0;i<ch1.length;i++){
			char c=ch1[i];
			if(i<str1.length())
				ch1[i]=str1.charAt(i);
			String str="";
			for(int j=0;j<ch1.length;j++)
				str+=ch1[j];
			System.out.println(str+" "+str1);
			if(str.equals(str1)){
				return true;
			}
			else{
				ch1[i]=c;
			}
		}
		return false;
	}
}
