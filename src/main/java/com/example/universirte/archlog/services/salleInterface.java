package com.example.universirte.archlog.services;

import com.example.universirte.archlog.entities.*;

import java.util.List;
import java.util.Optional;
public interface salleInterface {
    void savesalle(Salle s);
    void Updatesalle(Salle s);
    List<Salle> Listsalle();
    void removesalle(Long Id);
    Optional<Salle> findsalle(long Id);
}
