//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int sumOfMiddleElements(int[] arr1, int[] arr2) {
        List<Integer> a1 = new ArrayList<>();
        for(int num : arr1)
            a1.add(num);
        List<Integer> a2 = new ArrayList<>();
        for(int num : arr2)
            a2.add(num);

        // code here
        
        a1.addAll(a2);
        Collections.sort(a1);
        int n = a1.size();
        int m1 = a1.get(n/2);
        int m2 = a1.get(n/2-1);
        return m1+m2; // This case will never occur for valid input
    }
}

//{ Driver Code Starts.
public class MedianOfList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.sumOfMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends
