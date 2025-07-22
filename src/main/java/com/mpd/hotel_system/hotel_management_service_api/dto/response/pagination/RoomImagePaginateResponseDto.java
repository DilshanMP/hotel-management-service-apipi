package com.mpd.hotel_system.hotel_management_service_api.dto.response.pagination;


import com.mpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long datCount;
}

