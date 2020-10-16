// 1. Reorganize Crops and print minimum number of replantations done.

import java.util.*;

public class Q1 
{

	public static void main(String[] args)
    {
        int n;

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        in.nextLine();

        String [] crops = new String[n];

        for(int i=0; i<n; i++)
        	crops[i] = in.nextLine().trim();

        System.out.print(replant(crops));
    }
    
    
	public static int replant (String[] crops)
	{
		int min = 0;
		
		char[][] plotGrids = new char[crops.length][];

		for(int i=0; i<plotGrids.length; i++) 
		{
			plotGrids[i] = new char[crops[i].length()];

			for(int j=0; j<crops[i].length(); j++) 
				plotGrids[i][j] = crops[i].charAt(j);			
		}


		/*
		for(int i=0; i<plotGrids.length; i++)
		{ 
			for(int j=0; j<plotGrids[i].length; j++)
				System.out.print(plotGrids[i][j] + "   ");
			System.out.print("\n");	
		}		
		*/
		
		
		for(int i=0; i<plotGrids.length; i++) 
		{
			for(int j=0; j<plotGrids[i].length; j++) 
			{				
				if(j-1 >= 0 && i-1 >=0 ) 
				{
					if(plotGrids[i][j-1] == plotGrids[i][j] || plotGrids[i-1][j] == plotGrids[i][j]) 
					{
						min++;
						plotGrids[i][j]='X';
					}
				}
				
				else if(j+1 < crops[i].length() && i+1 < plotGrids.length) 
				{
					if((plotGrids[i][j] == plotGrids[i+1][j]) && (plotGrids[i][j] == plotGrids[i][j+1])) 
					{
						min++;
						plotGrids[i][j]='X';
					}
				}
				
				else if(j-1>=0) 
				{
					if(plotGrids[i][j-1] == plotGrids[i][j])
					{
						min++;
						plotGrids[i][j]='X';
					}
				}
				
				else if(i-1>=0) 
				{
					if(plotGrids[i-1][j] == plotGrids[i][j])
					{
						min++;
						plotGrids[i][j]='X';
					}
				}
			}
		}

		/*
		for(int i=0; i<plotGrids.length; i++)
		{ 
			for(int j=0; j<plotGrids[i].length; j++)
				System.out.print(plotGrids[i][j] + "   ");
			System.out.print("\n");	
		}		
		*/

		return min;
	}
    
}


/*

Input:  4
	acaa
        dddd
	bbbb
        ccce
Output: 6

*/
