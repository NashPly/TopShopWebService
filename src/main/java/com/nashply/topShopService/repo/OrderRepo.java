package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<OrderList, Integer> {

    Optional<OrderList> findOrderListById(Integer id);
}
