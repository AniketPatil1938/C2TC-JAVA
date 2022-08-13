package Important;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int n, sum=0, p, m;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		n=s.nextInt();
		
		m=n;
		
		while(n != 0);
		{
			p = n%10;
			sum = sum + (p*p*p);
			n = n/10;
		}
		
		if (m == sum)
		{
			System.out.println(+sum+ " is an armstrong number");
		}
		else
		{
			System.out.println(+sum+ " is not an armstrong number");
		}

	}

}
