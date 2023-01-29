package deployment.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        return "<h1>index 2</h1>";
    }
    @GetMapping("/test")
    public String test() {
        return "<h1>test page 2</h1>";
    }

    @GetMapping("/test2")
    public String test2() {
        return "<h1>test2>/h1>";
    }
}
