//Inefficient way of Producer consumer
package ThreadPackage;

class Producer implements Runnable
{
	StringBuffer sb;
	boolean data_prepared=false;
	
	public Producer()
	{
		sb = new StringBuffer();
	}
	
	public void run() 
	{

		try
		{
		for(int i=1;i<10;i++)
		{
			sb.append(i+":");
			System.out.println("appending");
			Thread.sleep(100);
		}
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	
		data_prepared=true;
	}
	

	
}
class Consumer implements Runnable
{

	//Creating producer object to get producer data
	Producer pc;
	//Injecting Producer object into consumer
	public Consumer(Producer pc) {
		
		this.pc = pc;
	}

	@Override
	public void run() 
	{
		while(pc.data_prepared == false)
		{
			try {
				Thread.sleep(10);
				System.out.println("Checking");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(pc.sb);

	}
	
	
	
}
public class LauncHProducerConsumer_MainClass {

	public static void main(String[] args) {

		Producer p= new Producer();
		Consumer c = new Consumer(p);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
	}

}
