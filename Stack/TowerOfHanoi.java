import java.util.Stack;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char S, char H, char D){
        //Base Case
        if(n == 0){
            return;
        }

        //recursion
        towerOfHanoi(n-1, S, D, H);
        System.out.println("Move "+n+" from "+S+" to "+D);
        towerOfHanoi(n-1, H, S, D);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
    
}
