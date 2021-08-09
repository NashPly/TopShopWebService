package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.StandardTop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StandardTopRepo extends JpaRepository<StandardTop, Integer> {
    void deleteStandardTopById(Integer id);

    Optional<StandardTop> findStandardTopById(Integer id);
}
