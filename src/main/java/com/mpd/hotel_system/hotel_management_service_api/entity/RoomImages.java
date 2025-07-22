package com.mpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room_images")
public class RoomImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private FileFormatter fileFormatter;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
