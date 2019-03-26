package foo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        try {
            return "Greetings from Spring Boot!";
        } catch (Exception e) {
            return "Internal error "+e.toString();
        }
    }

}
