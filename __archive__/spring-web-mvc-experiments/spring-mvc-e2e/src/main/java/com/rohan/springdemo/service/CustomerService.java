package com.rohan.springdemo.service;

import com.rohan.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by rohan on 05/02/2017.
 * <p>
 * <p>
 * This can serve multiple DAOs... Its a service facade pattern
 */
public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int customerId);

    public void deleteCustomer(int customerId);
}
