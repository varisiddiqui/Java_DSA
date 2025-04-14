public class Inheritance {
    public static void main(String[] args){
        fish sharks=new fish();
        sharks.eat();
        sharks.gills();
        System.out.println(sharks.name);
    }
}
    //Base class or Parent class
    class Animal{
        String name="tuna";
        void breathe(){
            System.out.println("Animals breath");
        }
        void eat(){
            System.out.println("Animals eats");
        }

    }

    //Derived class or sub-class
    class fish extends Animal{
        void gills(){
            System.out.println("Fish has gills");
        }
    }
    
    

