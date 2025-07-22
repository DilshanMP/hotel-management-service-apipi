package com.mpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "hotel_id",length = 80)
    private String hotelId;

    @Column(name = "hotel_name" ,nullable = false,length = 100)
    private String hotel_name;
    @Column(name = "start_rating" ,nullable = false)
    private int startRating;
    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at" ,nullable = false)
    private LocalDateTime createAt;
    @Column(name = "update_at" ,nullable = false)
    private LocalDateTime updatedAt;
    @Column(name = "active_status" ,nullable = false)
    private boolean activeStatus;
    @Column(name = "starting_from" )
    private BigDecimal startingFrom;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Branch> branches;

}
