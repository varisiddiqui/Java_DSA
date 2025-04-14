import java.util.Scanner;

public class pat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row = sc.nextInt();
        int column = sc.nextInt();
        for (int i = 0; i < row; i++) {
            if (i == 0||i==row-1) 
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=0;j<column;j++)
                {
                    if(j==0||j==(column-1))
                    {
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
