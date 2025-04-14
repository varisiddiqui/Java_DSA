/* public class MethodOverloading {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.sum(5,3));
        System.out.println(obj.sum(5,3,9));
        System.out.println(obj.sum(5.2f,3.3f));
    }
    
} */
public class MethodOverloading{
    public static void main(String[] args) {
        Claculator calc=new Claculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.sum(2,2,2));
        System.out.println(calc.sum(3.3f,2.2f));
    }
}
class Claculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
