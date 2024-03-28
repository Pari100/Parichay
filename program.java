import java.util.*;
class Virtual
{
    public static void foodmenu(String item[],int price[])
    {
        
    System.out.println("---------------------Welcome to APD's Trio Restaurant---------------------");
        System.out.println("\t\t\t\t\t"+"MENU"+"\t\t\t\t\t");
        System.out.println("\t\t"+"Food"+"\t\t\t\t"+"Price");
        for(int i=0;i<item.length;i++)
        {
            System.out.println("\t\t"+item[i]+"\t\t"+price[i]);
        }
        System.out.println("------------------------------------------------------------------------");
    }
    public static void amount(int price[],int d[],String si, String sq)
    { 
    double amt=0;
    int i,c,c1;
    for(i=0;i<si.length();i++)
    {
        c=Integer.valueOf(si.charAt(i))-'0';
        c1=Integer.valueOf(sq.charAt(i))-'0';
        {
            if(c>=0&&c<=7)
            amt=amt+(price[c]*c1-((d[c]*price[c])/100));
        }  
    }
    System.out.println();
    System.out.println("Total Payable amount after discount is : Rs "+amt);
    System.out.println("Thank you! Have a good day :) ");
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String food_item[]={"0: Haka Noodles","1: Pav Bhaji","2: Veg Momos","3: Chola Bhatora","4: Punjabi Dal Makini with Nana",
        "5: Plain Dosa with Sambar","6: Paneer Chila","7: Pizza"};
    int food_price[]={200,250,150,300,320,350,390,200};
    int d[]={10,10,10,25,10,15,10,10};
    String si="",sq="";
    System.out.println();
    System.out.print("Enter your name : ");
    String name=sc.nextLine();
    System.out.println();
    System.out.println("Dear "+name+","+"Please Place your order! ");
    foodmenu(food_item,food_price);
    System.out.println();
    System.out.println("Enter your choice : "+""+"Enter 1 to start! ");
    int n=sc.nextInt();
    while(n!=0)
    {
            System.out.println("Enter food Number");
            int n1=sc.nextInt();
            si=si+n1;
            System.out.println("Enter that food quantity: Maximum Quantity is (5)");
            int n2=sc.nextInt();
            sq=sq+n2;
            System.out.println("Enter 1 to order more and 0 to stop ");
            n=sc.nextInt(); 
    }
    System.out.println("Your Order Id is :"+ (int)(Math.random()*1024));
    amount(food_price,d,si,sq);
    }
}

