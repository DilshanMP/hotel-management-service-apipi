package com.mpd.hotel_system.hotel_management_service_api.repository;

import com.mpd.hotel_system.hotel_management_service_api.entity.RoomImages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomImageRepo extends JpaRepository<RoomImages, Long> {
}
