package com.example.universirte.archlog.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private String nomETU;
    private String prenomETU;
    private String adresseETU;
    private Date dateentree;



    @ManyToMany(mappedBy = "etudiants")
    private List<Cours> listCours;

    @ManyToMany (mappedBy = "ListEtudiant")
    private List<Enseignant> listEnseignant;
}
