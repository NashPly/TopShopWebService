package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    private String p_name;

    public Profile(){}

    public Profile(Integer id, String p_name) {
        this.id = id;
        this.p_name = p_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
}
