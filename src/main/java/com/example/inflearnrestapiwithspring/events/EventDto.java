package com.example.inflearnrestapiwithspring.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 입력되서어선 안될 필드들을 (ex. id, free ...)
 * 제외한 새로운 클래스
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @NotNull
    private LocalDateTime beginEnrollmentDateTime;
    @NotNull
    private LocalDateTime closeEnrollmentDateTime;
    @NotNull
    private LocalDateTime beginEventDateTime;
    @NotNull
    private LocalDateTime endEventDateTime;
    private String location;    // (optional) 없을 경우 온라인 모임
    @Min(0)
    private int basePrice;  // (optional)
    @Min(0)
    private int maxPrice;   // (optional)
    @Min(0)
    private int limitOfEnrollment;

}
