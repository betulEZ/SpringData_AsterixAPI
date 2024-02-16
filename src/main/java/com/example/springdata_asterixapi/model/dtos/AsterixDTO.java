package com.example.springdata_asterixapi.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsterixDTO {
    private String id;
    private String name;
    private int age;
    private String profession;
}
