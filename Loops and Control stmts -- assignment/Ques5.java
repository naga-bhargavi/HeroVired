import java.util.*;
public class Ques5
{
    static Scanner sc= new Scanner(System.in);
    public static void display()
    {
        System.out.println("Menu based app - Unit conversion for Distance");
        System.out.println("1.CM to M \n2.M to KM \n3.KM to M \n4.M to CM");
        System.out.print("Enter your menu: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.print("Please enter the CM Value :");
                int cm=sc.nextInt();
                double m=(double)cm/100;
                System.out.println(cm+"CM = "+m+" M");
                break;
            }
            case 2:
            {
                System.out.print("Please enter the M Value :");
                int m=sc.nextInt();
                double km=(double)m/1000;
                System.out.println(m+" M = "+km+" KM");
                break;  
            }
            case 3:
            {
                System.out.print("Please enter the KM Value :");
                int km=sc.nextInt();
                System.out.println(km+" KM = "+km*1000+" M");
                break;
            }
            case 4:
            {
                System.out.print("Please enter the M Value :");
                int m=sc.nextInt();
                System.out.println(m+" M = "+m*100+" CM");
                break;
            }
        }
        System.out.print("If you want to Continue press 'y' else press any key :");
        char ch=sc.next().charAt(0);
        if(ch=='y')
        {
            System.out.println();
            display();
        }
        else
        System.exit(0);
        sc.close();
    } 
    public static void main(String[] args)
    {
        display();
    } 
}