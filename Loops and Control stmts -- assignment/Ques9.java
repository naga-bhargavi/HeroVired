import java.util.*;
class Ques9
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
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=s.nextInt();
        if(isprime(n))
            System.out.println("The given number "+n+" is a Prime number.");
        else
            System.out.println("The given number "+n+" is NOT a Prime number.");
    }
}