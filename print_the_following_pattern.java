import java.util.Scanner;
class Patt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>0;j--)
            {
                System.out.printf("%d ",j);
                
            }
            
            System.out.println();
        }
    }
}