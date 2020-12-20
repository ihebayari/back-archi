package com.example.universirte.archlog.services;

import com.example.universirte.archlog.entities.*;

import java.util.List;
import java.util.Optional;

public interface coursInterface {
    void saveCours(Cours C);
    void UpdateCours(Cours C);
    List<Cours> ListCours();
    void removeCours(Long Id);
    Optional<Cours> findCours(long Id);
}
