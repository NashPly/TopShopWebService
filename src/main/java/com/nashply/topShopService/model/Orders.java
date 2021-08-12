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
    private String email_addr;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Profile profile;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Finish finish;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Color color;

    public Orders(String cust_name, String phone_number, String order_date,
                  String job_name, String email_addr, Profile profile,
                  Finish finish, Color color) {

        this.cust_name = cust_name;
        this.phone_number = phone_number;
        this.order_date = order_date;
        this.job_name = job_name;
        this.email_addr = email_addr;
        this.profile = profile;
        this.finish = finish;
        this.color = color;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_addr() {
        return email_addr;
    }

    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }
}
