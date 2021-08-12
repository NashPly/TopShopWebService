package com.nashply.topShopService.service;

import com.nashply.topShopService.model.Color;
import com.nashply.topShopService.model.Finish;
import com.nashply.topShopService.repo.ColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    private final ColorRepo colorRepo;

    @Autowired
    public ColorService(ColorRepo colorRepo){this.colorRepo = colorRepo;}

    public List<Color> getAllColors() { return colorRepo.findAll(); }

    public Color findColorById(Integer id){
        return colorRepo.findColorById(id);
    }

}
