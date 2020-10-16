// 2. Casting int (-1) to byte, byte to char, char to int. 

import java.util.*;

public class Q2
{
	public static void main(String [] args)
	{
		int num = -1;
		System.out.println("INT : " + num);

		byte byt = (byte)num;
		System.out.println("\nBYTE : " + byt);

		char ch = (char)byt;
		System.out.println("\nCHAR : " + ch);

		int n = ch;
		System.out.println("\nINT : " + n);

	}
}
					

// Initial and Final integer values are not same.