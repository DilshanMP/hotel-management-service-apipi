package com.mpd.hotel_system.hotel_management_service_api.service;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.BranchPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.HotelPaginateResponseDto;
import org.springframework.stereotype.Service;


public interface BranchService {
    public void create(RequestBranchDto dto);
    public void update(RequestBranchDto dto , String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAll(int page, int size , String searchText);
    public BranchPaginateResponseDto findAllHotelId(int page, int size , String hotelId, String searchText);
}
