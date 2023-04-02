import java.util.*;
class Ques1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(num+" X "+i+" = "+num*i);
    }
}