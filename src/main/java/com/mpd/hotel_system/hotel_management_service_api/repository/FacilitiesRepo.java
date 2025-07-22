package com.mpd.hotel_system.hotel_management_service_api.repository;

import com.mpd.hotel_system.hotel_management_service_api.entity.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilitiesRepo extends JpaRepository<Facilities, Long> {
}
