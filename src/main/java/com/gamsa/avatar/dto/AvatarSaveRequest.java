package com.gamsa.avatar.dto;

import com.gamsa.avatar.constant.AgeRange;
import com.gamsa.avatar.constant.Experienced;
import com.gamsa.avatar.domain.Avatar;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@RequiredArgsConstructor
public class AvatarSaveRequest {
    @NotNull(message = "닉네임은 비어있으면 안됩니다.")
    @Max(value=10, message = "닉네임은 최대 10자입니다.")
    private final String nickname;
    @NotNull(message = "연령대를 선택해야 합니다.")
    private final AgeRange ageRange;
    @NotNull(message = "봉사 활동 경험을 선택해야 합니다.")
    private final Experienced experienced;

    public Avatar toModel() {
        return Avatar.builder()
                .nickname(nickname)
                .avatarExp(0L)
                .avatarLevel(0L)
                .ageRange(ageRange)
                .experienced(experienced)
                .build();
    }
}
