package com.postgresql.testtask.entities;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
public class JsonObject {
    @Getter
    @Setter
    private String name = "current";
    @Getter
    @Setter
    private int value;
}