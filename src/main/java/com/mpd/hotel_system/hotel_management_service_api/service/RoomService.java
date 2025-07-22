package com.mpd.hotel_system.hotel_management_service_api.service;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.BranchPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.RoomPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.entity.Room;
import org.springframework.stereotype.Service;


public interface RoomService {
    public void create(RequestRoomDto dto);
    public void update(RequestRoomDto dto , String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginateResponseDto findAll(int page, int size);
}
