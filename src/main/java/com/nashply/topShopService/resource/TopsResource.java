package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.StandardTop;
import com.nashply.topShopService.model.Tops;
import com.nashply.topShopService.service.TopsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/top")
public class TopsResource {

    private final TopsService topsService;

    public TopsResource(TopsService topsService){
        this.topsService = topsService;
    }

    @GetMapping("/getNewTop")
    public ResponseEntity<Tops> getBlankTop(){
        Tops topss = topsService.getNewTop(1,1,1);
        return new ResponseEntity<>(topss, HttpStatus.OK);
    }

    @GetMapping("/getTopById/{id}")
    public ResponseEntity<Tops> getTopById(@PathVariable("id") Integer id){
        Tops tops = topsService.getTopById(id);
        return new ResponseEntity<>(tops, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Tops> addStandardTop(@RequestBody Tops top){
        Tops topss =  topsService.saveTop(top);
        return new ResponseEntity<>(topss, HttpStatus.CREATED);
    }

}
