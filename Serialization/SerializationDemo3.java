package Serialization;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.FileInputStream;
//import Serialization.SerializationDemo2;
//import java.io.IOException;
public class SerializationDemo3 {
public static void main(String[] args) {
//	Input i=new Input();
//	i.in();
	
	ArrayList<Integer> ar=new ArrayList<>();
	int arr[]=new int[4];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	int co[]=Arrays.copyOfRange(arr, 1, 3);
	for(int i:co)
	{
		System.out.println(i);
	}
	
}
}
//}
//class Input
//{
//	public void in()
//	{
//		try
//		{
//		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Documents\\File\\Check.txt");
//				ObjectInputStream ois=new ObjectInputStream(fis);
//				
//				Seri se=(Seri)ois.readObject();
//				System.out.println(se.b);
//				System.out.println(se.s);
//		}
//		catch(Exception io)
//		{
//			io.printStackTrace();
//		}
//		Map
//	}
//}
class Human
{
	
}
class Harun extends Human implements Serializable 
{
	
}