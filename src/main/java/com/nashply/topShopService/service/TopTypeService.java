package com.nashply.topShopService.service;

import com.nashply.topShopService.model.TopType;
import com.nashply.topShopService.repo.TopTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopTypeService {
    private final TopTypeRepo topTypeRepo;

    @Autowired
    public TopTypeService(TopTypeRepo topTypeRepo){
        this.topTypeRepo = topTypeRepo;
    }

    public TopType getTopTypeById(Integer id){
        return topTypeRepo.findTopTypeById(id);
    }
}
