
public class Multi_Thread3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread3 t=new MyThread3();
		Thread obj=new Thread(t);
		
		obj.start();
		
		obj.join();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}
		
		
	}

}

class MyThread3 implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Child Thread...");
		}
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			
		}
	}
}