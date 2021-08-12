package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.model.Orders;
import com.nashply.topShopService.service.OrderListService;
import com.nashply.topShopService.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderResource {

    private final OrderService orderService;

    public OrderResource(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/getOrders")
    public ResponseEntity<List<Orders>> getAllOrders(){
        List<Orders> returnedOrder = orderService.findAllOrders();
        return new ResponseEntity<>(returnedOrder, HttpStatus.OK);
    }

    @GetMapping("/blankOrder")
    public ResponseEntity<Orders> getBlankOrder(){
        Orders returnedOrder = orderService.getBlankOrder();
        return new ResponseEntity<>(returnedOrder, HttpStatus.OK);
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<Orders> getOrderListById(@PathVariable("id") Integer id){
        Orders order = orderService.findOrdersById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Orders> saveOrder(@RequestBody Orders order){
        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Orders> updateOrderList(@RequestBody Orders order){
        orderService.updateOrder(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
