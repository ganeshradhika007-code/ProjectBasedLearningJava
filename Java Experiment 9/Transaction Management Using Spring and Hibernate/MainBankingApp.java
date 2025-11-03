import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = " ")
public class SpringConfig {}

// MainBankingApp.java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBankingApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringConfig.class);
        TransferService service = ctx.getBean(TransferService.class);
        service.transfer(101, 102, 500.0);
        ctx.close();
    }
}
