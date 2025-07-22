package com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination;

import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;



}
