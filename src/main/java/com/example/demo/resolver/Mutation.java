package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Long id, String name, String lastName){
        return customerRepository.save(new Customer(id,name,lastName));
    }


    public String deleteCustomer(Long id){
        customerRepository.deleteById(id);
        return "Customer deleted";
    }
}