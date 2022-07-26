package com.company.trainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name= "train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="train_id")
    private int id;

    private String name;

    private String model;

    private String manufacturer;

    private String year;

    @Column(name ="total_seats")
    private int totalSeats;

    @Column(name ="seat_layout")
    private String seatLayout;

    @Column(name ="power_type")
    private String powerType;

    public Train() {
    }

    public Train(String name, String model, String manufacturer, String year, int totalSeats, String seatLayout, String powerType) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
        this.powerType = powerType;
    }

    public Train(int id, String name, String model, String manufacturer, String year, int totalSeats, String seatLayout, String powerType) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
        this.powerType = powerType;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getSeatLayout() {
        return seatLayout;
    }

    public void setSeatLayout(String seatLayout) {
        this.seatLayout = seatLayout;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return id == train.id && totalSeats == train.totalSeats && Objects.equals(name, train.name) && Objects.equals(model, train.model) && Objects.equals(manufacturer, train.manufacturer) && Objects.equals(year, train.year) && Objects.equals(seatLayout, train.seatLayout) && Objects.equals(powerType, train.powerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, manufacturer, year, totalSeats, seatLayout, powerType);
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", totalSeats=" + totalSeats +
                ", seatLayout='" + seatLayout + '\'' +
                ", powerType='" + powerType + '\'' +
                '}';
    }
}
