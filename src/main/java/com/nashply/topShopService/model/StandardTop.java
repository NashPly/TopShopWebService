package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //make sure this class is mapped to any database configured on the class path
public class StandardTop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;
    private String length;
    private String depth;
    private String lCap;
    private String rCap;
    private String sinkType;
    private double sinkMeas;
    private String sinkSide;

    public StandardTop() {}

    public StandardTop(String length, String depth, String lCap, String rCap, String sinkType, double sinkMeas, String sinkSide){
        this.length = length;
        this.depth = depth;
        this.lCap = lCap;
        this.rCap = rCap;
        this.sinkType = sinkType;
        this.sinkMeas = sinkMeas;
        this.sinkSide = sinkSide;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getlCap() {
        return lCap;
    }

    public void setlCap(String lCap) {
        this.lCap = lCap;
    }

    public String getrCap() {
        return rCap;
    }

    public void setrCap(String rCap) {
        this.rCap = rCap;
    }

    public String getSinkType() {
        return sinkType;
    }

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    public double getSinkMeas() {
        return sinkMeas;
    }

    public void setSinkMeas(double sinkMeas) {
        this.sinkMeas = sinkMeas;
    }

    public String getSinkSide() {
        return sinkSide;
    }

    public void setSinkSide(String sinkSide) {
        this.sinkSide = sinkSide;
    }
}
