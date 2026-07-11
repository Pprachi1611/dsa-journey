import java.util.*;

class TwoSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int target;
        System.out.println("Enter the element of array :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element :");
        target=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.println("The index of two numbers are :" +i+" and " +j);
            }
        }
        }
    }
}