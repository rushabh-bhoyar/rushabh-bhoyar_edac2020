
public class A13
{
    public static void main(String[] args)
    {
        int n = 6 ;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int space = i ; space <= n ; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n * 2 ; j++)
            {
                if((j==1 || j == i * 2 -1) || (i == n && j % 2 == 1))
                    System.out.print("*");
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
            }
    }
}
