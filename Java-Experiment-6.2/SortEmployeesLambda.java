import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - Age: " + age + " - Salary: " + salary;
    }
}

public class SortEmployeesLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 25, 50000));
        employees.add(new Employee("Bob", 30, 45000));
        employees.add(new Employee("Charlie", 28, 60000));
        employees.add(new Employee("David", 22, 40000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by Name (Alphabetically)
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // Sort by Age (Ascending)
        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\nSorted by Age (Ascending):");
        employees.forEach(System.out::println);

        // Sort by Salary (Descending)
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }
}
