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
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeC;
    private String libelleC;

    @OneToOne(cascade = CascadeType.ALL)
    private Salle salleName;


    @OneToMany (mappedBy="cours", cascade = CascadeType.ALL)
    private List<Enseignant> enseignants;

    @ManyToMany
    @JoinTable(
            name="cours_etudiant",
            joinColumns = @JoinColumn (name="etudiant_id"),
            inverseJoinColumns = @JoinColumn (name="cours_id"))
    private List<Etudiant> etudiants;
}
