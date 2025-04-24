package com.example.ca4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class MainController {
	@GetMapping("/")
    public String landingPage()
    {
        return "index";
    }
    
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

}
