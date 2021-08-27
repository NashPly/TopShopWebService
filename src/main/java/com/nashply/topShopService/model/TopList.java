package com.nashply.topShopService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TopList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Enter strategy to be specific
    @Column(nullable = false, updatable = false)// nullable false & updatable means the field cannoth be editted
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Arrangement arrangement;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Orders order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private TopList topList;

    public TopList(Integer id) {
        this.id = id;
    }

    public TopList(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Arrangement getArrangement() {
        return arrangement;
    }

    public void setArrangement(Arrangement arrangement) {
        this.arrangement = arrangement;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public TopList getTopList() {
        return topList;
    }

    public void setTopList(TopList topList) {
        this.topList = topList;
    }
}
