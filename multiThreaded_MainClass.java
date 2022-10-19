package Thread;

class bankClassu extends Thread
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
class bankPrintu extends Thread
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
class bankCalcu extends Thread
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


public class multiThreaded_MainClass {

	public static void main(String[] args) {

		bankClassu b1 = new bankClassu();
		bankPrintu b2 = new bankPrintu();
		bankCalcu b3 = new bankCalcu();
		
		b1.start();
		b2.start();
		b3.start();
	}

}
