package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.Finish;
import com.nashply.topShopService.service.FinishService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class FinishResource {

    private final FinishService finishService;

    public FinishResource(FinishService finishService){this.finishService = finishService;}

    @GetMapping("getFinishes")
    public ResponseEntity<List<Finish>> getProfiles(){
        List<Finish> finishes = finishService.getAllFinishes();
        return new ResponseEntity<>(finishes, HttpStatus.OK);
    }
}
