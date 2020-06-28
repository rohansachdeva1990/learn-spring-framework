package com.rohan.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // This is the high level mapping
public class HelloWorldController {

    // Need a controller method to show the Initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    
    // Need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
    
    
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        
        String theName = request.getParameter("studentName");
        
        theName = theName.toUpperCase();
        
        String result = "Yo!! " + theName;
        
        // Add the result to the model
        model.addAttribute("message", result);
        
        return "helloworld";
    }
    
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName , Model model) {
        
        theName = theName.toUpperCase();
        
        String result = "Yo!! From version 3 -  " + theName;
        
        // Add the result to the model
        model.addAttribute("message", result);
        
        return "helloworld";
    }
}
