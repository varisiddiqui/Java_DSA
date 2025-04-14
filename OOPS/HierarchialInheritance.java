public class HierarchialInheritance {
    public static void main(String[] args)
    {
        Birds obj=new Birds();
        obj.breathe();
    }
}
class Animals{
    void breathe(){
        System.out.println("Animals breathe");
    }
}

class Mammals extends Animals{
    void walk(){
        System.out.println("Mammals walk");
    }
}
class Fish extends Animals{
    void swim(){
        System.out.println("Fish swims");
    }
}
class Birds extends Animals{
    void fly(){
        System.out.println("Birds Fly");
    }
}