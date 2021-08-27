package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

import static java.lang.Integer.valueOf;

@Entity
public class TopType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String type_name;
    @Column(nullable = false, updatable = false)
    private boolean hasBacksplash;

    public TopType(Integer id, String type_name, boolean hasBacksplash) {
        this.id = id;
        this.type_name = type_name;
        this.hasBacksplash = hasBacksplash;
    }

    public TopType(String id){
        this.id = valueOf(id);
    }

    public TopType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public boolean isHasBacksplash() {
        return hasBacksplash;
    }

    public void setHasBacksplash(boolean hasBacksplash) {
        this.hasBacksplash = hasBacksplash;
    }
}
