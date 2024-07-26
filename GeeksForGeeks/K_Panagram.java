//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class K_Panagram {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
          boolean[] present = new boolean[26];
        int uniqueCount = 0;

        // Traverse the string and mark the presence of each character
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                int index = c - 'a';
                if (!present[index]) {
                    present[index] = true;
                    uniqueCount++;
                }
            }
        }

        // Calculate the number of unique characters we are missing to form a pangram
        int missingChars = 26 - uniqueCount;

        // Check if the number of missing characters is less than or equal to k
        // Also check if the string length is enough to hold 26 unique characters
        return missingChars <= k && str.replace(" ", "").length() >= 26;
    }
}
