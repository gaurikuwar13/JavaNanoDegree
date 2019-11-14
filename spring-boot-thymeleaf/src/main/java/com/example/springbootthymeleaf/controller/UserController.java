package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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

   @RequestMapping("demo2")
    public String demo2(Model model) {
       List<User> studentList = new ArrayList<>();
       studentList.add(new User(1,"Mayank",7));
       studentList.add(new User(2,"Aarya",5));
       studentList.add(new User(3,"Akshara",2));
       studentList.add(new User(4,"Prisha",2));
       model.addAttribute("list",studentList);
       return "demo2";
   }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request, Model model) {
        // Add "request data" string to the request scope and associated it with the key "request" (we'll use the key value to retrieve the data)
        request.setAttribute("request", "request data");

        // Add "session data" String to the session scope and associate it with the key "session" (we'll use the key value to retrieve the data)
        request.getSession().setAttribute("session", "session data");

        // Add "application data" String to the application scope and associate it with the key "application" (we'll use the key value to retrieve the data)
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "demo2";
    }
}
