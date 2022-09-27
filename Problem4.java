package tendemloop;

/*Problem-4:  Get the total count of number list in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
    (examples)
    input: [1,2,8,9,12,46,76,82,15,20,30]
    Output:
        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
        */
//Solution-Java

import java.util.*;
public class Problem4 {
	
    static int ans[];
 
    
    static void countSieve(int arr[], int n)
    {
        int MAX = arr[0];
        for (int i = 1; i < n; i++)
            MAX = Math.max(arr[i], MAX);
 
        int cnt[] = new int[MAX + 1];
 
        ans = new int[MAX + 1];
 
        
        for (int i = 0; i < n; ++i)
            ++cnt[arr[i]];
 
        for (int i = 1; i <= MAX; ++i)
            for (int j = i; j <= MAX; j += i)
                ans[i] += cnt[j];
        return;
    }
 
    static int countMultiples(int k)
    {
       
        return ans[k];
    }
 
    
    public static void main(String args[])
    {
        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
       
 
        
        countSieve(arr,arr.length);
 
        int k = 0;int l = 0;
        for (int i=0 ;i<arr.length;i++)
        {
        	    k++; 
        System.out.print(k+":"+countMultiples(k)+",");
        
        }
        }
    }
    

