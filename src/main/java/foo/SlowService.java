package foo;

import org.springframework.stereotype.Service;

@Service
public class SlowService {

    public String loadCustomer(int id)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return "Customer "+id;
    }

}
