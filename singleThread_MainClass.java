//single threaded programming
package Thread;
class bankClass
{
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
class bankPrint
{
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
class bankCalc
{
	
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

public class singleThread_MainClass {

	public static void main(String[] args) {
		
		bankClass b1 = new bankClass();
		bankPrint b2 = new bankPrint();
		bankCalc b3 = new bankCalc();
		
		b1.banking();
		b2.banking();
		b3.banking();

	}

}
