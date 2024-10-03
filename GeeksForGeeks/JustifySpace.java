// You are using Java
import java.util.*;
class JustifySpace
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.next();
        }
        int w = obj.nextInt();
        System.out.println(Justify(arr,w));
    }
    
    public static List<String> Justify(String[] arr ,int w)
    {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i< arr.length)
        {
            int len = arr[i].length();
            int j = i+1;
            while(j<arr.length && len+arr[j].length()+(j-i)<=w)
            {
                len += arr[j].length();
                j++;
            }
            StringBuilder l = new StringBuilder(arr[i]);
            int sp = w - len;
            int gap = j-i-1;
            if(j == arr.length || gap ==0)
            {
                for(int k=i+1;k<j;k++)
                {
                    l.append(" ").append(arr[k]);
                }
                l.append(" ".repeat(sp - gap));
            }
            else
            {
                int esp = sp/gap;
                int extsp = sp%gap;
                for(int k = i+1;k<j;k++)
                {
                    l.append(" ".repeat(esp+(k-i<=  extsp?1:0)));
                    l.append(arr[k]);
                }
            }
            res.add(l.toString());
            i=j;
        }
    return res;
    }
}
