package com.rabinawal.springmultithreading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_TBL")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String gender;
}
