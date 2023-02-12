import java.util.*;
class Ques1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];

        }
        int b[]=new int[max];
        for(int i=0;i<n;i++)
        {
            b[a[i]-1]=a[i];
        }
        for(int i=0;i<max;i++)
        {
            if(b[i]==0)
                System.out.print(i+1+" ");
        }
    }
}