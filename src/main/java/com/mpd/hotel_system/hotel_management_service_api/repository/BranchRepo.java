package com.mpd.hotel_system.hotel_management_service_api.repository;

import com.mpd.hotel_system.hotel_management_service_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, String> {
}
