package com.brands.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Length(min=5, max=25)
    @NotNull
    private String name;
    @Length(min=5, max=255)
    @Null
    private String description;

    public Brand (){}
    public Brand(Long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {return id;}
    public String getName() {return name;}
    public String getDescription(){return description;}
}
