class Employee {
    int id;
    int age;
    String name;
    int salary;

    // void function doesn't return
    public void printDetails() {
        System.out.println("Employee's name is " + name);
        System.out.println(name + "'s id is "+ id);
        System.out.println(name + "'s age is "+ age);
    }

    // int can return
    public int getSalary() {
        return salary;
    }
}

public class Classes {
    public static void main(String[] args) {
        System.out.println("Custom classes");

        // Instantiating objects
        Employee huzi = new Employee();
        Employee sohaib = new Employee();

        // Setting attributes
        huzi.id = 1;
        huzi.age = 20;
        huzi.name = "Huzi";
        huzi.salary = 90;

        sohaib.id = 2;
        sohaib.age = 19;
        sohaib.name = "Sohaib";
        sohaib.salary = 50;

        // Calling functions
        huzi.printDetails();
        sohaib.printDetails();
        int salary = huzi.getSalary();
        System.out.println(huzi.name + "'s salary is " + salary);
    }
}