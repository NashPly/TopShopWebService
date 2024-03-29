package com.nashply.topShopService.repo;

import com.nashply.topShopService.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepo extends JpaRepository<Profile, Integer> {

    Profile findProfileById(Integer id);
}
