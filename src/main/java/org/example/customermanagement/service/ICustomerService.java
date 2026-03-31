package org.example.customermanagement.service;

import org.example.customermanagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    void remove(Long id);
}
