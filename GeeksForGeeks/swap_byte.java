// Swap two nibbles in a byte

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class swap_byte {
    @SuppressWarnings("static-access")
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        return (((n&15)<<4)+(n>>4));
    }
}