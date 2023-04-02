import java.util.*;
class Ques1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int  a[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int min=a[0],max=a[0],sum=a[0];
        for(int i=1;i<a.length;i++)
        {
            sum+=a[i];
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println("The element with the Minimum value: "+min);
        System.out.println("The element with the Maximum value: "+max);
        System.out.println("Average of all array elements: "+(sum/a.length));
        System.out.println("Total number of array elements: "+a.length);


    }
}