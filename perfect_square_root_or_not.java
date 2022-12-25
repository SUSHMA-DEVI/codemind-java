import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=(int)Math.sqrt(n);
        if(r*r==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}