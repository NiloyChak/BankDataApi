package com.io.rest.bankApi.webcontroller;


import com.io.rest.bankApi.entity.Customer;
import com.io.rest.bankApi.service.CustomerServiceImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerBankingController {

    private CustomerServiceImpl customerService;

    public CustomerBankingController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/all")
    public void getAllCustomers()
    {
        customerService.getAllCustomers();
    }

    @GetMapping("/name={surname}")
    public Customer getCustomerBySurname(@PathVariable String surname)
    {
        return customerService.getBySurname(surname);
    }

    @GetMapping("/sortByGender={gender}")
    public List<Customer> getCustomerByGenderOrderBySalaryDesc(@PathVariable String gender)
    {
        Pageable pageable = PageRequest.of(0,5);
        return customerService.getByGenderOrderBySalaryDesc(gender,pageable);
    }
}
