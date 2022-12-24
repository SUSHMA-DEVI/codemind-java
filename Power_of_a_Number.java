import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        int d=(int)Math.pow(a,b);
        int e=d%c;
        System.out.println(e);
    }
}