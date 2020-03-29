package hello;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-25 16:22
 **/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }
}
