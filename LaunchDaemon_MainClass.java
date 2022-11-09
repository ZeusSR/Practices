package ThreadPackage;

class daeexptest implements Runnable
{
	public void run()
	{
		try
		{
			for(int i =0;i<5;i++)
			{
				System.out.println("In for loop for "+i);
				Thread.sleep(4000);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("encountered exception");
		}
		
	}
}

public class LaunchDaemon_MainClass {

	public static void main(String[] args) {

		daeexptest d = new daeexptest();
		
		Thread t = new Thread(d);
		
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		
		
	}

}
