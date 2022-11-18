package ThreadPackage;

class demo extends Thread
{

	int Total;
	@Override
	public void run() {

		synchronized(this)
		{
		for(int i=1;i<=100;i++)
		{
			Total+=i;
		}
		this.notify();
		}
	
	}
	
}

public class DemTest_Main {

	public static void main(String[] args) throws InterruptedException {

		demo d=new demo();
		d.start();
		
    	synchronized(d)
    	{
    		d.wait();
    		System.out.println(d.Total);
    	}

		
	}

}
