import java.util.*;
class Ques3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Num1= ");
        int num1=s.nextInt();
        System.out.print("Num2= ");
        int num2=s.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("\n After Swapping the numbers: \n Num1= "+num1+" \n Num2= "+num2);
    }
}
