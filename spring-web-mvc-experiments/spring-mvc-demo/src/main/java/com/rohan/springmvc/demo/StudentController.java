package com.rohan.springmvc.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohan.springmvc.demo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{maritalStatus}") 
    private Map<String, String> maritalStatus;
    
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        
        // Create a new student object
        Student theStudent = new Student();
        
        // Add student object to the model object 
        // We are sending the empty form to the jsp.
        theModel.addAttribute("student", theStudent);
        
        theModel.addAttribute("theMaritalStatus", maritalStatus);
        
        return "student-form";
    }
    
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        
        System.out.println(theStudent);
        
        // It will send the student object to the student confirmation page.
        return "student-confirmation";
    }
}
