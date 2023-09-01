package academy.learnprogramming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMaven {
//    private final static Logger log= LoggerFactory.getLogger(HelloMaven.class);
@GetMapping("/hello")
    public static void main(String[] args) {
        System.out.println("qwertyuiop ");
//        log.info("dfh");
//        log.debug("hello");
    }
}
