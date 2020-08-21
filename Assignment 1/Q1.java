//1. To count the no. of times a substring occurs in a string, irrelevant of the order of the characters.

import java.util.Scanner;
import java.util.Arrays;

public class Q1
{
	public static int subCount(String s, String sub)
	{
		int ls = s.length();
		int lsub = sub.length();

		int count = 0;

		for(int i=0; i<ls-lsub+1; i++)
		{
			String t = "";

			for(int j=i; j<i+lsub; j++)
			{
				t += s.charAt(j);

				char c[] = t.toCharArray();
				Arrays.sort(c);
				t = new String(c);

				if(t.equals(sub))
					count += 1;

			}
			//System.out.println(t);
			//System.out.println(count);

		}

		return(count);
	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String s = sc.nextLine();

		System.out.println("Enter the substring: ");
		String sub = sc.nextLine();

		String x = sub;

		char t[] = sub.toCharArray();
		Arrays.sort(t); 
		sub = new String(t);

		if(s.length()<sub.length())
			System.out.println("\nNo. of times substring '" + x + "' occurs in main String '"+ s +"' is : 0");

		else
		{
			int count = 0;
			count = subCount(s, sub);
			System.out.println("\nNo. of times substring '" + x + "' occurs in main String '"+ s +"' is : " + count);
		}
	}
}