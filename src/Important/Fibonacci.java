package Important;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n, i,t1=0, t2=1, t3;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many terms?");
		
		n=s.nextInt();
		
		System.out.print(""+t1+" ");
		System.out.print(" "+t2+" ");
		
		for (i=1; i<=n; i++)
		{
			t3 = t1 + t2;
			System.out.print(" "+t3+" ");
			t1 = t2;
			t2 = t3;
		}

	}

}
