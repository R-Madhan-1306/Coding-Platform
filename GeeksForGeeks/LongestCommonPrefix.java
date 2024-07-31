//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class LongestCommonPrefix {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        if (arr.length == 0) return "-1";
        
        String f = arr[0]; // geeksforgeeks
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(f) != 0) {
                f = f.substring(0, f.length() - 1);
                if (f.isEmpty()) return "-1";
            }
        }
        return f;
    }
}




