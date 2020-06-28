package com.rohan.springdemo.dao;

import com.rohan.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rohan on 05/02/2017.
 */


/**
 * Note : About @Repository
 * <p>
 * 1. Mainly used for DAO implementation
 * 2. Child class of Component. So it inherits its properties as well as provides some extra ones
 * 3. Spring will automatically register it through component scanning. Hence, it will be available
 * where we need to use it.
 * 4. For this, spring also provide translation of any JDBC checked to exception to unchecked ones, so`
 * that the code is more cleaner.
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {

    // Injecting Hibernate Session Factory, so that our DAO can talk to Database
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        // Get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Create a query
        Query<Customer> customerQuery = currentSession.createQuery("FROM Customer ORDER BY lastName",
                Customer.class);

        // Execute query and get result list
        List<Customer> customers = customerQuery.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        // Wow, provided by the hibernate
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Customer getCustomer(int customerId) {
        Session currentSession = sessionFactory.getCurrentSession();
        return (Customer) currentSession.get(Customer.class, customerId);
    }

    @Override
    public void deleteCustomer(int customerId) {
     Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("delete from Customer where id =:customerId");
        query.setParameter("customerId",customerId);
        query.executeUpdate(); // Generic HQL method for both update and delete
    }
}
