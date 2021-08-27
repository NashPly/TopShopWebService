package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.SinkType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinkTypeRepo extends JpaRepository<SinkType, Integer> {
    SinkType findSinkTypeById(Integer id);
}
