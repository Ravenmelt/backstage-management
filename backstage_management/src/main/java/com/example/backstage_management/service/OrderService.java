package com.example.backstage_management.service;

import com.example.backstage_management.domain.Order;
import com.example.backstage_management.persistence.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public List<Order> getOrderList(){
        return orderMapper.getOrderList();
    }

    public Order getOrder(String id){
        return orderMapper.getOrder(id);
    }

    public void updateOrder(Order order){
        orderMapper.updateOrder(order);
    }

    public void deleteOrder(String id){
        orderMapper.deleteOrder(id);
    }


    public void updateStatusByOrderid(String orderId, String p) {
        if (p.equals("UP")){
            orderMapper.swapStatusToUP(orderId);
        }
        else if(p.equals("P")){
            orderMapper.swapStatusToP(orderId);
        }
    }
}
