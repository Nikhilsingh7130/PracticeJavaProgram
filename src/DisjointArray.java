import java.util.*;
import java.util.Arrays;
public class DisjointArray {
    public static boolean disjoint(int arr[],int brr[])
    {
        HashSet<Integer> hashset=new HashSet<>();
        for(int num:arr)
        {
            hashset.add(num);
        }
        for(int i:brr)
        {
            if(hashset.contains(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array A");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements A");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array B");
        int m=sc.nextInt();
        int brr[]=new int[m];
        System.out.println("Enter the elements B");
        for(int i=0;i<m;i++)
        {
            brr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        boolean flag= disjoint(arr,brr);
        System.out.println(flag);
        System.out.println("Hello");

    }
}

