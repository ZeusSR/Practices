/*
 Here it is an example of synchronization which is  by the keyword synchronized to avoid race condition */
package ThreadPackage;

class Atm implements Runnable
{
	
	synchronized public void run()
	{
		try {
		System.out.println(Thread.currentThread().getName()+" has entered the ATM");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" is using the ATM");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" has left the ATM");
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class LaunchSyncronization_MainClass {

	public static void main(String[] args) {
		
		Atm a = new Atm();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.setName("Kuber");
		t2.setName("moskov");
		t3.setName("Argus");
		
		t1.start();
		t2.start();
		t3.start();

		
	}

}
