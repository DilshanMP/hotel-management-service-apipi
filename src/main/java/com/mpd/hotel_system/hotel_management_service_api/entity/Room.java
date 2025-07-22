package com.mpd.hotel_system.hotel_management_service_api.entity;

import com.mpd.hotel_system.hotel_management_service_api.utill.enums.RoomType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id",length = 80)
    private String roomId;
    @Column(name = "room_number",nullable = false)
    private String roomNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "room_type",nullable = false)
    private RoomType roomType;
    @Column(name = "bed_count",nullable = false)
    private int bedCount;
    @Column(name = "price",nullable = false)
    private BigDecimal price;
    @Column(name = "is_available",nullable = false)
    private Boolean isAvailable;
    @ManyToOne()
    @JoinColumn(name = "branch_id")
    private Branch branch;
    @OneToMany(mappedBy = "room")
    private List<Facilities> facilities;
    @OneToMany(mappedBy = "room")
    private List<RoomImages> roomImages;



}
