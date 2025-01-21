package com.javaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.course.entities.OrderItem;
import com.javaweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
