package com.company.trainreservation.service;

import com.company.trainreservation.model.Customer;
import com.company.trainreservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerService {

    @Autowired
    CustomerRepository  repo;

    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

    public Customer createCustomer(Customer newCustomer) {
        repo.save(newCustomer);
        return newCustomer;
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> customer = repo.findById(id);
        return customer.orElse(null);
    }

    public void updateCustomer(Customer customer) {
        repo.save(customer);
    }

    public void deleteCustomer(int id) {
        Optional<Customer> customer = repo.findById(id);
        customer.ifPresent(value -> repo.delete(value));
    }
}

