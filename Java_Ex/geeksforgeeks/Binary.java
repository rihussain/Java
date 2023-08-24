/*
Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4

Output: 3


Explanation: 4 appears at index 3.

*/


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Binary {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l=0,r=arr.length-1,mid;
        while(l<=r)
        {
            mid=l+((r-l)/2);
            if(k==arr[mid])
                return mid;
            else if(k<arr[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
        
    }
}

/*
-Riyaz Hussain
*/