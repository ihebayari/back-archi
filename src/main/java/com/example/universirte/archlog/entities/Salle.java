package com.example.universirte.archlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numS;
    private String noms;
    private int capacite;

    @OneToOne(mappedBy = "salleName")
    private Cours cours_salle;
}
