package com.retro.visionarycrofting.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "fournissour")
public class Fournissour implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
//    @OneToMany(mappedBy = "", fetch = FetchType.LAZY)
//    private List<CallForProposal> appelOffres;

    public Fournissour() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public List<CallForProposal> getAppelOffres() {
//        return appelOffres;
//    }
//
//    public void setAppelOffres(List<CallForProposal> appelOffres) {
//        this.appelOffres = appelOffres;
//    }

    @Override
    public String toString() {
        return "Fournissour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
//                ", appelOffres=" + appelOffres +
                '}';
    }
}
