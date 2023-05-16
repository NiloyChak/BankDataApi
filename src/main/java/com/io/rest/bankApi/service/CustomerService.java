package com.io.rest.bankApi.service;

import com.io.rest.bankApi.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getBySurname(String surname);
    List<Customer> getByGenderOrderBySalaryDesc(String gender, Pageable pageable);
}
