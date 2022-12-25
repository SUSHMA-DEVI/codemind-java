import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            sum=sum+i;
        }
        for(int j=1;j<b;j++)
        {
            if(b%j==0)
            sum1=sum1+j;
        }
        if(sum==b && sum1==a)
        {
            System.out.println("Amicable");
        }
        else
        {
             System.out.println("Not Amicable");
        }
    }
}