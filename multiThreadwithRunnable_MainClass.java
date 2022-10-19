//MultiThreading using Runnable interface
package Thread;

class bankClassu1 implements Runnable
{
	public void run()
	{
		banking();
		System.out.println(Thread.currentThread());
	}
	public void banking()
	{
		System.out.println("Banking started....!!!");
		for(int i=0;i<3;i++)
		{
			System.out.println("Banking Processing.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Banking completed...!!");
		System.out.println();
	}
	
}
class bankPrintu1 implements Runnable
{
	public void run()
	{
		banking();
		System.out.println(Thread.currentThread());
	}
	public void banking()
	{
		System.out.println("Printing started....!!!");
		for(int i=0;i<3;i++)
		{
			System.out.println("Printing Processing.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed...!!");
		System.out.println();
	}
	
}
class bankCalcu1 implements Runnable
{

	public void run()
	{
		banking();
		System.out.println(Thread.currentThread());
	}
	
	public void banking()
	{
		System.out.println("Calculation started....!!!");
		for(int i=0;i<3;i++)
		{
			System.out.println("Calculation Processing.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Calculation completed...!!");
		System.out.println();
	}
	
}




public class multiThreadwithRunnable_MainClass {

	public static void main(String[] args) {

		bankClassu1 b1 = new bankClassu1();
		bankPrintu1 b2 = new bankPrintu1();
		bankCalcu1 b3 = new bankCalcu1();
		
		Thread t1 =new Thread(b1);
		Thread t2 =new Thread(b2);
		Thread t3 =new Thread(b3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
