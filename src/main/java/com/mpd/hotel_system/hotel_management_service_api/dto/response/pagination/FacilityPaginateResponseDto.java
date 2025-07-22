package com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination;


import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private long datCount;
}

