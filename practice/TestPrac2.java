package practice;

import java.util.Arrays;

public class TestPrac2 {
public static void main(String[] args) {
	double d[]=new double[3];
	d[0]=2.4;
	d[1]=1.4;
	d[2]=0.4;
	met(d);
	System.out.println(Arrays.toString(d));
	System.out.println(Math.round(0.3));
	byte b=5;
	mett(b);
	mett(b,b);
	mett(b,b,b);
}
static void mett(byte x)
{
	System.out.println("mett");
}
static void mett(byte x , byte b)
{
System.out.println("mett2");	
}
static void mett(byte...x)
{
	System.out.println("g");
}
static void met(double d[])
{
	d=new double[3];
	d[0]=d[1]=d[2]=1.0;
}
}
