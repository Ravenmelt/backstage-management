package com.example.backstage_management.persistence;

import com.example.backstage_management.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    public List<Order> getOrderList();

    public void updateOrder(Order order);

    public void deleteOrder(String orderId);

    Order getOrder(String id);

    void swapStatusToUP(String id);

    void swapStatusToP(String id);
}
