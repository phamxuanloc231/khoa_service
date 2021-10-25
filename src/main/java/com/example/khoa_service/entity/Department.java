package com.example.khoa_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
    @javax.persistence.Id
    @GeneratedValue
    private Long Id;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
