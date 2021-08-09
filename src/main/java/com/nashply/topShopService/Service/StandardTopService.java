package com.nashply.topShopService.Service;
import com.nashply.topShopService.exception.TopNotFoundException;

import com.nashply.topShopService.model.StandardTop;
import com.nashply.topShopService.repo.StandardTopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardTopService {
    private final StandardTopRepo standardTopRepo;

    @Autowired //Brings in its dependencies
    public StandardTopService(StandardTopRepo standardTopRepo) {
        this.standardTopRepo = standardTopRepo;
    }

    public StandardTop addSTop(StandardTop sTop){
        return this.standardTopRepo.save(sTop);
    }

    public List<StandardTop> findAllStandardTops(){
        return standardTopRepo.findAll();
    }

    public StandardTop updateSTop(StandardTop standardTop){
        return standardTopRepo.save(standardTop);
    }

    public StandardTop findAllStandardTopsById(Integer id){
        return standardTopRepo.findStandardTopById(id)
                .orElseThrow(() -> new TopNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteSTop (Integer id){
        standardTopRepo.deleteStandardTopById(id);
    }

}
