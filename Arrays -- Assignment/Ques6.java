import java.util.*;
class Ques6
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array-A length: ");
        int n=s.nextInt();
        System.out.print("\nEnter the array-A elements: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.print("\nEnter the array-B length: ");
        int m=s.nextInt();
        System.out.print("\nEnter the array-B elements: ");
        int b[]=new int[m];
        for(int i=0;i<m;i++)
            b[i]=s.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        for(int i=0;i<m;i++)
        {
            if(h.containsKey(b[i]))
                System.out.println("Frequency of "+b[i]+" : "+ h.get(b[i]));
            else
            System.out.println("Frequency of "+b[i]+" : 0");
        }
        
    }
}