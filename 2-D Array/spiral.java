import java.util.*;
public class spiral {
    public static void spiralPrint(int arr[][]){
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr[0].length-1;
        while(startRow<=endRow&&startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            
            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(arr[j][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        /*System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }*/
        spiralPrint(arr);
    }
    
}
