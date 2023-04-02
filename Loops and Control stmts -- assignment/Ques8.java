import java.util.*;
class Ques8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int min=a,max=a;
        float avg=(float)(a+b+c)/3;
        if(min>b)
            min=b;
        if(max<b)
            max=b;
        if(min>c)
            min=c;
        if(max<c)
            max=c;
    System.out.println("The Smallest Number: "+min);
    System.out.println("The Largest Number: "+max);
    System.out.println("Average of all three numbers: "+avg);
    }
}