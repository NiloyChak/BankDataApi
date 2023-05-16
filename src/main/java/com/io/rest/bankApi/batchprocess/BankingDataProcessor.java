//package com.io.rest.bankApi.batchprocess;
//
//import com.io.rest.bankApi.dto.CustomerBankingInput;
//import com.io.rest.bankApi.entity.Customer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.item.ItemProcessor;
//
//
//public class BankingDataProcessor implements ItemProcessor<CustomerBankingInput, Customer> {
//
//    private static final Logger log = LoggerFactory.getLogger(BankingDataProcessor.class);
//
//    @Override
//    public Customer process(final CustomerBankingInput customerBankingInput) throws Exception {
//       Customer customer = new Customer();
//       customer.setCustomerId(customerBankingInput.getCustomerId());
//       customer.setAge(customerBankingInput.getAge());
//       customer.setBalance(customerBankingInput.getBalance());
//       customer.setGender(customerBankingInput.getGender());
//       customer.setCardType(customerBankingInput.getCardType());
//       customer.setGender(customerBankingInput.getGender());
//       customer.setSurname(customerBankingInput.getSurname());
//       customer.setGeography(customerBankingInput.getGeography());
//       customer.setCreditScore(customerBankingInput.getCreditScore());
//       customer.setHasCrCard(customerBankingInput.getHasCrCard());
//       customer.setTenure(customerBankingInput.getTenure());
//       customer.setPoints(customerBankingInput.getPoints());
//       customer.setSalary(customerBankingInput.getSalary());
//       customer.setSatisfactionScore(customerBankingInput.getSatisfactionScore());
//
//       return customer;
//
//    }
//
//}
