package Leet;

import java.util.Scanner;

public class Leet2 
{
	public static void main(String[] args) 
	{
		Roman ob=new Roman();
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		System.out.println(ob.roman(s));
	}
}
class Roman
{
	public int roman(String s)
	{
		int sum=0;
		char p=0;
		char val=0;
		for(int i=0;i<s.length();i++)
		{
			p=val;
			val=s.charAt(i);
			switch(val)
			{
			case 'I':
				sum++;
				break;
			case 'V':
				if(p=='I')
					sum+=3;
				else
					sum+=5;
				break;
			case 'X':
				if(p=='I')
					sum+=8;
				else
					sum+=10;
				break;
			case 'L':
				 if(p=='I')
					sum+=48;
				else if(p=='V')
					sum+=40;
				 if(p=='X')
						sum+=30;
				else 
					sum+=50;
				break;
			case 'C':
				if(p=='I')
					sum+=98;
				else if(p=='V')
					sum+=90;
				else if(p=='X')
					sum+=80;
				else
					sum+=100;
				break;
			case 'D':
				if(p=='I')
					sum+=498;
				else if(p=='V')
					sum+=490;
				else if(p=='X')
					sum+=480;
				else if(p=='C')
					sum+=300;
				else
					sum+=500;
				break;
			case 'M':
				if(p=='I')
					sum+=998;
				else if(p=='V')
					sum+=990;
				else if(p=='X')
					sum+=980;
				else if(p=='C')
					sum+=800;
				else
					sum+=1000;
			}
		}
		return sum;
	}
	
	
}
	