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
            static
    CustomerRepository repo;

    public static List<Customer> getAllCustomer() {
        return repo.findAll();
    }

    public static Customer createCustomer(Customer newCustomer) {
        repo.save(newCustomer);
        return newCustomer;
    }

    public static Customer getCustomerById(int id) {
        Optional<Customer> customer = repo.findById(id);
        return customer.orElse(null);
    }

    public static void updateCustomer(Customer customer) {
        repo.save(customer);
    }

    public static void deleteCustomer(int id) {
        Optional<Customer> customer = repo.findById(id);
        if (customer.isPresent()) {
            repo.delete(customer.get());
        }
    }
}

