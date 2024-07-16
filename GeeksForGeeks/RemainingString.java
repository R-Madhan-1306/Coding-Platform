//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class RemainingString {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int c=0;
        String res="";
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            char cr= s.charAt(i);
            if(cr==ch)
            {
                c++;
            }
            if(count<=c)
            {
                if(count==c){c++;}
                else res+=cr;
            }
        }
    return res;
    }
}
