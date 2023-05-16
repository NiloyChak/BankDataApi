package com.io.rest.bankApi.repository;


import com.io.rest.bankApi.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
    Customer getBySurname(String surname);
    List<Customer> getCustomerByGenderOrderBySalaryDesc(String gender, Pageable pageable);
}
