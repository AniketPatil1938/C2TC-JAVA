public class Multi_Thread1 {

	public static void main(String[] args) {
		
		MyThread1 t=new MyThread1();
		Thread obj=new Thread(t);
		
		obj.start();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}

	}

}

class MyThread1 implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Child Thread...");
		}
	}
}