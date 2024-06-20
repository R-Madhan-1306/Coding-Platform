

import java.io.*;


class Inter_point {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            long p[] = new long[2];
            long q[] = new long[2];
            long r[] = new long[2];
            p[0] = Long.parseLong(S[0]);
            p[1] = Long.parseLong(S[1]);
            q[0] = Long.parseLong(S[2]);
            q[1] = Long.parseLong(S[3]);
            r[0] = Long.parseLong(S[4]);
            r[1] = Long.parseLong(S[5]);
            Solution ob = new Solution();
            long ans = ob.InternalCount(p, q, r);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    long InternalCount(long p[], long q[], long r[]) 
    {
        long area = Math.abs(p[0] * (q[1] - r[1]) + q[0] * (r[1] - p[1]) + r[0] * (p[1] - q[1]));
        long boundarySum = calculateGCD(p, q) + calculateGCD(q, r) + calculateGCD(r, p);
        return (area - boundarySum + 2) / 2;
    }
    long calculateGCD(long[] a, long[] b) 
    {
        return computeGCD(Math.abs(a[0] - b[0]), Math.abs(a[1] - b[1]));
    }
    long computeGCD(long p1, long p2) 
    {
        while (p2 != 0) 
        {
            long temp = p2;
            p2 = p1 % p2;
            p1 = temp;
        }
        return p1;
    }
}

