public class shortestPath {
    
    public static float displacement(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        //South
        if(dir=='S'){
            y--;
        }
        //North
        else if(dir=='N'){
            y++;
        }
        //West
        else if(dir=='W'){
            x--;
        }
        else{
            x++;
        }
    }
    int d=(x*x+y*y);
    return (float)Math.sqrt(d);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(displacement(path));
    }
    
}
