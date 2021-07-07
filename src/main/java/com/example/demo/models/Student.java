package com.example.demo.models;

import com.example.demo.enums.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private long id;
    private String name;
    private String email;
    private Gender gender;
}
