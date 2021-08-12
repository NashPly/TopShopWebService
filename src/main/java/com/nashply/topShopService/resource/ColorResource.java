package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.Color;
import com.nashply.topShopService.model.Finish;
import com.nashply.topShopService.service.ColorService;
import com.nashply.topShopService.service.FinishService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class ColorResource {

    private final ColorService colorService;

    public ColorResource(ColorService colorService){this.colorService = colorService;}

    @GetMapping("getColors")
    public ResponseEntity<List<Color>> getProfiles(){
        List<Color> colors = colorService.getAllColors();
        return new ResponseEntity<>(colors, HttpStatus.OK);
    }
}
