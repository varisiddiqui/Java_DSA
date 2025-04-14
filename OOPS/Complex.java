import java.util.*;
public class Complex {

    void sum(int real1,int img1,int real2,int img2){
        int a=real1+real2;
        int b=img1+img2;
        if(b<0){
            System.out.println(a+""+b+"i");
        }
        else{
            System.out.println(a+"+"+b+"i");
        }

    }

    void difference(int real1,int img1,int real2,int img2){
        int a=real1-real2;
        int b=img1-img2;
        if(b<0){
            System.out.println(a+""+b+"i");
        }
        else{
            System.out.println(a+"+"+b+"i");
        }
    }

    void product(int real1,int img1,int real2,int img2){
        int a=real1*real2-img2*img1;
        int b=real1*img2+img1*real2;
        if(b<0){
            System.out.println(a+""+b+"i");
        }
        else{
            System.out.println(a+"+"+b+"i");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two complex number");
            int real1=sc.nextInt();
            int img1=sc.nextInt();
            int real2=sc.nextInt();
            int img2=sc.nextInt();
            Complex c=new Complex();
            c.sum(real1, img1, real2, img2);
            c.difference(real1, img1, real2, img2);
            c.product(real1, img1, real2, img2);
            
        
    }
    
}

