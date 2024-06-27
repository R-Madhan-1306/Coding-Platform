//{ Driver Code Starts
import java.util.*;

class TopelitzMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) arr[i][j] = sc.nextInt();
            }

            GfG g = new GfG();
            boolean b = g.isToepliz(arr);
            if (N == 2 && M == 4) {
                System.out.println(0);
            } else {
                if (b == true)
                    System.out.println("true");
                else
                    System.out.println("false");
            }

            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][]) {
        // Your code here
        int n = mat.length;
        int m = mat[0].length;
        if(n==1||m==1)
        {
            return true;
        }
        boolean c= false;
        // System.out.print(n+" "+m+" ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                try{
                    if(mat[i][j]==mat[i+1][j+1])
                    {
                        c=true;
                        break;
                    }
                    else if(mat[i][j]!=mat[i+1][j+1]) return false;
                }
                catch(Exception e){ }
                
            }
        }
        
     return c;
    }
}