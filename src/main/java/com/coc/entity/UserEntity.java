package com.coc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Name:UserEntity
 * Description:
 * Author:yangxiaocui
 * Time: 2018/5/30 16:35
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id",length = 11)
    private Long id;

    @Column(name="t_name",length = 30)
    private String name;

    @Column(name = "t_age",length = 10)
    private int age;

    @Column(name = "t_address",length = 100)
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
