public class HybridInheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eats();
        obj.legs();
    }
    
}
class Animals{
    void eats(){
        System.out.println("Animals eats");
    }
}
class Fish extends Animals{
    void swim(){
        System.out.println("Fish swims");
    }
}
class Tuna extends Fish{
    void normalFish(){
        System.out.println("Tuna is economical fish");
    }
}
class Shark extends Fish{
    void dangerousFish(){
        System.out.println("Shark is dangerous fish");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("Birds Fly");
    }
}
class peacock extends Birds{
    void color(){
        System.out.println("Peacock is colorfull bird");
    }
}
class Mammals extends Animals{
    void legs(){
        System.out.println("Mammal generally  have four legs");
    }
}
class Dog extends Mammals{
    void breed(){
        System.out.println("Dogs have several breeds");
    }
}