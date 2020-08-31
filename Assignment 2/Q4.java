// 4. To find the smallest n, such that Σi = i*i, where 1 ≤ i ≤ n is too large to be represented as an int.

public class Q4 
{
   public static void number()
    {
        long sum = 0;
        
        for(int i=1; i<Integer.MAX_VALUE; i++)
        {
        	sum += i;

        	if(sum == i*i)
        		System.out.println(i);

        }        	
    }

    public static void main(String[] args) 
    {
        number();
    }
    
}