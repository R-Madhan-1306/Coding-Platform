//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class RowWithMax1s{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxRow =-1;
        int max=0;
        int v=0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++)
        {
            v=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                    v++;
            }
            if(max<v)
            {
                maxRow=i;
                max=v;
            }
            
        }
        
    return maxRow;
    }
}
