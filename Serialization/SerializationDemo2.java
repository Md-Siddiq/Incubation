package Serialization;
import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class SerializationDemo2 {
public static void main(String[] args) {
	Seri s=new Seri();
	s.ser();
	Serial se=new Serial();
	se.e();
}
}
class Seri implements Serializable
{
	String s="S is empty";
	String b="B is empty";
	public void ser()
	{
		Seri obj=new Seri();
		try
		{
			File fi=new File("C:\\Users\\Administrator\\Documents\\File\\Check.txt");
			if(fi.exists()==false)
			{
				System.out.println("False now Creating");
				fi.createNewFile();
			}
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Documents\\File\\Check.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			fos.close();
			oos.close();
		
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
	}
}
class Serial extends Seri
{
	String sec="Child";
	String child="Child Data";
	
	public void e()
	{
		Serial obj=new Serial();
		try
		{
		File fi=new File("C:\\Users\\Administrator\\Documents\\File\\Check.txt");
	if(fi.exists()==false)
		fi.createNewFile();
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Documents\\File\\Check.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(obj);
	fos.close();
	oos.close();
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
	}
}
