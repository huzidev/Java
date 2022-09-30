class Employee {
    int id;
    int age;
    String name;
    Float salary;
    public void printDetails() {
        System.out.println("Employee's id is "+ id);
        System.out.println("Employee's age is "+ age);
        System.out.println("Employee's name is "+ name);
    }
}

public class classes {
    public static void main(String[] args) {
        System.out.println("Custom classes");

        // Instantiating objects
        Employee huzi = new Employee();
        Employee sohaib = new Employee();

        // Setting attributes
        huzi.id = 1;
        huzi.age = 20;
        huzi.name = "Huzi";
        
        sohaib.id = 1;
        sohaib.age = 20;
        sohaib.name = "Huzi";

        // Calling functions
        huzi.printDetails();
        sohaib.printDetails();
    }
}