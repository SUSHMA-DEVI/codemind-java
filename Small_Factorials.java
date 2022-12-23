import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int sum=1;
           int a=sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
           sum=sum*i;
        }
        System.out.println(sum);
        }
    }
}