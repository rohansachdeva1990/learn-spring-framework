package com.rohan.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        // Spring will automatically add prefix and suffix for us......
        return "main-menu";
    }
}
