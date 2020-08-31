// 2. Counting sort for range 0 to 20.

import java.util.*;

public  class Q2
{

	public static void countSort(int [] a)
	{
		int l = a.length;

		int [] count = new int[21];
		int [] temp = new int[l];

		for(int i=0; i<l; i++)
			count[a[i]]++;

		for(int i=0; i<21-1; i++)
			count[i+1] += count[i];

		for(int i=0; i<l; i++)
		{
            temp[count[a[i]]-1] = a[i];
            count[a[i]]--;
        }

        for(int i=0; i<l; i++)
        	a[i] = temp[i];

	}
	

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = sc.nextInt();

		int [] arr = new int[n];

		System.out.println("\nEnter the elements of array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		for (int i=0;i<n;i++) 
            if (arr[i]<0 || arr[i] > 20)
            {
                System.out.println("\nInput out of range.");
                return;
            }

		countSort(arr);

		System.out.println("\nElements after sorting: ");
		for(int e : arr)
			System.out.print(e + "  ");

		System.out.print("\n");

	}
} 