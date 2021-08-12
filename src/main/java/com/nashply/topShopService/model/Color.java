package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Color implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String name;

    public Color(Integer color_id, String name) {
        this.id = color_id;
        this.name = name;
    }

    public Color(){}

    public Integer getColor_id() {
        return id;
    }

    public void setColor_id(Integer color_id) {
        this.id = color_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
