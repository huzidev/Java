class Bike {
    String name;
    String type;
    int model;
    
    public void printInfo(String name, int model, String type) {
        System.out.println(name + " is of year " + model + " and type is " + type);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        Bike bikeA = new Bike();
        Bike bikeB = new Bike();

        bikeA.name = "Unique";
        bikeA.model = 2022;
        bikeA.type = "Electric Bike";
        
        bikeB.name = "Honda";
        bikeB.model = 2022;
        bikeB.type = "Petrol Bike";

        bikeA.printInfo(bikeA.name, bikeA.model, bikeA.type);
        bikeB.printInfo(bikeB.name, bikeB.model, bikeB.type);
    }
}