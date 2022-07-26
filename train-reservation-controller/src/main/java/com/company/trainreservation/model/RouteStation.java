package com.company.trainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name= "route_station")
public class RouteStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="route_station_id")
    private int id;

    @Column(name ="route_id")
    private int routeId;

    @Column(name ="station_id")
    private int stationId;

    @Column(name ="scheduled_arrival")
    private String scheduledArrival;

    @Column(name ="scheduled_departure")
    private String scheduledDeparture;

    public RouteStation() {
    }

    public RouteStation(int routeId, int stationId, String scheduledArrival, String scheduledDeparture) {
        this.routeId = routeId;
        this.stationId = stationId;
        this.scheduledArrival = scheduledArrival;
        this.scheduledDeparture = scheduledDeparture;
    }

    public RouteStation(int id, int routeId, int stationId, String scheduledArrival, String scheduledDeparture) {
        this.id = id;
        this.routeId = routeId;
        this.stationId = stationId;
        this.scheduledArrival = scheduledArrival;
        this.scheduledDeparture = scheduledDeparture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteStation that = (RouteStation) o;
        return id == that.id && routeId == that.routeId && stationId == that.stationId && Objects.equals(scheduledArrival, that.scheduledArrival) && Objects.equals(scheduledDeparture, that.scheduledDeparture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, routeId, stationId, scheduledArrival, scheduledDeparture);
    }

    @Override
    public String toString() {
        return "RouteStation{" +
                "id=" + id +
                ", routeId=" + routeId +
                ", stationId=" + stationId +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                '}';
    }
}
