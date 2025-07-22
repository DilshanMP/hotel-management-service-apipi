package com.mpd.hotel_system.hotel_management_service_api.service.impl;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.RoomImagePaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.service.RoomImageService;

public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto dto) {

    }

    @Override
    public void update(RequestRoomImageDto dto, String imageId) {

    }

    @Override
    public void delete(String imageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
