package com.nashply.topShopService.service;

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

    public List<OrderList> newOrder(){
        List<OrderList> orderList = new ArrayList<>();
        orderList.add(new OrderList("Standard Kitchen", "Standard", 1));
        orderList.add(new OrderList("Standard Vanity", "Standard", 0));
        orderList.add(new OrderList("Right L Corner","Point_Right_L_Corner", 0));
        orderList.add(new OrderList("Left L Corner", "Point_Left_L_Corner", 0));
        orderList.add(new OrderList("U Shaped", "U_Shaped_Legs", 0));

        return this.orderRepo.saveAll(orderList);
    }
}
