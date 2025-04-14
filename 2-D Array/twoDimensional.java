import java.util.*;

public class twoDimensional {

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println(key+" is in ("+i+","+j+") cell");
                    return true;
                }
                
            }
        }
        System.out.println(key+" is not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the array elements");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        search(arr,5);

    }

}
