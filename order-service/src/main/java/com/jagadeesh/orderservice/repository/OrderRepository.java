package com.jagadeesh.orderservice.repository;

import com.jagadeesh.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
