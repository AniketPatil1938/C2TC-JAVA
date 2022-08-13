
public class Multi_Thread2 {

	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		Thread obj=new Thread(t);
		
		obj.start();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}

	}

}

class MyThread2 implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Child Thread...");
			Thread.yield();
		}
	}
}
