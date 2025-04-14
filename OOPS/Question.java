public class Question {

    public static void main(String[] args) {

        Vehicle obj1 = new Car();

        obj1.print();// due to method overriding superclass is able to access subclass method
                     // otherwise if you change the method name in derived class it will show runtime
                     // error

        Vehicle obj2 = new Vehicle();

        obj2.print();

    }

}

class Vehicle {

    void print() {
        System.out.println("Base class(Vehicle)");
    }

}

class Car extends Vehicle {

    void print() {

        System.out.println("Derived class (Car)");
    }
}