package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

public class Person {

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name")  String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    private final UUID id;

    @NotBlank
    @Size(min=2, max=30)
    private final String name;

}
