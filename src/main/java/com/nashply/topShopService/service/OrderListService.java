package com.nashply.topShopService.service;

import com.nashply.topShopService.exception.TopNotFoundException;
import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.repo.OrderListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListService {
    private final OrderListRepo orderListRepo;

    @Autowired
    public OrderListService(OrderListRepo orderListRepo){
        this.orderListRepo = orderListRepo;
    }

    public OrderList saveOrder(OrderList orderList){
        return this.orderListRepo.save(orderList);
    }

    public OrderList newOrder(){
        OrderList order  = new OrderList(0,0,0,0,
                0,0);
        return this.orderListRepo.save(order);
    }

    public OrderList findOrderListById(Integer id){
        return orderListRepo.findOrderListById(id)
                .orElseThrow(() -> new TopNotFoundException("Order by id" + id + " was not found"));
    }
}
