public class Static {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="SMS";
        s1.roll=25;
        System.out.println(s1.schoolName);

        Student s2=new Student();
        s2.schoolName="DPS";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
        
    }
    
}
class Student{

    static int returnPercentage(int maths,int phy,int chem){
        return (maths+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;// sare object ke liye same rahega schoolName


    //String schoolName; --->  [Since the schoolName property is not declared as static, each instance (object) of the Student class has its own separate memory location for the schoolName]

    //[When you modify the schoolName property for one instance (e.g., s2), it does not affect the value of schoolName for other instances (e.g., s1).]

    //[This behavior allows encapsulation and isolation of data within individual objects.]
    
    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}
