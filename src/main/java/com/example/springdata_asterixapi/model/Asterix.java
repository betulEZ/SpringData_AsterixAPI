package com.example.springdata_asterixapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asterix {

    private String id;
    private String name;
    private int age;
    private String profession;
    private String password;
}
