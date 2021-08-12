package com.nashply.topShopService.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String cust_name;
    private String phone_number;
    private String order_date;
    private String job_name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Profile profile;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Finish finish;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Color color;

    public Orders(Finish finish,Profile profile,Integer id, String cust_name, String phone, String order_date, String job_name) {

        this.id = id;
        this.cust_name = cust_name;
        this.phone_number = phone;
        this.order_date = order_date;
        this.job_name = job_name;
    }

    public Orders(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getPhone() {
        return phone_number;
    }

    public void setPhone(String phone) {
        this.phone_number = phone;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Finish getFinish() {
        return finish;
    }

    public void setFinish(Finish finish) {
        this.finish = finish;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
