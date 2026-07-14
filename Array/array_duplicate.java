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
        for(int i=0;i<a.length;i++)
        {
            if(s.contains(a[i]))
            {
                System.out.println("The duplicate element is :" +a[i]);
            }
            else
            {
                  s.add(a[i]);
            }

        }
         System.out.println("The unique elements are:"+s);
        sc.close();
    }
    
}