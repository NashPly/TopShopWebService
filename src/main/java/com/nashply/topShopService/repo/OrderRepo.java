package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderList, Integer> {

}
