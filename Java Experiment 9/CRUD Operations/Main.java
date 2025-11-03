public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create a new student
        Student s1 = new Student("John Doe");
        dao.createStudent(s1);
        System.out.println("Student created successfully!");

        // Read the student
        Student s2 = dao.readStudent(s1.getId());
        System.out.println("Fetched student: " + s2.getName());

        // Update the student
        s2.setName("John Smith");
        dao.updateStudent(s2);
        System.out.println("Student updated!");

        // Delete the student
        dao.deleteStudent(s2.getId());
        System.out.println("Student deleted!");
    }
}
