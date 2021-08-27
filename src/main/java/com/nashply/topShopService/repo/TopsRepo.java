package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.Tops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopsRepo extends JpaRepository<Tops, Integer> {
}
