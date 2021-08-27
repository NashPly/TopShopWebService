package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.TopPlacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopPlacementRepo extends JpaRepository<TopPlacement, Integer> {
    TopPlacement findTopPlacementById(Integer id);
}
