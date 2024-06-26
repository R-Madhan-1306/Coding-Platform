//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class cuboid{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String arr[] = read.readLine().trim().split("\\s+");
            double perimeter = Double.parseDouble(arr[0]);
            double area = Double.parseDouble(arr[1]);

            Solution ob = new Solution();
            double ans = ob.maxVolume(perimeter, area);
            System.out.println(String.format("%.2f", ans));
        }
    }
}
// } Driver Code Ends




class Solution {

    double maxVolume(double perimeter, double area) {
        // code here
        double p = perimeter;
        double a = area;
        double l = (p - Math.sqrt(p*p-24*a))/12;
        double h = (p/4)-(2*l);
    return l*l*h;
    }
}