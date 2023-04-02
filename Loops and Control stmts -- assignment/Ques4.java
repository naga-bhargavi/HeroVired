import java.util.*;
class Ques4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str="y";
        while(!str.equals("n"))
        {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int n=s.nextInt();
            if(n%2==0)
                System.out.println("The given number - "+n+"  is an EVEN Number");
            else
                System.out.println("The given number - "+n+"  is an ODD Number");
                System.out.print("Do you want to Continue: ");
                str=s.next();
                System.out.println("\n\n");

        }
    }
}