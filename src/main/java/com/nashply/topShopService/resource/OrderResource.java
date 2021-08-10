package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class OrderResource {

    private final OrderService orderService;

    public OrderResource(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/newOrder")
    public ResponseEntity<OrderList> newOrder(){
        OrderList order = orderService.newOrder();
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<OrderList> getOrderById(@PathVariable("id") Integer id){
        OrderList order = orderService.findOrderListById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping("/save/{id}")
    public ResponseEntity<OrderList> updateStandardTop(@RequestBody OrderList orderList){
        OrderList updateOrderList =  orderService.saveOrder(orderList);
        return new ResponseEntity<>(updateOrderList, HttpStatus.OK);
    }
}
