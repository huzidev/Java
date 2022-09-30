class Bike {
    String name;
    int model;
    
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int model) {
        System.out.println(model);
    }
    public void printInfo(String name, int model) {
        System.out.println(name + " is of year " + model);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        Bike bikeA = new Bike();

        bikeA.name = "Unique";
        bikeA.model = 2022;
        bikeA.printInfo(bikeA.name, bikeA.model);
    }
}