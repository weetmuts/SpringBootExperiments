package foo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    SlowService slow;

    @RequestMapping("/")
    public String index() {
        try {
            String customer = slow.loadCustomer(123);
            return "Greetings from Spring Boot! "+customer;
        } catch (Exception e) {
            return "Internal error "+e.toString();
        }
    }

}
