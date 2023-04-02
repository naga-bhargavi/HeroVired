import java.util.*;
class Ques3
{
    public static void main(String args[])
    {
        int a[]={23, 21, 44, 32, 12};
        Arrays.sort(a);
        System.out.print("The elements in ascending order: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        for(int i=0,j=a.length-1;i<j;i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.print("\n The elements in descending order:  ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}