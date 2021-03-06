// 1. Compare 2 strings lexicographically, without using library function.

import java.util.*;

public class Q1
{

	public static int compareStr(String one, String two)
	{
		int l1 = one.length();
		int l2 = two.length();

		int len = l1;

		if(l1>12)
			len = l2;
		
		for(int i=0; i<len; i++)
			if(one.charAt(i) != two.charAt(i))
				return one.charAt(i) - two.charAt(i);

		return l1-l2;		
	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1: ");
		String s1 = sc.nextLine();

		System.out.println("Enter String 2: ");
		String s2 = sc.nextLine();

		int res = compareStr(s1, s2);

		if(res == 0)
			System.out.println("Strings are similar.");
		else if(res>0)
			System.out.println("String 1 is lexicographically greater than String 2.");
		else
			System.out.println("String 1 is lexicographically smaller than String 2.");	

	}
} 