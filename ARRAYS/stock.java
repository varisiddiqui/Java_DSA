public class stock {
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        int cp[]=new int[prices.length];
        int sp[]=new int[prices.length];
        int diff=0,profitMax=0;
        sp[0]=0;
        cp[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            sp[i]=prices[i];
            if(i==1){
                cp[i]=prices[i-1];
            }
            else{
                cp[i]=Math.min(prices[i-1],cp[i-1]);
            }
        }
        for(int i=0;i<prices.length;i++){
            diff=sp[i]-cp[i];
            profitMax=Math.max(diff,profitMax);
        }
        System.out.println("Max profit:"+profitMax);
    }
    
}
