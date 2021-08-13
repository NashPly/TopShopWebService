package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

import static java.lang.Integer.valueOf;

@Entity
public class Profile implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String name;

    public Profile(){}

    public Profile(String id){
        this.id = valueOf(id);
    }

    public Profile(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
