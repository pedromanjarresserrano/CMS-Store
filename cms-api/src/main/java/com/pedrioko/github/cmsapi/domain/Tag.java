package com.pedrioko.github.cmsapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public @Data
class Tag {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

}