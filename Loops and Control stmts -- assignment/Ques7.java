import java.util.*;
class Ques7
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<5;i++)
        {
            for(int j=i;j<5;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<5;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}