import java.util.*;
class S
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,pro=1,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
        
    }
}