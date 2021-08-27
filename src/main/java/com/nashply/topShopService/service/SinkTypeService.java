package com.nashply.topShopService.service;

import com.nashply.topShopService.model.SinkType;
import com.nashply.topShopService.repo.SinkTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinkTypeService {
    private final SinkTypeRepo sinkTypeRepo;

    @Autowired
    public SinkTypeService(SinkTypeRepo sinkTypeRepo){
        this.sinkTypeRepo = sinkTypeRepo;}

    public SinkType getSinkTypeById(Integer id){
        return sinkTypeRepo.findSinkTypeById(id);
    }

    public List<SinkType> getSinkTypes(){
        return sinkTypeRepo.findAll();
    }
}
