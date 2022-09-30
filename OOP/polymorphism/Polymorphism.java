// classes starts with capital letter
class Bike {
    String name;
    String type;
    int model;

    // diff fucntions with same name is called (FUCNTION OVERLOADING) using func with same NAME in a single class
    public void displayInfo(String name) {
        System.out.println(name);
    }
    //
    public void displayInfo(String name, String type) {
        System.out.println(type);
    }
    public void displayInfo(int model) {
        System.out.println(model);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
    }
}