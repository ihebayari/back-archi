package com.example.universirte.archlog.services;

import com.example.universirte.archlog.entities.*;

import java.util.List;
import java.util.Optional;
public interface enseignantInterface {

    void saveens(Enseignant D);
    void Updateens(Enseignant D);
    List<Enseignant>Listde();
    void removeEns(Long Id);
    Optional<Enseignant> findens(Long Id);

}
