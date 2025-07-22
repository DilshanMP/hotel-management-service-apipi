package com.mpd.hotel_system.hotel_management_service_api.dto.response;

import com.mpd.hotel_system.hotel_management_service_api.repository.FacilitiesRepo;
import com.mpd.hotel_system.hotel_management_service_api.utill.enums.RoomType;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomDto {
    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private RoomType roomType;
    private String branchId;
    private List<ResponseFacilityDto> facilities;
    private List<ResponseRoomDto> images;
}
