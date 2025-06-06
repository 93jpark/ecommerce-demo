package com.example.service;

import com.example.dto.OrderDto;
import com.example.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDetails);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);

}
