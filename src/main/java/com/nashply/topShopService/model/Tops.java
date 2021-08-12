package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tops implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private TopType topType;
    private String length;
    private String lSide;
    private String RSide;
    private boolean hasSink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private TopPlacement topPlacement;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private SinkType sinkType;

    private String sinkMeasurement;
    private String sinkSide;

    public Tops(Integer id, String length, String lSide, String RSide, boolean hasSink, String sinkMeasurement, String sinkSide) {
        this.id = id;
        this.length = length;
        this.lSide = lSide;
        this.RSide = RSide;
        this.hasSink = hasSink;
        this.sinkMeasurement = sinkMeasurement;
        this.sinkSide = sinkSide;
    }

    public Tops(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getlSide() {
        return lSide;
    }

    public void setlSide(String lSide) {
        this.lSide = lSide;
    }

    public String getRSide() {
        return RSide;
    }

    public void setRSide(String RSide) {
        this.RSide = RSide;
    }

    public boolean isHasSink() {
        return hasSink;
    }

    public void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    public String getSinkMeasurement() {
        return sinkMeasurement;
    }

    public void setSinkMeasurement(String sinkMeasurement) {
        this.sinkMeasurement = sinkMeasurement;
    }

    public String getSinkSide() {
        return sinkSide;
    }

    public void setSinkSide(String sinkSide) {
        this.sinkSide = sinkSide;
    }
}
