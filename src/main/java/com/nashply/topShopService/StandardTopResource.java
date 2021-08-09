package com.nashply.topShopService;

import com.nashply.topShopService.Service.StandardTopService;
import com.nashply.topShopService.model.StandardTop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class StandardTopResource {

    private final StandardTopService standardTopService;

    public StandardTopResource(StandardTopService standardTopService) {
        this.standardTopService = standardTopService;
    }

    @GetMapping //Template of getting info
    public ResponseEntity<List<StandardTop>> getAllSTops(){
        List<StandardTop> sTops = standardTopService.findAllStandardTops();
        return new ResponseEntity<>(sTops, HttpStatus.OK);
    }

    @GetMapping("/{id}") //Template of getting info
    //TODO If I want to pass something in I do ... {id}
    public ResponseEntity<StandardTop> getAllSTopsById(@PathVariable("id") Integer id){
        StandardTop sTop = standardTopService.findAllStandardTopsById(id);
        return new ResponseEntity<>(sTop, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<StandardTop> addStandardTop(@RequestBody StandardTop standardTop){
        StandardTop newStandardTop =  standardTopService.addSTop(standardTop);
        return new ResponseEntity<>(newStandardTop, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<StandardTop> updateStandardTop(@RequestBody StandardTop standardTop){
        StandardTop updateStandardTop =  standardTopService.updateSTop(standardTop);
        return new ResponseEntity<>(updateStandardTop, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStandardTop(@PathVariable("id") Integer id){
        standardTopService.deleteSTop(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
