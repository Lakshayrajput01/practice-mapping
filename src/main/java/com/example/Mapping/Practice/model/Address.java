package com.example.Mapping.Practice.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    private String landmark;
    private Integer zipcode;
    private String district;
    private String state;
    private String country;
}
