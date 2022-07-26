package com.company.trainreservation.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="station_id")
    private int id;

    private String name;

    @Column(name ="station_code")
    private String code;

    public Station() {
    }

    public Station(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return id == station.id && Objects.equals(name, station.name) && Objects.equals(code, station.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
