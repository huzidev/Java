// classes starts with capital letter
class Bike {
    String name;
    String type;
    int model;
    float avg;

    // diff fucntions with same name is called (FUCNTION OVERLOADING) using func with same NAME in a single class
    public void displayInfo(String name) {
        System.out.println(name);
    }
    // can't pass parameters with String or int (MULRIPLE) times if using same name for for functions (FUCNTION OVERLOADING) rather pass mupltiple parameters like here String name and String type
    public void displayInfo(String name, String type) {
        System.out.println(name + " " + type);
    }
    public void displayInfo(int model) {
        System.out.println(model);
    }
    public void displayInfo(float avg) {
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
        petrolBike.avg = 60.5;
    }
}