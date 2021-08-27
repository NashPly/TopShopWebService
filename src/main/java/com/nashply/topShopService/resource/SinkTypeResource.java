package com.nashply.topShopService.resource;

import com.nashply.topShopService.model.SinkType;
import com.nashply.topShopService.service.SinkTypeService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sink")
public class SinkTypeResource {

    private final SinkTypeService sinkTypeService;

    public SinkTypeResource(SinkTypeService sinkTypeService){
        this.sinkTypeService = sinkTypeService;
    }

    @GetMapping("/getSinkTypes")
    public ResponseEntity<List<SinkType>> getSinkTypes(){
        List<SinkType> sinkType1 = sinkTypeService.getSinkTypes();
        return new ResponseEntity<>(sinkType1,HttpStatus.OK);
    }
}
