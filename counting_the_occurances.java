import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        char s1=sc.next().charAt(0);
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==s1)
                c=c+1;
        }
        //System.out.println(c);
        if(c==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(c);
        }
        
        //System.out.println("-1");
    }
}