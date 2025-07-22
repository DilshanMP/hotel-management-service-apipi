package com.mpd.hotel_system.hotel_management_service_api.dto.request;

import com.mpd.hotel_system.hotel_management_service_api.utill.enums.RoomType;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomDto {
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private RoomType roomType;
    private String branchId;

}
