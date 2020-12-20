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
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricule;
    private String nomENS;
    private String prenomENS;
    private String adressENS;
    private String diplome;

    @ManyToOne
    private Departement departementEns;

    @ManyToOne
    private Cours cours;

    @ManyToMany
    @JoinTable(
            name="etudiant_enseignant",
            joinColumns = @JoinColumn (name="etudiant_id"),
            inverseJoinColumns = @JoinColumn (name="enseignant_id"))
    private List<Etudiant> ListEtudiant;
}
