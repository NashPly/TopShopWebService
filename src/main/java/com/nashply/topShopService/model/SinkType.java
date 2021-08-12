package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SinkType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String sink_type;

    public SinkType(Integer id, String sink_type) {
        this.id = id;
        this.sink_type = sink_type;
    }

    public SinkType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSink_type() {
        return sink_type;
    }

    public void setSink_type(String sink_type) {
        this.sink_type = sink_type;
    }
}
