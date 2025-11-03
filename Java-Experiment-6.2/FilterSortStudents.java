import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return name + " - Marks: " + marks;
    }
}

public class FilterSortStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 65),
            new Student("Charlie", 78),
            new Student("David", 92),
            new Student("Eve", 55)
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println("\nStudents scoring above 75% (sorted by marks):");
        students.stream()
                .filter(s -> s.getMarks() > 75)                     // Filter > 75%
                .sorted((s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks())) // Sort ascending
                .map(Student::getName)                              // Extract only names
                .forEach(System.out::println);                      // Print names
    }
}
