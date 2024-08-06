//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
        int n = str.length();
        if(n<7) return false;
        String res ="";
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch == '.')
            {
                int v = Integer.parseInt(res);
                if(v>255) return false;
                res ="";
            }
            else 
                res+=ch;
            
        }
        
        int v = Integer.parseInt(res);
        if(v>255) return false;
    return true;
    }
}
