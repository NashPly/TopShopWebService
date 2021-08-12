package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ColorRepo extends JpaRepository<Color, Integer> {

    Color findColorById(Integer id);
}
