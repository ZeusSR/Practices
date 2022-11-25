package ThreadPackage;

/*class demoTest extends Thread
{

	@Override
	public void run() {
	
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}

	}
	
}*/


public class LambdaExpThread_MainClass {

	public static void main(String[] args) {
		
		/* using annonymous inner class */
		/*new Thread(new Runnable() {
			public void run() {for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}}
			
		}).start();*/
		
		new Thread(()->{for(int i=0;i<5;i++)// Lamda Example
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}}).start();
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread");
		}

	}

}
