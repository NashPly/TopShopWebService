package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.OrderList;
import com.nashply.topShopService.model.Orders;
import com.nashply.topShopService.model.Profile;
import com.nashply.topShopService.service.OrderListService;
import com.nashply.topShopService.service.OrderService;
import com.nashply.topShopService.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ProfileResource {

    private final ProfileService profileService;

    public ProfileResource(ProfileService profileService) {this.profileService = profileService;}

    @GetMapping("getProfiles")
        public ResponseEntity<List<Profile>> getProfiles(){
            List<Profile> profiles = profileService.getAllProfiles();
            return new ResponseEntity<>(profiles, HttpStatus.OK);
        }
    }
