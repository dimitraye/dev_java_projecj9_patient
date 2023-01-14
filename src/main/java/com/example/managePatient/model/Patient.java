package com.example.managePatient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
//Annotation permettant de créer des constructeurs sans arguments
@NoArgsConstructor
//Annotation permettant de créer des constructeurs avec arguments
@AllArgsConstructor
//Indique que cette classe est une entité (une entité représente un table dans la BD)
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String given;
    private String family;
    private String dob;
    private String sex;
    private int address;
    private String phone;


}
