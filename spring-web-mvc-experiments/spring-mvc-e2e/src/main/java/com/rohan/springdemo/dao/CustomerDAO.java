package com.rohan.springdemo.dao;

import com.rohan.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by rohan on 05/02/2017.
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int customerId);

    public void deleteCustomer(int customerId);
}

