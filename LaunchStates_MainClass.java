/*
 * Here it is an example of blocked state in multithreading*/

package ThreadPackage;

class War implements Runnable
{
	String res1 =new  String("Bhramastra");
	String res2 =new  String("Bhramasira");
	String res3 =new  String("Pashupatastra");
	
	public void run()
	{
		try
		{
			if(Thread.currentThread().getName().equals("Bheesma"))
			{
				bheesmaAcqRes();
			}
			else if(Thread.currentThread().getName().equals("Karna"))
			{
				karnaAcqRes();
			}
			else if(Thread.currentThread().getName().equals("Drona"))
			{
				dronaAcqRes();
				
			}
			else
			{
				arjunAcqRes();
			}
		}
		catch(Exception e)
		{
			System.out.println("Application run into a bug");
		}
	}
	
	public void bheesmaAcqRes()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res1);
				Thread.sleep(4000);
				synchronized(res2)
				{
					System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res2);
					Thread.sleep(4000);
					synchronized(res3)
					{
						System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res3);
						Thread.sleep(4000);
						
					}
				}
	
			}
		}
		catch(Exception e)
		{
			System.out.println("Application run into a bug");
			
		}
		
	}
	
	public void karnaAcqRes()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res1);
				Thread.sleep(4000);
				synchronized(res2)
				{
					System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res2);
					Thread.sleep(4000);
					synchronized(res3)
					{
						System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res3);
						Thread.sleep(4000);
						
					}
				}
	
			}
		}
		catch(Exception e)
		{
			System.out.println("Application run into a bug");
			
		}
	}
	
	public void arjunAcqRes()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res1);
				Thread.sleep(4000);
				synchronized(res2)
				{
					System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res2);
					Thread.sleep(4000);
					synchronized(res3)
					{
						System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res3);
						Thread.sleep(4000);
						
					}
				}
	
			}
		}
		catch(Exception e)
		{
			System.out.println("Application run into a bug");
			
		}
		
	}
	public void dronaAcqRes()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res1);
				Thread.sleep(4000);
				synchronized(res2)
				{
					System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res2);
					Thread.sleep(4000);
					synchronized(res3)
					{
						System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res3);
						Thread.sleep(4000);
						
					}
				}
	
			}
		}
		catch(Exception e)
		{
			System.out.println("Application run into a bug");
			
		}
		
	}
}


public class LaunchStates_MainClass {

	public static void main(String[] args) {
		
		War w = new War();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		Thread t4 = new Thread(w);
		
		t1.setName("Bheesma");
		t2.setName("Karna");
		t3.setName("Arjun");
		t4.setName("Drona");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		
	}

}
