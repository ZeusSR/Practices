package ThreadPackage;


	
	class Yudh implements Runnable
	{
		String res1 =new  String("Bhramastra");
		String res2 =new  String("Bhramasira");
		String res3 =new  String("Pashupatastra");
	
		public void run()
		{
			try
			{
				 if(Thread.currentThread().getName().equals("Karna"))
				{
					karnaAcqRes();
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
				synchronized(res3)
				{
					System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res3);
					Thread.sleep(4000);
					synchronized(res2)
					{
						System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res2);
						Thread.sleep(4000);
						synchronized(res1)
						{
							System.out.println(Thread.currentThread().getName()+" Has accquired the resources "+res1);
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

	public class LaunchLockStates_MainClass {
	public static void main(String[] args) {
		
		Yudh y = new Yudh();
		
		Thread t1 = new Thread(y);
		Thread t2 = new Thread(y);

		
		t1.setName("Karna");
		t2.setName("Arjun");
		
		t1.start();
		t2.start();

		

	}

}
