package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

import static java.lang.Integer.valueOf;

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
    private String depth;
    private String lSide;
    private String rSide;
    private boolean hasSink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private TopPlacement topPlacement;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private SinkType sinkType;

    @Column(nullable = true)
    private String sinkMeasurement;
    @Column(nullable = true)
    private String sinkSide;

    public Tops(TopType topType, String lSide, String rSide,
                boolean hasSink, TopPlacement topPlacement, SinkType sinkType,
                String sinkMeasurement, String sinkSide) {
        this.topType = topType;
        this.lSide = lSide;
        this.rSide = rSide;
        this.hasSink = hasSink;
        this.topPlacement = topPlacement;
        this.sinkType = sinkType;
        this.sinkMeasurement = sinkMeasurement;
        this.sinkSide = sinkSide;
    }

    public Tops(Integer id,TopType topType, String length, String lSide, String rSide,
                boolean hasSink, TopPlacement topPlacement, SinkType sinkType,
                String sinkMeasurement, String sinkSide) {
        this.id = id;
        this.topType = topType;
        this.length = length;
        this.lSide = lSide;
        this.rSide = rSide;
        this.hasSink = hasSink;
        this.topPlacement = topPlacement;
        this.sinkType = sinkType;
        this.sinkMeasurement = sinkMeasurement;
        this.sinkSide = sinkSide;
    }

    public Tops(String id){
        this.id = valueOf(id);
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

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getlSide() {
        return lSide;
    }

    public void setlSide(String lSide) {
        this.lSide = lSide;
    }

    public String getrSide() {
        return rSide;
    }

    public void setrSide(String rSide) {
        this.rSide = rSide;
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

    public TopType getTopType() {
        return topType;
    }

    public void setTopType(TopType topType) {
        this.topType = topType;
    }

    public TopPlacement getTopPlacement() {
        return topPlacement;
    }

    public void setTopPlacement(TopPlacement topPlacement) {
        this.topPlacement = topPlacement;
    }

    public SinkType getSinkType() {
        return sinkType;
    }

    public void setSinkType(SinkType sinkType) {
        this.sinkType = sinkType;
    }
}
