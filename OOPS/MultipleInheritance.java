public class MultipleInheritance {
    public static void main(String[] args) {
        Bear br=new Bear();
        br.eat();
        br.flesh();
    }
    
}
interface Herbivore{
    void eat();
}
interface Carnivore{
    void flesh();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Herbivore eat grass");
    }
    public void flesh(){
        System.out.println("Carnivore eat flesh");
    }
}
