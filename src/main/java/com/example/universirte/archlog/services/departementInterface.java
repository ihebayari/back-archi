package com.example.universirte.archlog.services;

import com.example.universirte.archlog.entities.*;
import java.util.List;
import java.util.Optional;

public interface departementInterface {
    void savedepartement(Departement D);
    void Updatedepartement(Departement D);
    List<Departement> Listde();
    void removeDepartement(Long Id);
    public Optional<Departement> findDepartement(Long Id);

}
