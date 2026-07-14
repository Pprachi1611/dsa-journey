import java.util.*;

public class array_duplicate {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<Integer> s=new HashSet<>();
        for(int num :a)
        {
            if(s.contains(num))
            {
               // System.out.println("The duplicate element is :" +a[i]);
                System.out.println("The duplicate element found!!!!");
                return;
            }
            else
            {
                  s.add(num);
            }

        }
      
        System.out.println("No duplicate elements found.");
       // System.out.println("The unique elements are:"+s);
        sc.close();
    }
    
}