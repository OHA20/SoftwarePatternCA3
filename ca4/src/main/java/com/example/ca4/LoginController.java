package com.example.ca4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    @PostMapping
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginService.validateUser(username, password)) {
            return "redirect:/books";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
