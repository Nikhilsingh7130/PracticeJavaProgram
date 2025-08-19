## **1.DisjointArray**
**Check for Disjoint Arrays or Sets**
<br>
```bash
import java.util.*;
import java.util.Arrays;
public class DisjointArrays {
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
    }
}
```
## **2.EqualArray**
**Check if two arrays are equal or not**
<br>
```bash
import java.util.*;
import java.util.HashSet;
import java.util.Arrays;
public class EqualArray {
    public static boolean equal(int[] arr, int[] brr) {
        if (arr.length != brr.length)
        {
            return false;
        }
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int num:arr){
            hashset.add(num);
        }
        for(int num:brr){
            if(!hashset.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m=sc.nextInt();
        int[] brr = new int[m];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        System.out.println("Array 1 : "+Arrays.toString(arr));
        System.out.println("Array 2 : "+Arrays.toString(brr));
        if (equal(arr, brr)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
```

