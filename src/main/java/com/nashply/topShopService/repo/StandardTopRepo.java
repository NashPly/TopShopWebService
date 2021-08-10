package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.StandardTop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StandardTopRepo extends JpaRepository<StandardTop, Integer> {

    //My functions that use method name queries
    //(jpa or spring figures out what you're trying to do based on the method name)
    void deleteStandardTopById(Integer id);

    //Might return a Standard Top - it might not
    Optional<StandardTop> findStandardTopById(Integer id);
}
