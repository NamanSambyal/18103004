//2. Replace specific words from a paragraph entered by the user.

import java.util.Arrays;
import java.util.Scanner;

public class Q2
{
	public static void replace(String [] para, String s)
	{
		int len = s.length()-1;

		String d = ""+s.charAt(0);

		for(int i=0; i<len; i++)
			d += "*";

		for(int i=0; i<para.length; i++)
			if(para[i].equals(s))
				para[i] = para[i].replaceAll(s, d);	

	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the paragraph: ");
		String para = sc.nextLine();

		String [] temp = para.split("\\s");

		System.out.println("\nEnter the size of vector: ");
		int t = Integer.parseInt(sc.nextLine());

		System.out.println("\nEnter the words in the vector: ");

		while(t!=0)
		{
			String s = sc.nextLine();

			replace(temp, s);
			
			t--;
		}

		para = "";

		for(int i=0; i < temp.length; i++)
			para += temp[i]+" ";

		System.out.println("\nUpdated Paragraph: ");
		System.out.println(para);
	}
}