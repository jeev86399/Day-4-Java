import java.util.*;
public class mul8{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<=t;i++)
        {
            int n=sc.nextInt(); 
            if((n&7)==0)
                System.out.printf("%d multiple of 8\n",n);
            else
                System.out.printf("%d not multiple of 8\n",n);
        }
    }
}