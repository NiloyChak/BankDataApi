package com.io.rest.bankApi.service;

import com.io.rest.bankApi.entity.Customer;
import com.io.rest.bankApi.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer getBySurname(String surname) {
        return customerRepository.getBySurname(surname);
    }

    @Override
    public List<Customer> getByGenderOrderBySalaryDesc(String gender, Pageable pageable) {
        return (List<Customer>) customerRepository.getCustomerByGenderOrderBySalaryDesc(gender, pageable);
    }


}
