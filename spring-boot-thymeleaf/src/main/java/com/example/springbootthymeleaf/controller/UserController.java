package com.example.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message","Hello Thymeleaf");
        double grade = 59.99999;
        model.addAttribute("grade",grade);
        model.addAttribute("GPA",convertGPA(grade));
        //return to templates/demo.html page
        return "demo";
    }

   public String convertGPA(double grade) {
        if(grade>90) return "A";
        else if (grade <=90 && grade >75) return "B";
        else if (grade<=75 && grade >70) return "C";
        else if (grade<=70 && grade >60) return "D";
        else return "F";
   }
}
