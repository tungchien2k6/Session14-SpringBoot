package com.ra.session14.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private Long id;
    private String fullName;
    private Double salary;
}
