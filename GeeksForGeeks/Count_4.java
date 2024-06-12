//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Count_4{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;4
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            @SuppressWarnings("static-access")
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count =0;
        for(int i=0;i<=n;i++)
        {
            String s = Integer.toString(i);
            if(s.contains("4"))
            {
                count++;
            }
        }
        return count;
    }
}
