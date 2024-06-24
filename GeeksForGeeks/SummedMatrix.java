//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class SummedMatrix {
    @SuppressWarnings("static-access")
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n, q));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
       long e = n*2;
       long s=2;
       long v= e-s;
       long m = n+1;
       
       if(q==m)
        return n;
       else if(!(q<=e))
       {
           return 0;
       }
       else if(q<m){
           long d = m-q;
           long a = n-d;
           return a;
       }
       else if(q>m){
           long d =q-m;
           long a= d-n;
           return Math.abs(a);
       }
       
      return 0; 
    }
}