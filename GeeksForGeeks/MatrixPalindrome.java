//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class MatrixPalindrome {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] a) {
        String c="";
        String r="";
        int f=1;
        for(int i=0;i<a.length;i++)
        {
            c="";
            r="";
            for(int j=0;j<a[0].length;j++)
            {
                r+=a[i][j];
                c+=a[j][i];
            }
            StringBuilder sr = new StringBuilder(r);
            StringBuilder sc  = new StringBuilder(c);
            if(r.equals((sr.reverse()).toString())&&f==1)
                return i+" R";
            else if(c.equals((sc.reverse()).toString())&&f==2)
                return i+" C";
            if(i+1==a.length&&f<2)
            {
                i=-1;
                f+=1;
            }
        }
   return "-1";
    }
}
