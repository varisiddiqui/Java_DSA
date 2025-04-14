public class MethodOverriding {
    public static void main(String[] args) {
        Deer obj=new Deer();
        obj.eats();
        /* Deer obj=new Deer();
        obj.eats(); */  //child class ka print hoga
    }
    
}

class Animals{
    void eats(){
        System.out.println("Animals eats");
    }
}
class Deer extends Animals{
    void eats(){
        System.out.println("Deers eats");
    }
}