package com.mpd.hotel_system.hotel_management_service_api.repository;

import com.mpd.hotel_system.hotel_management_service_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,String> {
}
