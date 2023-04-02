import java.util.*;
class Ques10
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("StringName: ");
        String str=s.next();
        System.out.print("Starting index: ");
        int start=s.nextInt();
        System.out.print("Ending index: ");
        int end=s.nextInt();
        System.out.print("subString of "+str+" from "+start+" to " +end+" is :   "+str.substring(start,end));
    }
}