public class HardSeries {
    public static void main(String[] args) {
        int arr[]=new int[10];
        arr[0]=1;
        arr[1]=0;
        System.out.println(arr[0]);
        System.out.println(arr[0]+" "+arr[1]);
        int i,j;
        for(i=2;i<10;i++){
            int last=arr[i-1];
            for(j=1;j<i;j++){
                int temp=arr[j];
                arr[j]=arr[j-1]+temp;
            }
            arr[i]=last;
            for(j=0;j<=i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}
