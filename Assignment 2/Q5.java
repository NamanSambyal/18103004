// 5. To try Union, Intersection and Complement operation on sets, using Arrays and HashSets and compare elapsed time in both approaches.


import java.util.*;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] universe = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("\nUniversal Set: ");
        for(int i=0; i<universe.length; i++)
            System.out.print(i + " ");


        System.out.println("\n\nEnter the size of first array: ");
        int n = Integer.parseInt(sc.nextLine());
        
        int[] a = new int[n];
        
        System.out.println("Enter the elements of first array: ");
        String[] s1 = sc.nextLine().split(" ");
        for(int i=0; i<n; i++) 
            a[i] = Integer.parseInt(s1[i]);

        /*for(int i=0; i<a.length; i++)
            if(a[i]>10 || a[i]<0)
                a[i] = 0;*/


        System.out.println("\nEnter the size of second array: ");
        n = Integer.parseInt(sc.nextLine());
        
        int[] b = new int[n];

        System.out.println("Enter the elements of second array: ");
        String[] s2 = sc.nextLine().split(" ");
        for(int i=0; i<n; i++) 
            b[i] = Integer.parseInt(s2[i]);

        /*for(int i=0; i<b.length; i++)
            if(b[i]>10 || b[i]<0)
                b[i] = 0;*/

        


        System.out.println("\n******* USING ARRAYS ******* ");

        long startTime = System.currentTimeMillis();
        

        Vector union = new Vector();
        
        for(int i=0; i<a.length; i++)
            union.add(a[i]);
        
        for(int i=0; i<b.length; i++)
        {
            int flag = 0;
            for(int j=0; j<a.length; j++) 
                if(b[i] == a[j]) 
                {
                    flag = 1;
                    break;
                }
            
            if(flag == 0)
                union.add(b[i]);
            
        }

        System.out.print("\n\nA union B: ");        
        for(int i=0; i<union.size(); i++) 
            System.out.print(union.get(i)+" ");
               
        
       
        Vector inter = new Vector();
       
        for (int i=0; i<a.length; i++) 
            for(int j=0; j<b.length; j++) 
                if(b[j] == a[i]) 
                {
                    inter.add(a[i]);
                    break;
                }
            
        System.out.print("\n\nA intersection B: ");
        for(int i=0; i<inter.size(); i++) 
            System.out.print(inter.get(i)+" ");
        

               
        Vector comp1 = new Vector();
        
        for(int i=0; i<11; i++) 
        {
            int flag = 0;
            for(int j=0; j<a.length; j++) 
                if(a[j] == i) 
                {
                    flag=1;
                    break;
                }
            
            if(flag == 0)
                comp1.add(i);
            
        }

        System.out.print("\n\nA complement:");
        for(int i=0; i<comp1.size(); i++) 
            System.out.print(comp1.get(i)+" ");
        
       
        
        Vector comp2 = new Vector();
        
        for(int i=0; i<11; i++) 
        {
            int flag = 0;
            
            for(int j=0; j<b.length; j++) 
                if(b[j] == i) 
                {
                    flag=1;
                    break;
                }
            
            if(flag == 0)
                comp2.add(i);
            
        }
        
        System.out.print("\n\nB complement:");
        for(int i=0; i<comp2.size(); i++) 
            System.out.print(comp2.get(i)+" ");
        
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
                
        System.out.println("\n\nElapsed Time using Arrays: " + elapsedTime +" ms");

        

        System.out.println("\n\n******* HASH SET ******* ");
        
        startTime = System.currentTimeMillis();
        
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i=0; i<a.length; i++)
            set1.add(a[i]);
        
        for(int i=0; i<b.length; i++)
            set1.add(b[i]);
        
        Integer[] newUnion = {};
        
        newUnion = set1.toArray(newUnion);
        
        System.out.print("\n\nA union B: ");
        for(int i=0; i<newUnion.length; i++) 
            System.out.print(newUnion[i]+" ");
        
        
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i=0;i<a.length;i++)
            set2.add(a[i]);
        
        Vector  newInter = new Vector();
        
        for(int i=0; i<b.length;i++)
            if(set2.contains(b[i])) 
                newInter.add(b[i]);
            
        
        System.out.print("\n\nA intersection B: ");
        for(int i=0; i<newInter.size(); i++) 
            System.out.print(newInter.get(i)+" ");
        
        
                
        HashSet<Integer> set3 = new HashSet<>();
        Vector comp3 = new Vector();
        
        for(int i=0; i<a.length; i++)
            set3.add(a[i]);
        
        for(int i=0;i<11;i++) 
            if(!set3.contains(i)) 
                comp3.add(i);
            
        System.out.print("\n\nA complement:");
        for(int i=0; i<comp3.size(); i++) 
            System.out.print(comp3.get(i)+" ");
        
        
        
        HashSet<Integer> set4 = new HashSet<>();
       
        Vector comp4 = new Vector();
       
        for(int i=0; i<b.length; i++)
            set4.add(b[i]);
        
        for(int i=0;i<11;i++) 
            if(!set4.contains(i)) 
                comp4.add(i);
            
        System.out.print("\n\nB complement: ");
        for(int i=0; i<comp4.size(); i++) 
            System.out.print(comp4.get(i)+" ");
        
        
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;

        System.out.println("\n\nElapsed Time using Sets: " + elapsedTime+" ms");
    }
}
