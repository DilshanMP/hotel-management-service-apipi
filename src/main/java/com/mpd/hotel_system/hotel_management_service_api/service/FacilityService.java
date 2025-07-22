package com.mpd.hotel_system.hotel_management_service_api.service;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.FacilityPaginateResponseDto;
import org.springframework.stereotype.Service;


public interface FacilityService {
    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto dto , String facilitiesId);
    public void delete(String  facilitiesId);
    public ResponseFacilityDto findById(String  facilitiesId);
    public FacilityPaginateResponseDto findByBranchId(int page , int size, String roomId);


}
