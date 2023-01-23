package ClassworkJanuary23.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "3 6 9 12 15 18 21 24 27 30 33 36";
    }

}
