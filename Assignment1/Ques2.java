import java.util.*;
class Ques2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        for(Map.Entry<Integer,Integer> e: h.entrySet())
        {
             System.out.print(e.getKey()+" ");
        }
    }
}