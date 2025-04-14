public class OOPS {
    public static void main(String[] args) {
         Pen p1=new Pen();//created a Pen class object called p1.

         p1.setColor("Blue");
         System.out.println(p1.color);

         p1.setTip(5);
         System.out.println(p1.tip);
         
         //p1.setColor("yellow");
         p1.color="yellow";
         System.out.println(p1.color);

         BankAccount myAcc=new BankAccount();
         myAcc.username="varisSiddiqui";
         //myAcc.password="abcdefgh"; this password is not visible here because of private
         myAcc.setPassword("abcdefghi");
         System.out.println(myAcc.username);      

    }
    
}
class Pen{
    String color;
    int tip;
    
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip; 
    }
}

class Student{
    String name;
    int age;
    float percentage;//  cgpa
    
    void calcPercentage(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
    
}
