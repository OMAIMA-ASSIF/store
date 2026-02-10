package com.project1springboot.store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")   // '/' for home endpoint
    public String index() {
        return "index.html";
    }
}
