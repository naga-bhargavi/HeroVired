import java.util.*;
class Ques2
{
    public static void main(String args[])
    {
        int a[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        System.out.println("The elements in the array - ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        for(int i=0,j=a.length-1;i<j;i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("\n\nThe elements in reverse order - ");
         for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}