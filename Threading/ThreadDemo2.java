package Threading;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println(ANSI_PURPLE + "Hello from the main thread.");

		final Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();

		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
			}
		}.start();

		Thread myRunnableThread = new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
				try {
					anotherThread.join();
					System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
				} catch (InterruptedException e) {
					System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
				}
			}
		});

		myRunnableThread.start();

		System.out.println(ANSI_PURPLE + "Hello again from the main thread.");

	}
}

class AnotherThread extends Thread {

	@Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE +  "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
	 class MyRunnable implements Runnable {

		    @Override
		    public void run() {
		        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
		    }
		}
	