package com.Jwt.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jwt.models.Orders;
import com.Jwt.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders createOrder(Orders order) {
        return orderRepository.save(order);
    }

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Orders> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    public Orders updateOrder(String id, Orders orderDetails) {
        Orders order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found for this id :: " + id));
        order.setUserType(orderDetails.getUserType());
        order.setOrderDate(orderDetails.getOrderDate());
        order.setDeliveryDate(orderDetails.getDeliveryDate());
        order.setPerson(orderDetails.getPerson());
        order.setItems(orderDetails.getItems());
        order.setStatus(orderDetails.getStatus());
        return orderRepository.save(order);
    }

    public void deleteOrder(String id) {
        Orders order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found for this id :: " + id));
        orderRepository.delete(order);
    }
}

