public class butterfly {
    public static void main(String[] args)
    {
        int l=0;
        for(int i=1;i<=4;i++)
        { 
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=6;j>l;j--)
            {
            System.out.print(" ");
            }
            l=l+2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        l=0;

        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=l;j++)
            {
                System.out.print(" ");
            }
            l=l+2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
    
}
