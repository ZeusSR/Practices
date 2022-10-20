//Here the usage of join(),isAlive() etc methods used
package Thread;
class Alpha20 implements Runnable
{
	public void run()
	{
		String t = Thread.currentThread().getName();
		if(t.equals("Bank"))
		{
			banking();
		}
       else if(t.equals("Print"))
       {
    	   printing();
       }
       else
       {
    	   calculation();
       }
		
	}
	
	public void banking()
	{
		System.out.println("Banking started..");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(3000);
				System.out.println("Banking.........!!!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Banking completed ");
		System.out.println();
	}
	public void printing()
	{
		System.out.println("Printing started..");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(3000);
				System.out.println("Printing receipts.........!!!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed ");
		System.out.println();
	}
	public void calculation()
	{
		System.out.println("Calculation started..");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(3000);
				System.out.println("Calculation.........!!!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Calculation completed ");
		System.out.println();
	}
}


public class threadStatesMethod_MainClass {

	public static void main(String[] args) {
		
		
		Alpha20 a1 = new Alpha20();
		Alpha20 a2 = new Alpha20();
		Alpha20 a3 = new Alpha20();
		
	
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(a3);
		
		t1.setName("Bank");
		t2.setName("Print");
		t3.setName("Calculate");
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread execution complete");

	}

}
