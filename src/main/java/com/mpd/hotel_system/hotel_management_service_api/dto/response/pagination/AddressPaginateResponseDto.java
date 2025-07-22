package com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination;

import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> dataList;
    private long datCount;
}

