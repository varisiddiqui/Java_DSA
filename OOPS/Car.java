public class Car { //usning copy constructor concept
    private String name;
    private int age;

    public static void main(String[] args) {
        Car car1=new Car("BMW",2020);
        Car car2=new Car(car1);
        
        System.out.println(car1.name);
        System.out.println(car2.age);
        System.out.println(car2.name);
    }
   

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car(Car other) {
        this.name = other.name;
        this.age = other.age;
    }

    
}