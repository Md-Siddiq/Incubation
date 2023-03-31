package practice;

public class FinalizeDemo {
public static void main(String[] args) {
	FinalizeDemo ob=new FinalizeDemo();
	System.out.println(ob.hashCode());
	ob=null;
	System.out.println("Garbage has been collected successfully");
	System.gc();
	System.out.println(ob);
}
@Override
	protected void finalize() throws Throwable {
	
	System.out.println("Finalize method");
	System.out.println(getClass());
	}

}
