//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class no_of_rect{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int c=0;
        for(int i=1;i<=2*r+1;i++)
        {
            for(int j=1;j<=2*r+1;j++)
            {
                if((i*i + j*j) <= (4*r*r))
                    c = c + 1;

            }
        }
        return c;
    }
}