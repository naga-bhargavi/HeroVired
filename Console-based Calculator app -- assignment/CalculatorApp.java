import java.util.*;

class CalculatorApp
{
    public static int FACT(int n) 
    {
        if(n==1) return 1;
        return n * FACT(n-1);
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Command line calculator");

        System.out.println();
        int x = 1;
        while(x != 0) 
        {
            System.out.println("****SELECT THE OPERATORS SHOWN BELOW*********");
            System.out.println("+ ---> Addition                 ||    -  ---> Subraction");
            System.out.println("* ---> Multiplication           ||    /  ---> Division");
            System.out.println("% ---> Percentage               ||    F  ---> Factorial");
            System.out.println("2 ---> Square                   ||    C  ---> Cube");
            System.out.println("S ---> Square Root              ||    p--->a Power b");
            System.out.println("R ---> a Root b(don't select)   ||    X ----> Exit");
            System.out.println("SELECT THE SPECIFIC OPERAND");
            char s = sc.next().charAt(0);

            int a, b;
            try 
            {
                switch(s) 
                {
                    case '+': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a+b);
                        break;
                    }
                    case '-': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a-b);
                        break;
                    }
                    case '*': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a*b);
                        break;
                    }
                    case '/': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a/b);
                        break;
                    }
                    case '%': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a%b);
                        break;
                    }
                    case 'F': 
                    {
                        System.out.println("Enter the fact value");
                        a = sc.nextInt();
                        System.out.println(FACT(a));
                        break;
                    }
                    case '2': 
                    {
                        System.out.println("Enter the value");
                        a = sc.nextInt();
                        System.out.println(a*a);
                        break;
                    }
                    case 'C': 
                    {
                        System.out.println("Enter the value");
                        a = sc.nextInt();
                        System.out.println(a*a*a);
                        break;
                    }
                    case 'S': 
                    {
                        System.out.println("Enter the values of a");
                        a = sc.nextInt();
                        System.out.println(Math.sqrt(a));
                        break;
                    }
                    case 'p': 
                    {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(Math.pow(a,b));
                        break;
                    }
                    case 'R': 
                    {
                        System.out.println("Enter the values of b and a");
                        int aa = sc.nextInt();
                        int bb = sc.nextInt();
                        double root = Math.round(Math.pow(bb, 1.0/aa));
                        System.out.println(root);
                        break;
                    }
                    case 'X': 
                    {
                        x = 0;
                        break;
                    }
                }
            } 
            catch(ArithmeticException e) 
            {
                System.out.println("An arithmetic exception occurred: " + e.getMessage());
            } 
            catch(InputMismatchException e) 
            {
                System.out.println("InputMismatchException occurred: " + e.getMessage());
            }
        }
    }


}

