package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private Integer kitchenTop;
    private Integer vanityTop;
    private Integer barTop;
    private Integer rightLCorner;
    private Integer leftLCorner;
    private Integer uShaped;

    public OrderList(){}

    public OrderList(Integer kitchenTop, Integer vanityTop,
                     Integer barTop, Integer rightLCorner,
                     Integer leftLCorner, Integer uShaped) {
        this.id = id;
        this.kitchenTop = kitchenTop;
        this.vanityTop = vanityTop;
        this.barTop = barTop;
        this.rightLCorner = rightLCorner;
        this.leftLCorner = leftLCorner;
        this.uShaped = uShaped;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKitchenTop() {
        return kitchenTop;
    }

    public void setKitchenTop(Integer kitchenTop) {
        this.kitchenTop = kitchenTop;
    }

    public Integer getVanityTop() {
        return vanityTop;
    }

    public void setVanityTop(Integer vanityTop) {
        this.vanityTop = vanityTop;
    }

    public Integer getBarTop() {
        return barTop;
    }

    public void setBarTop(Integer barTop) {
        this.barTop = barTop;
    }

    public Integer getRightLCorner() {
        return rightLCorner;
    }

    public void setRightLCorner(Integer rightLCorner) {
        this.rightLCorner = rightLCorner;
    }

    public Integer getLeftLCorner() {
        return leftLCorner;
    }

    public void setLeftLCorner(Integer leftLCorner) {
        this.leftLCorner = leftLCorner;
    }

    public Integer getuShaped() {
        return uShaped;
    }

    public void setuShaped(Integer uShaped) {
        this.uShaped = uShaped;
    }
}
