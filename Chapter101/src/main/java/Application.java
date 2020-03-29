import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-25 16:31
 **/
@SpringBootApplication
@ComponentScan("com.course")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
