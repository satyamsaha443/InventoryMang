package com.Jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Jwt.models.Orders;

public interface OrderRepository extends MongoRepository<Orders, String> {

}
