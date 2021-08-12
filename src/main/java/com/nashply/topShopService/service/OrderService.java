package com.nashply.topShopService.service;

import com.nashply.topShopService.exception.TopNotFoundException;
import com.nashply.topShopService.model.Orders;
import com.nashply.topShopService.model.StandardTop;
import com.nashply.topShopService.repo.OrderRepo;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public Orders addOrder(Orders orders){
        return this.orderRepo.save(orders);
    }

    public void saveOrder(Orders orders){
        orderRepo.save(orders);

    }
    public void updateOrder(Orders order){
        Orders myOrders = orderRepo.findOrdersById(order.getId());
        myOrders = order;
        orderRepo.save(myOrders);
    }

    public List<Orders> findAllOrders(){return orderRepo.findAll();}

    public Orders findOrdersById(Integer id){
        return orderRepo.findOrdersById(id);
                //.orElseThrow(() -> new TopNotFoundException("Order by id:" + id + " was not found"));
    }
}
