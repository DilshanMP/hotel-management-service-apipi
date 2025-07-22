package com.mpd.hotel_system.hotel_management_service_api.service;

import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.AddressPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination.BranchPaginateResponseDto;
import com.mpd.hotel_system.hotel_management_service_api.entity.Address;

public interface AddressService {
    public void create(RequestAddressDto dto);
    public void update(RequestAddressDto dto , String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);


}
