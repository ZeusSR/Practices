//Achieving multithreading using single run method
package ThreadPackage;

class Alpha20 extends Thread
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

public class multiThreadingwithSrun_MainClass {

	public static void main(String[] args) {
		
		Alpha20 a1 = new Alpha20();
		Alpha20 a2 = new Alpha20();
		Alpha20 a3 = new Alpha20();
		
		a1.setName("Bank");
		a2.setName("Print");
		a3.setName("Calculate");

		a1.start();
		a2.start();
		a3.start();
		
	}

}
