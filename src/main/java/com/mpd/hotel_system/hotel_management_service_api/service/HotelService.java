package com.mpd.hotel_system.hotel_management_service_api.service;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.HotelPaginateResponseDto;
import org.springframework.stereotype.Service;


public interface HotelService {
    public void create(RequestHotelDto dto);
    public void update(RequestHotelDto dto , String hotelId);
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId);
    public HotelPaginateResponseDto findAll(int page, int size , String searchText);
}
