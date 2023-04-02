import java.util.*;
class Ques4
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int a[]={2, 29, 51, 8, 4};
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(isprime(a[i]))
            {
                if(max<a[i])
                    max=a[i];
            }
        }
       System.out.println("The Largest Prime number in given array: "+max);
    }
}