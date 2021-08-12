package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Finish implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    private String name;

    public Finish(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Finish(){}

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
