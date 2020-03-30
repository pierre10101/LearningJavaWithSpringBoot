package com.weather.demo.modal;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Person
 */
public class Person {
    private final UUID id;
    @NotBlank
    private final String name;

    public Person(
        @JsonProperty("id") UUID id,
        @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}