package com.nashply.topShopService.service;

import com.nashply.topShopService.model.SinkType;
import com.nashply.topShopService.model.TopPlacement;
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
                top.getlSide(),
                top.getrSide(),
                top.isHasSink(),
                this.topPlacementRepo.findTopPlacementById(top.getTopPlacement().getId()),
                this.sinkTypeRepo.findSinkTypeById(top.getSinkType().getId()),
                null,null);
        return this.topsRepo.save(tops);
    }

    public Tops getNewTop(Integer placement, Integer type, Integer sinkType){
        Tops top = new Tops(this.topTypeRepo.findTopTypeById(type),
                "Raw","Raw",
                false,
                this.topPlacementRepo.findTopPlacementById(placement),
                this.sinkTypeRepo.findSinkTypeById(sinkType),
                null,null);
        return top;
    }
}
