package pixel.academy.thymeleaf.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form.html";
    }

    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

}
