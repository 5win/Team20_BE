package com.gamsa.activity.dto;

import com.gamsa.activity.domain.District;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class DistrictFindAllResponse {

    private final int sidoCode;
    private final int sidoGunguCode;
    private final String sidoName;
    private final String gunguName;
    private final boolean sido;

    public static DistrictFindAllResponse from(District district) {
        return DistrictFindAllResponse.builder()
            .sidoCode(district.getSidoCode())
            .sidoGunguCode(district.getSidoGunguCode())
            .sidoName(district.getSidoName())
            .gunguName(district.getGunguName())
            .sido(district.isSido())
            .build();
    }
}
