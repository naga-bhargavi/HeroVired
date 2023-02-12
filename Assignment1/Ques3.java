import java.util.*;
class Ques3
{
    static Scanner s=new Scanner(System.in);
    public static void getValues(int n,List<Object> l,HashMap<Integer,List> h,List<String> prod)
    {
        System.out.println("Enter Product Details: ");
        for(int i=0;i<n;i++)
        {
            int p_id=s.nextInt();
            String p_name=s.next();
            int p_cost=s.nextInt();
            int p_count=s.nextInt();
            l.add(p_name);
            l.add(p_cost);
            l.add(p_count);

            h.put(p_id,new ArrayList<Object>(l));
            l.clear();
            prod.add(p_name);
        }
    }
    public static void view_prod(List<String> l)
    {
        System.out.println("The Product are:\n------------------");
        for(int i=0;i<l.size();i++)
            System.out.println((i+1)+" "+l.get(i));
    }
    public static void view_prod_count(List<Object>l,HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id to view the count :");
        int id=s.nextInt();
        System.out.println("The count  is: "+h.get(id).get(2));
    }
    public static void view_prod_details(HashMap<Integer,List> h)
    {
        System.out.println("Enter the Product id to view the details:");
        int id=s.nextInt();
        System.out.println("Product Name \t Product cost \t Product count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public static void update_value(HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id to edit the cost : ");
        int id=s.nextInt();
        System.out.println("Enter the value need to be updated: ");
        int val=s.nextInt();
       List<Object> l=new ArrayList<Object>();
       l.add(h.get(id).get(0));
       l.add(val);
      l.add(h.get(id).get(1));
      h.replace(id,l);


        System.out.println("The updated value of the product is:");
        System.out.println("Product Name \t Product cost \t Product count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public static void add_delete(HashMap<Integer,List>h)
    {
       while(true)
       {
            System.out.println("\n Select an option\n ---------------------" );
            System.out.println("1. Add Count(Stock loaded)\n2. Delete Count(Stock selled)\n3. Exit...");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                        add_count(h);
                        break;
                case 2:
                        delete_count(h);
                        break;
                case 3:
                        break;
                default:
                    System.out.println("Enter valid option");
                    break;
            }
            if(n==3)
                break;
       }
        
    }
    public static void add_count(HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id to which the count to be added");
        int id=s.nextInt(); 
        System.out.println("Enter the count to be added:");
        int c=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        l.add(h.get(id).get(0));
         l.add(h.get(id).get(1));
        int x=(int)h.get(id).get(2);
        x+=c;
         l.add(x);
          h.replace(id,l);
         System.out.println("After Adding the count: ");
         System.out.println("Product Name \t Product cost \t Product count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
     public static void delete_count(HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id to which the count to be deleted");
        int id=s.nextInt(); 
        System.out.println("Enter the count to be deleted:");
        int c=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        l.add(h.get(id).get(0));
         l.add(h.get(id).get(1));
         int x=(int)h.get(id).get(2);
        x-=c;
         l.add(x);
          h.replace(id,l);
         System.out.println("After deleting the count: ");
         System.out.println("Product Name \t Product cost \t Product count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }


    
    public static void main(String args[])
    {
        
        System.out.println("\nEnter Number of products\n-------------------------");
        int n=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        List<String> products=new ArrayList<String>();

        HashMap<Integer,List> h=new HashMap<>();
        getValues(n,l,h,products);
        
        while(true)
        {
            System.out.println("\n\nSelect a number: \n-----------------");
            System.out.println("1. View Product List \n2. View Product Count\n3. View Product Details \n4. Update Product Details\n5. Add/Delete Product Quantities\n6. Exit...");
            int num=s.nextInt();
            switch(num)
            {
                 case 1: 
                        view_prod(products);
                        break;
                case 2:
                        view_prod_count(l,h);
                        break;
                case 3: 
                        view_prod_details(h);
                        break;
                case 4:
                        update_value(h);
                        break;
                case 5:
                        add_delete(h);
                        break;
                case 6:
                        break;
            }
            if(num==6)
                break;
        }
    }
}