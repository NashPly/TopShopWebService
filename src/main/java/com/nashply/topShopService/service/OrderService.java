package com.nashply.topShopService.service;

import com.nashply.topShopService.exception.TopNotFoundException;
import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public OrderList saveOrder(OrderList orderList){
        return this.orderRepo.save(orderList);
    }

    public OrderList newOrder(){
        OrderList order  = new OrderList(0,0,0,0,
                0,0);
        return this.orderRepo.save(order);
    }

    public OrderList findOrderListById(Integer id){
        return orderRepo.findOrderListById(id)
                .orElseThrow(() -> new TopNotFoundException("Order by id" + id + " was not found"));
    }
}
