//4. To check if 2 strings/numbers are anagrams of each other.

import java.util.Arrays;
import java.util.Scanner;

public class Q4
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();

		System.out.println("Enter second string: ");
		String s2 = sc.nextLine();

		char chars1[] = s1.toCharArray();
		Arrays.sort(chars1);

		char chars2[] = s2.toCharArray();
		Arrays.sort(chars2);

		s1 = new String(chars1);
		s2 = new String(chars2);

		boolean anagram = s1.equals(s2);

		if(anagram)
			System.out.println("\nStrings are anagram.");
		else
			System.out.println("\nStrings are not anagram.");

	}

}