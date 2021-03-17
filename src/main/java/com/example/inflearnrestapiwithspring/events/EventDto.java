package com.example.inflearnrestapiwithspring.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 입력되서어선 안될 필드들을 (ex. id, free ...)
 * 제외한 새로운 클래스
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location;    // (optional) 없을 경우 온라인 모임
    private int basePrice;  // (optional)
    private int maxPrice;   // (optional)
    private int limitOfEnrollment;

}
