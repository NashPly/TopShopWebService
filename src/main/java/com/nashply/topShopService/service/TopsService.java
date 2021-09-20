package com.nashply.topShopService.service;

import com.nashply.topShopService.exception.TopNotFoundException;
import com.nashply.topShopService.model.Tops;
import com.nashply.topShopService.repo.SinkTypeRepo;
import com.nashply.topShopService.repo.TopPlacementRepo;
import com.nashply.topShopService.repo.TopTypeRepo;
import com.nashply.topShopService.repo.TopsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopsService {
    private final TopsRepo topsRepo;

    private final TopTypeRepo topTypeRepo;

    private final TopPlacementRepo topPlacementRepo;

    private final SinkTypeRepo sinkTypeRepo;

    @Autowired
    public TopsService(TopsRepo topsRepo, TopTypeRepo topTypeRepo,
                       TopPlacementRepo topPlacementRepo, SinkTypeRepo sinkTypeRepo){
        this.topsRepo = topsRepo;
        this.topTypeRepo = topTypeRepo;
        this.topPlacementRepo = topPlacementRepo;
        this.sinkTypeRepo = sinkTypeRepo;
    }

    public Tops saveTop(Tops top){
        Tops tops = new Tops(top.getId(),this.topTypeRepo.findTopTypeById(top.getTopType().getId()),
                top.getLength(),
                top.getDepth(),
                top.getlSide(),
                top.getrSide(),
                top.isHasSink(),
                this.topPlacementRepo.findTopPlacementById(top.getTopPlacement().getId()),
                this.sinkTypeRepo.findSinkTypeById(top.getSinkType().getId()),
                top.getSinkMeasurement(),top.getSinkSide());
        return this.topsRepo.save(tops);
    }

    public Tops getNewTop(Integer placement, Integer type, Integer sinkType){
        Tops top = new Tops(this.topTypeRepo.findTopTypeById(type),"0","0",
                "Raw","Raw",
                false,
                this.topPlacementRepo.findTopPlacementById(placement),
                this.sinkTypeRepo.findSinkTypeById(sinkType),
                null,null);
        return top;
    }

    public Tops getTopById(Integer id){
        return topsRepo.findById(id)
                .orElseThrow(() -> new TopNotFoundException("Top by id: " + id + " was not found"));
        }
    }

