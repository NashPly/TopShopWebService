package com.nashply.topShopService.service;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nashply.topShopService.model.Orders;
import com.nashply.topShopService.repo.ColorRepo;
import com.nashply.topShopService.repo.FinishRepo;
import com.nashply.topShopService.repo.OrderRepo;
import com.nashply.topShopService.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    private final ProfileRepo profileRepo;

    private final FinishRepo finishRepo;

    private final ColorRepo colorRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo, ProfileRepo profileRepo, FinishRepo finishRepo, ColorRepo colorRepo){
        this.orderRepo = orderRepo;
        this.profileRepo = profileRepo;
        this.finishRepo = finishRepo;
        this.colorRepo = colorRepo;
    }

        public Orders addOrder(Orders orders){
        return this.orderRepo.save(orders);
    }

    public Orders getBlankOrder(){
        Orders order = new Orders(" ", " ", " ",
                " ", " ",
                profileRepo.findProfileById(1), finishRepo.findFinishById(1), colorRepo.findColorById(1));
        return order;
    }

    public Orders saveOrder(Orders orders) throws IOException {

        Orders newOrder = new Orders(orders.getCust_name(), orders.getPhone_number(),
                orders.getOrder_date() , orders.getJob_name(), orders.getEmail_addr(),
                profileRepo.findProfileById(orders.getProfile().getId()),
                finishRepo.findFinishById(orders.getFinish().getId()),
                colorRepo.findColorById(orders.getColor().getId()));
        return orderRepo.save(newOrder);
    }

    public void updateOrder(Orders order){
        Orders myOrders = orderRepo.findOrdersById(order.getId());
//
//        //TODO only works if there is something in the database
//        //Keeps the name fields from being updated
//        myOrders.setProfile(profileRepo.findProfileById(order.getProfile().getId()));
//        myOrders.setFinish((finishRepo.findFinishById(order.getFinish().getId())));
//        myOrders.setColor(colorRepo.findColorById(order.getColor().getColor_id()));

        myOrders = order;
        orderRepo.save(myOrders);
    }

    public List<Orders> findAllOrders(){return orderRepo.findAll();}

    public Orders findOrdersById(Integer id){
        return orderRepo.findOrdersById(id);
                //.orElseThrow(() -> new TopNotFoundException("Order by id:" + id + " was not found"));
    }
}
