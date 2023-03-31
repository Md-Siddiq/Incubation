package Threading;

class ThreadColor
{
	public static final String ANSI_RESET="\u001B[0m";
	public static final String ANSI_BLACK="\u001B[30m";
	public static final String ANSI_RED="\u001B[31m";
	public static final String ANSI_GREEN="\u001B[32m";
	public static final String ANSI_BLUE="\u001B[34m";
	public static final String ANSI_PURPLE="\u001B[35m";
	public static final String ANSI_CYAN="\u001B[36m";
	
	
}
public class ThreadDemo1 extends ThreadColor
{
	public static void main(String[] args) {
		System.out.println("HI");
		Thread.currentThread().setName("Main");
		Runnable r=new Runnable() 
				{
					public void run()
					{
						System.out.println(ANSI_PURPLE+" Checking the start and run method -This is new thread but its running by "+Thread.currentThread().getName());
					}
				};
				Thread t=new Thread(r);
				t.setName("New Thread Created");
				t.start();
				try {
				t.sleep(4000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Interruption happened and the other thread woke me up ");
				}
		System.out.println(ANSI_BLUE+" Checking the color of the thread - main thread "+Thread.currentThread().getName());
	}
}
