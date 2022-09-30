// classes starts with capital letter
class Bike {
    String name;
    String type;
    int model;

    // diff fucntions with same name is called (FUCNTION OVERLOADING) using func with same NAME in a single class
    public void displayInfo(String name) {
        System.out.println(name);
    }
    // can't pass parameters with String or int (MULTIPLE) times if using same name for for functions (FUCNTION OVERLOADING) rather pass mupltiple parameters like here String type and int model
    public void displayInfo(String type, int model) {
        System.out.println(type + " " + model);
    }
    public void displayInfo(int model) {
        System.out.println(model);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Bike petrolBike = new Bike();
        Bike elecBike = new Bike();

        petrolBike.name = "Unique";
        petrolBike.type = "Petrol";
        petrolBike.model = 2022;
        
        elecBike.name = "Honda";
        elecBike.type = "Electric";
        elecBike.model = 2022;

        petrolBike.displayInfo(petrolBike.name, petrolBike.type, petrolBike.model);
        elecBike.displayInfo(elecBike.name, elecBike.type, elecBike.model);
    }
}