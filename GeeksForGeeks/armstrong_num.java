//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class armstrong_num {
    @SuppressWarnings("static-access")
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
        ob.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code heretemp
        int s=0;
        int sum=0;
        int temp = n;
        while(n>0)
        {
            n/=10;
            s++;
        }
        n=temp;
        for(int i=0;i<s;i++)
        {
            int dig = n%10;
            int v = (int)Math.pow(dig,s);
            sum +=v;
   
            n=(int)n/10;
            
        }
        n=temp;
        if(n==sum)
        {
            return "true";
        }
        else
        {
            return "false";
        }
   
    }
}
