import java.util.*;
public class twosum_hashmap {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        int target;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        target=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<5;i++)
        {
            map.put(arr[i], i);
            int c=target-arr[i];
            if(map.containsKey(c))
            {
                System.out.println("Teh index of two numbers are  :"+map.get(c)+ " and " +i);
            }
        }
        sc.close();
    }
}
