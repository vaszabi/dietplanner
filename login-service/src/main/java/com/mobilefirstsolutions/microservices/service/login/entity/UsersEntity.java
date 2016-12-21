package com.mobilefirstsolutions.microservices.service.login.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
public class UsersEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int weight;
    private byte gender;
    private byte age;
    private byte fattening;
    private byte activity;
    private byte goal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<UsersEntity> usersEntityList;

    public UsersEntity(String username, String password, String firstname, String lastname, int weight, byte gender, byte age, byte fattening, byte activity, byte goal) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.fattening = fattening;
        this.activity = activity;
        this.goal = goal;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getFattening() {
        return fattening;
    }

    public void setFattening(byte fattening) {
        this.fattening = fattening;
    }

    public byte getActivity() {
        return activity;
    }

    public void setActivity(byte activity) {
        this.activity = activity;
    }

    public byte getGoal() {
        return goal;
    }

    public void setGoal(byte goal) {
        this.goal = goal;
    }
}

