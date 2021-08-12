package com.nashply.topShopService.service;

import com.nashply.topShopService.model.Profile;
import com.nashply.topShopService.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private final ProfileRepo profileRepo;

    @Autowired
    public ProfileService(ProfileRepo profileRepo) {this.profileRepo = profileRepo;}

    public Profile saveProfile(Profile profile){
        return profileRepo.save(profile);
    }

    public List<Profile> getAllProfiles() {
        return profileRepo.findAll();
    }


}
