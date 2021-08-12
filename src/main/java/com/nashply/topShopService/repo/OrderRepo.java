package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.Orders;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Integer> {
//
//        Optional<Orders> findOrdersById(Integer id);
//
        Orders findOrdersById(Integer id);

}
