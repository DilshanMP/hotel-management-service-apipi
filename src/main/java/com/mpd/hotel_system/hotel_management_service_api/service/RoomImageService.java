package com.mpd.hotel_system.hotel_management_service_api.service;


import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;

import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.RoomImagePaginateResponseDto;


public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto , String imageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String roomId);
    public RoomImagePaginateResponseDto findAll(int page, int size , String roomId);
}
