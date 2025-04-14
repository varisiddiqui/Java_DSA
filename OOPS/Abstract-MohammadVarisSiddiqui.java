public class Abstract {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eats();
        h.walks();
        h.changeColor();
        System.out.println(h.color);

        Chicken c=new Chicken();
        c.eats();
        c.walks();
        
        


        Mustang myHorse=new Mustang();
        //Animals ->Horse -> Mustang
        
    }
    
}
abstract class Animals{
    String color;
    /* Animals(){
        color="brown";
    } */

    Animals(){
        System.out.println("animal constructor called");
    }
    void eats(){
        System.out.println("Animals eat");
    }
    abstract void walks();
}

class Horse extends Animals{
    Horse(){ 
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animals{
    void changeColor(){
        color="dark white";
    }
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }

}

