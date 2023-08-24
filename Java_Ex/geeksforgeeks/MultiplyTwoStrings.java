/*
Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. 
There can be zeros in the begining of the numbers.

Example 1:

Input:
s1 = "0033"
s2 = "2"

Output:
66
*/


//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class MultiplyTwoStrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
         BigInteger n1 = new BigInteger(s1);
         BigInteger n2 = new BigInteger(s2);
         return String.valueOf(n1.multiply(n2));
      /* int n1=Integer.valueOf(s1);
       int   n2=n1*Integer.valueOf(s2);
      try{
        return String.valueOf(n2);
      }
      catch(NumberFormatException e) {
          return e.getMessage();
      }*/
        
        
    }
	
}

/*
-Riyaz Hussain
*/