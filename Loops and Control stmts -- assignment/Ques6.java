import java.util.*;
class Ques6
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i>=0;i--)
        {
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}