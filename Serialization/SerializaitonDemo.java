package Serialization;
//import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class SerializaitonDemo {
public static void main(String[] args) {
	try
	{
	Employees emp[]=new Employees[2];
	emp[0]=new Employees("Siddiq",1);
	emp[1]=new Employees("Mohammed",2);
	File ob=new File("C:\\Users\\Administrator\\Documents\\File\\sid.txt");
	if(ob.exists()==false)
		ob.createNewFile();
	FileOutputStream fps=new FileOutputStream("C:\\Users\\Administrator\\Documents\\File\\sid.txt");
	ObjectOutputStream ops=new ObjectOutputStream(fps);
	ops.writeObject(emp);
	ops.close();
	fps.close();
	System.out.println("Over");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	try {
		FileInputStream fi = new FileInputStream("C:\\Users\\Administrator\\Documents\\File\\sid.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employees evo=null;
		Employees aa = null;
		for(int i=0;i<2;i++) {
			aa=(Employees)oi.readObject();
			System.out.println(aa);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
} 
}
class Employees implements Serializable
{
	String emp;
	int id;
	public Employees(String emp,int id) {
	this.emp=emp;
	this.id=id;
	}
}
