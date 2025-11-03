
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = ctx.getBean(Student.class);
        student.displayCourse();
        ctx.close();
    }
}