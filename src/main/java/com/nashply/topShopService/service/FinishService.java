package com.nashply.topShopService.service;

import com.nashply.topShopService.model.Finish;
import com.nashply.topShopService.repo.FinishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinishService {

    private final FinishRepo finishRepo;

    @Autowired
    public FinishService(FinishRepo finishRepo){this.finishRepo = finishRepo;}

    public List<Finish> getAllFinishes() {
        return finishRepo.findAll();
    }

}
