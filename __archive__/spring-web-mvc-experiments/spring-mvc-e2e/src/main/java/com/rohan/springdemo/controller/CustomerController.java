package com.rohan.springdemo.controller;

import com.rohan.springdemo.entity.Customer;
import com.rohan.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rohan on 05/02/2017.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    /**
     * Spring will scan for a component that implements CustomerDAO interface
     */
    @Autowired
    private CustomerService customerService;

    /*
    @RequestMapping("/list")

    Note: to limit the mapping to serve GET request only...
    @RequestMapping(path = "/list", method = RequestMethod.GET)
    */

    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        // Get customers from Customer Service
        List<Customer> customers = customerService.getCustomers();

        // Add the customers to the model
        theModel.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theCustomerId, Model theModel) {
        // Get the customer from the database
        Customer theCustomer = customerService.getCustomer(theCustomerId);

        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("customer", theCustomer);

        // send over to our form
        return "customer-form";
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int theCustomerId) {
        customerService.deleteCustomer(theCustomerId);
        return "redirect:/customer/list";
    }
}