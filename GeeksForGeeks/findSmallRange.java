// You are using Java
import java.util.*;
class findSmallRange
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        List<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            arr1.add(obj.nextInt());
        }
        
        int n2 = obj.nextInt();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<n2;i++)
        {
            arr2.add(obj.nextInt());
        }
        
        int n3 = obj.nextInt();
        List<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<n3;i++)
        {
            arr3.add(obj.nextInt());
        }
        
        int[] range = findSmall(arr1,arr2,arr3);
        System.out.println("("+range[0]+", "+range[1]+")");
    }
    
    public static int[] findSmall(List<Integer> a,List<Integer> b,List<Integer> c)
    {
        int[] res = new int[2];
        int i= 0,j=0,k=0;
        int minr = Integer.MAX_VALUE;
        while(i<a.size() && j<b.size() && k < c.size())
        {
            int minval = Math.min(a.get(i), Math.min(b.get(j),c.get(k)));
            int maxval = Math.max(a.get(i), Math.max(b.get(j), c.get(k)));
            
            if(maxval - minval < minr)
            {
                minr = maxval -minval;
                res[0] = minval;
                res[1] = maxval;
            }
            
            if(a.get(i) ==minval) i++;
            else if(b.get(j) == minval) j++;
            else k++;
        }
    return res;
    }
}
