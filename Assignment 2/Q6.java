// 6. Print hailstone sequence of a positive number.

import java.util.*;

public  class Q6
{

	public static int hailstone(int x)
	{
		if(x%2==0)
			return x/2;

		return (x*3) + 1;

	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();

		if(n<=0)
			System.out.println("Invalid input.");

		else
		{
			System.out.println("\nHailstone sequence of "+ n + ": ");

			while(n!=1)
			{
				n = hailstone(n);

				System.out.print(n + "  ");

			}

			System.out.println("\n");

		}
	}
} 