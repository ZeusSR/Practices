package ThreadPackage;


class Producer1 implements Runnable
{
	StringBuffer sb;
	
	public Producer1()
	{
		sb = new StringBuffer();
	}
	
	public void run() 
	{

		synchronized(sb)
		{
		for(int i=1;i<10;i++)
		{
			
			try {
				sb.append(i+":");
				System.out.println("appending");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sb.notify();
		}
	
	}
	
		
	
}
class Consumer1 implements Runnable
{

	//Creating producer object to get producer data
	Producer1 pc;
	//Injecting Producer object into consumer
	public Consumer1(Producer1 pc) {
		
		this.pc = pc;
	}

	@Override
	public void run() 
	{
		synchronized(pc.sb) 
		{
			
		try {
				//wait method being used to get updated result 
				pc.sb.wait();
				System.out.println(pc.sb);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	
}

// Efficient way of producer consumer problem
public class Producer_Consumer_Exp2MainClass {

	public static void main(String[] args) throws InterruptedException {


		Producer1 p= new Producer1();
		Consumer1 c = new Consumer1(p);
		
		Thread t1 = new Thread(p); //Producer Thread
		Thread t2 = new Thread(c); //Consumer Thread
		
		t2.start();
		t1.start();
		
		
		
		
	}

}
