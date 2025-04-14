public class CopyConstructor {
    String name;
    int rollNo;
    String pwd;
    int marks[];

    CopyConstructor(String name,int rollNo,String pwd){
        marks=new int[3];
        this.name=name;
        this.rollNo=rollNo;
        this.pwd=pwd;
    }

    CopyConstructor(CopyConstructor other){//CopyConstructor
        marks=new int[3];
        this.name=other.name;
        this.rollNo=other.rollNo;
        this.pwd=other.pwd;
       /*  this.marks=other.marks; *///because this copy is shallow copy and arrays are reference type any change will be reflected

       //deep copy starts change will not be reflected
       for(int i=0;i<3;i++){
        this.marks[i]=other.marks[i];
       }

    }
    
    public static void main(String[] args) {
        CopyConstructor obj1=new CopyConstructor("Danish",2023021040,"Danish@2021");

        obj1.marks[0]=100;
        obj1.marks[1]=90;
        obj1.marks[2]=80;


        //obj1.name="varis"; here name will be changed because we have changed it in the first obj1
        CopyConstructor obj2=new CopyConstructor(obj1);//object is copied
        // obj2.name="xyz"; here name in obj2 will be changed

        obj1.marks[2]=100;//because this copy is shallow copy and arrays are reference type 
        System.out.println(obj1.name);
        System.out.println(obj2.name);

        for(int i=0;i<3;i++){
            System.out.println(obj2.marks[i]);
        }
    }
}
