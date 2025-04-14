import java.util.*;
public class diagnonalSum {
    public static void sum(int arr[][]){
        int s1=0,s2=0;
        int c=arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    s1=s1+arr[i][j];
                }
            }
            if(c>=0){
                if(c==i){
                    s2=s2+0;
                }
                else{ 
                s2=s2+arr[i][c];
                }

            c--;
            }
        }
        System.out.println("Sum of Diagonal elements is:"+(s1+s2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of square matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[][]=new int[r][r];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sum(arr);
    }
    
}
