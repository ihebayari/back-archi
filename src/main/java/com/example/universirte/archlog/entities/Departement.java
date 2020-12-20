package com.example.universirte.archlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor

public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeDEP;



    @Column(name="nomDEP")
    private String nomDEP;

    @ManyToOne
    @JoinColumn (name="codeUNV", referencedColumnName="codeUNV")
	@JsonIgnoreProperties("departements")
    private University university;

    @OneToMany (mappedBy="departementEns")
	@JsonIgnoreProperties("departementEns")

    private List<Enseignant> enseignants;



}
