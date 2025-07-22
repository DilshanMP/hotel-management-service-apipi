package com.mpd.hotel_system.hotel_management_service_api.service.impl;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.FacilityPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto dto) {

    }

    @Override
    public void update(RequestFacilityDto dto, String facilitiesId) {

    }

    @Override
    public void delete(String facilitiesId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilitiesId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findByBranchId(int page, int size, String roomId) {
        return null;
    }
}
