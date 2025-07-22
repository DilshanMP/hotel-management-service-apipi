package com.mpd.hotel_system.hotel_management_service_api.service.impl;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.BranchPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
