package com.example.ca4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/update")
    public String updateStock(@RequestParam Long bookId, @RequestParam int newStock) {
        adminService.updateStock(bookId, newStock);
        return "redirect:/admin";
    }

    @GetMapping("/customers")
    public String viewCustomers(Model model) {
        model.addAttribute("customers", adminService.getCustomerList());
        return "admin_customers";
    }
}
