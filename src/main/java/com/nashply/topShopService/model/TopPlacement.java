package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

import static java.lang.Integer.valueOf;

@Entity
public class TopPlacement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String placement;

    public TopPlacement(Integer id, String placement) {
        this.id = id;
        this.placement = placement;
    }

    public TopPlacement(String id){
        this.id = valueOf(id);
    }

    public TopPlacement(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }
}
