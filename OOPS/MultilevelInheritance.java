public class MultilevelInheritance {
    public static void main(String[] args){
        Dog obj=new Dog();
        obj.eats();
        System.out.println(obj.name);
        System.out.println(obj.dogName);
    }
    
}

class Animal{
    String type="mammals";
    void eats(){
        System.out.println("animal eats");
    }
    void breath(){
        System.out.println("animals breath");
    }
}

class Fis extends Animal{
    String name="tuna";
    void gills(){
        System.out.println("Fish have gills");
    }

}

class Dog extends Fis{
    String dogName="German Shepherd";
    void doggy(){
        System.out.println("Dog has four legs");
    }
}
