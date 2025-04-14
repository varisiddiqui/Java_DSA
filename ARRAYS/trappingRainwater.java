public class trappingRainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        int totalTrapped=0;
        //Calculating Left Maximum height
        leftMax[0]=arr[0];
        for(int i=1;i<leftMax.length;i++){
            if(arr[i]<leftMax[i-1]){
                leftMax[i]=leftMax[i-1];
            }
            else{
                leftMax[i]=arr[i];
            }
        }
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=rightMax.length-2;i>=0;i--){
            if(arr[i]<rightMax[i+1]){
                rightMax[i]=rightMax[i+1];
            }
            else{
                rightMax[i]=arr[i];
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int min=Math.min(leftMax[i],rightMax[i]);
            int waterHeight=(min-arr[i]);
            if(waterHeight<0){
                waterHeight=0;
            }
            int water=waterHeight*1;
            totalTrapped=totalTrapped+water;
            
        }
        System.out.println("Total water trapped above bars is:"+totalTrapped);

        
    }
}
