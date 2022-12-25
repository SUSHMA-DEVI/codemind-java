import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        int rem,rev=0,s1;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        //int s1=(int)Math.sqrt(rev);
        s1=rev*rev;
        int rem1,rev1=0;
        while(s1>0)
        {
            rem1=s1%10;
            rev1=rev1*10+rem1;
            s1=s1/10;
        }
        if(rev1==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}