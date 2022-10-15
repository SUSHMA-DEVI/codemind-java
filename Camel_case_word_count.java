import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0,j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                j=i;
                 break;
            }
          
        }
        
      for(int i=j;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch>='A' && ch<='Z')
          {
              c=c+1;
          }
      }
    System.out.println(c+1);
    }
}