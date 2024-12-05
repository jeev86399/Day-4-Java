import java.util.*;
public class middle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(b>c)
                System.out.println("b is middle");
            else if(a>c)
                System.out.println("c is middle");
            else
                System.out.println("a is middle");
        }
        else{
            if(a>c)
                System.out.println("a is middle");
            else if(b>c)
                System.out.println("c is middle");
            else
                System.out.println("b is middle");
        }
    }
}