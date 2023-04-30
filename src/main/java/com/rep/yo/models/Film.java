package com.rep.yo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "year")
    private Integer year;

    public Film() {}

    public Film(String name, String country, Integer year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String name) {
        this.country = country;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
