import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
       this.data=data;
        next=null;
    }
}
class Question2 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the Linkedlist-1");
        int n1=s.nextInt();
        Node h1=null,temp1=null;
        Node h2=null,temp2=null;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            list.add(n.data);
            if(h1==null)
            {
                h1=n;
                temp1=n;
            }
            else
            {
                temp1.next=n;
                temp1=n;
            }
        }
        System.out.println("Enter the size of the  Linkedlist-2");
        int n2=s.nextInt();
        for(int i=0;i<n2;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            list.add(n.data);
            if(h2==null)
            {
                h2=n;
                temp2=n;
            }
            else
            {
                temp2.next=n;
                temp2=n;
            }
        }
        Collections.sort(list);
        Node res=null,ta=null;
        for(int i: list)
        {
            Node n=new Node(i);
            if(res==null)
            {
                res=n;
                ta=n;
            }
            else
            {
                ta.next=n;
                ta=n;
            }
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        s.close();
    }
}
