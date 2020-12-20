package com.example.universirte.archlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeUNV;

    @Column(name="nomUNV")
    private String nomUNV;

    @Column (name="adresseSite")
    private String adresseSite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="university")
    private List<Departement> departements;

}
