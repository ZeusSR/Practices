package Thread;

public class LaunchMultiThreading_Main {

	public static void main(String[] args) {

		System.out.println("Hey there welcome to multithreading class");
		
		Thread t1 = Thread.currentThread();
		Thread t2 = null;
		
		System.out.println(t1);
		System.out.println(t2.currentThread());
		
	}

}
