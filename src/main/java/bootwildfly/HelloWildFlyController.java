package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
    	String aaa = new String("AAAA");
        return ("AAAA SpringBoot on SpringBoot in meccano project .....");
    }
}