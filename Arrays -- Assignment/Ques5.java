import java.util.*;
class Ques5
{
    public static void main(String args[])
    {
        int a[]= {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
      int c=0;
       int j=0;
       System.out.println("Array elements in the array are: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
        for(int i=0;i<a.length;i++)
        {
           if(a[i]!=1)
            {
                a[j]=a[i];
                j++;
            }
            else
                c++;
               
        }
        c=a.length-c;
        for(int i=c;i<a.length;i++)
            a[i]=1;
        System.out.println("\nArray elements after moving Ones to end: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
}