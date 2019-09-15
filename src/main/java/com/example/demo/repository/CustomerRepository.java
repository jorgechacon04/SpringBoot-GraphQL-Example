package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository to store Customer data
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findCustomerByIdIn(List<Long> ids);
}
