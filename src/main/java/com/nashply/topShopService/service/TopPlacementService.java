package com.nashply.topShopService.service;

import com.nashply.topShopService.model.TopPlacement;
import com.nashply.topShopService.repo.TopPlacementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopPlacementService {
    private final TopPlacementRepo topPlacementRepo;

    @Autowired
    public TopPlacementService(TopPlacementRepo topPlacementRepo){ this.topPlacementRepo = topPlacementRepo;}

    public TopPlacement getTopPlacementById(Integer id){
        return topPlacementRepo.findTopPlacementById(id);
    }
}
