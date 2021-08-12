package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.service.OrderListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/list")
public class OrderListResource {

    private final OrderListService orderListService;

    public OrderListResource(OrderListService orderListService){
        this.orderListService = orderListService;
    }

    @GetMapping("/newOrder")
    public ResponseEntity<OrderList> newOrderList(){
        OrderList orderList = orderListService.newOrder();
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<OrderList> getOrderListById(@PathVariable("id") Integer id){
        OrderList orderList = orderListService.findOrderListById(id);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PutMapping("/save/")
    public ResponseEntity<Integer> updateOrderList(@RequestBody OrderList orderList){
        OrderList updateOrderList =  orderListService.saveOrder(orderList);
        return new ResponseEntity<>(updateOrderList.getId(), HttpStatus.OK);
    }
}
