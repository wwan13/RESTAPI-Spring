package com.example.inflearnrestapiwithspring.events;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;

@Component
public class EventValidator {

    public void validate(EventDto eventDto, Errors errors) {

        // 잘못된 입력
        if (eventDto.getBasePrice() > eventDto.getMaxPrice() && eventDto.getMaxPrice() > 0) {
            errors.rejectValue("basePrice", "wrongValue", "basePrice in wrong");
            errors.rejectValue("maxPrice", "wrongValue", "maxPrice in wrong");
        }

        LocalDateTime endEventDateTime = eventDto.getEndEventDateTime();

        if (endEventDateTime.isBefore(eventDto.getBeginEventDateTime()) ||
        endEventDateTime.isBefore(eventDto.getCloseEnrollmentDateTime()) ||
        endEventDateTime.isBefore(eventDto.getBeginEventDateTime())) {
            errors.rejectValue("endEventDateTime", "wrongValue", "date in wrong");
        }
    }

}
