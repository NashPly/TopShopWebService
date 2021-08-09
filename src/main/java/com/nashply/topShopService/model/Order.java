package com.nashply.topShopService.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Order implements Serializable {
    private String type;
    private String file;
    private Integer quantity;
}
