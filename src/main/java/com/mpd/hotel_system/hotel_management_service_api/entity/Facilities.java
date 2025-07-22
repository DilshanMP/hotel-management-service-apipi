package com.mpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facilities ")
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @Column(name = "name",length = 80 ,nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
