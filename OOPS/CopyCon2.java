public class CopyCon2{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Varis";
        s1.roll=6306;
        s1.marks[0]=1;
        s1.marks[1]=2;
        s1.marks[2]=3;
        Student s2=new Student(s1);
        s2.name="danish";
        s1.marks[2]=100;
        System.out.println(s1.name);
        System.out.println(s2.name);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);

        }
    }
}
    class Student{
        String name;
        int roll;
        int marks[];
        Student(){
            marks=new int[3];
            System.out.println("Constructor is called");
        }
        Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            //this.marks=s1.marks; This is Shallow Copy!
            
            //Deep Copy
            for(int i=0;i<3;i++){
                this.marks[i]=s1.marks[i];
            }
        }
        
    }
