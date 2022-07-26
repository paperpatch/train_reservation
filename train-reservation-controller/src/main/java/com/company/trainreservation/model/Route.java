package com.company.trainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name= "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="route_id")
    private int id;

    @Column(name ="route_name")
    private String routeName;

    @Column(name ="train_id")
    private int trainId;

    @Column(name ="source_station_id")
    private int sourceStationId;

    @Column(name ="destination_station_id")
    private int destinationStationId;

    public Route() {
    }

    public Route(String routeName, int trainId, int sourceStationId, int destinationStationId) {
        this.routeName = routeName;
        this.trainId = trainId;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }

    public Route(int id, String routeName, int trainId, int sourceStationId, int destinationStationId) {
        this.id = id;
        this.routeName = routeName;
        this.trainId = trainId;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getSourceStationId() {
        return sourceStationId;
    }

    public void setSourceStationId(int sourceStationId) {
        this.sourceStationId = sourceStationId;
    }

    public int getDestinationStationId() {
        return destinationStationId;
    }

    public void setDestinationStationId(int destinationStationId) {
        this.destinationStationId = destinationStationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return id == route.id && trainId == route.trainId && sourceStationId == route.sourceStationId && destinationStationId == route.destinationStationId && Objects.equals(routeName, route.routeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, routeName, trainId, sourceStationId, destinationStationId);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", trainId=" + trainId +
                ", sourceStationId=" + sourceStationId +
                ", destinationStationId=" + destinationStationId +
                '}';
    }
}
