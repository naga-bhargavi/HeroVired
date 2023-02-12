import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class Question3
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the Linked list");
        int sz=s.nextInt();
        Node h=null,t=null;
        for(int i=0;i<sz;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            if(h==null)
            {
                h=n;
                t=n;
            }
            else
		{
                t.next=n;
                t=t.next;
            }
        }
        Node rs=null,ta=null;

        ArrayList<Integer> list=new ArrayList<>();
        while(h!=null)
        {
            if(!list.contains(h.data))
            {
                list.add(h.data);
                Node n=new Node(h.data);
                if(rs==null)
                {
                    rs=n;
                    ta=n;
                }
                else{
                    ta.next=n;
                    ta=n;
                }
            }
            h=h.next;
        }
        while(rs!=null)
        {
            System.out.print(rs.data+" ");
            rs=rs.next;
        }
        s.close();
    }
}