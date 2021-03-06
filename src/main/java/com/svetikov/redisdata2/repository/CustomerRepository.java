package com.svetikov.redisdata2.repository;


import com.svetikov.redisdata2.model.Customer;

import java.util.Map;

public interface CustomerRepository {

    void save(Customer customer);
    Customer find(Long id);
    Map<Long,Customer> findAll();
    void update(Customer customer);
    void delete(Long id);
}
