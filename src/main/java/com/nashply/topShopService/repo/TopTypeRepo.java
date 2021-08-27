package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.TopType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopTypeRepo extends JpaRepository<TopType, Integer> {
    TopType findTopTypeById(Integer id);
}
