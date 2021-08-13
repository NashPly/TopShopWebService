package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

import static java.lang.Integer.valueOf;

@Entity
public class Color implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String name;

    public Color(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Color(String id){
        this.id = valueOf(id);
    }

    public Color(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
