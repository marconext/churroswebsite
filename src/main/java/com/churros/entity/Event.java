package com.churros.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="events")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    // Eigener Getter für das Feld "id"
    public Long getId() {
        return this.id;
    }

    // Eigener Getter für das Feld "name"
    public String getName() {
        return this.name;
    }

    // Eigener Getter für das Feld "location"
    public String getLocation() {
        return this.location;
    }

    // Eigener Getter für das Feld "start_date"
    public Date getStartDate() {
        return this.startDate;
    }

    // Eigener Getter für das Feld "end_date"
    public Date getEndDate() {
        return this.endDate;
    }
}