//{ Driver Code Starts
    import java.util.*;

    class max_array {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    
                System.out.println(new Solution().max_sum(arr, n));
    
                t--;
            }
            sc.close();
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        long max_sum(int a[], int n) {
            // Your code here
            long aSum = 0;
            long  PreviousPatternSum = 0;
            long mul = 0;
            for(long num: a)
            {
                aSum += num;
                PreviousPatternSum += num * mul++;
            }
            int lastIndex = n - 1;
            long max = PreviousPatternSum;
            while(lastIndex > 0)
            {
                long lastNum = a[lastIndex--];
                PreviousPatternSum = (PreviousPatternSum - ((n-1) * lastNum)) + (aSum - lastNum);
                max = Math.max(PreviousPatternSum, max);
            }
            return max;
        }
    }
    