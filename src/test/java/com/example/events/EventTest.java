package com.example.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    /**
     * lombok의 builder 을 이용한 테스트
     */
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("name")
                .description("description")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {

        String name = "name";
        String description = "description";

        Event event = new Event();
        event.setName("name");
        event.setDescription("description");

        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }
}