package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service("etudiantInterfaceImp")
public class etudiantInterfaceImp implements etudiantInterface {
    @Autowired
    etudiantRepository etudiantrepsoitory;
    @Override
    public void saveEtudiant(Etudiant etu) {
        etudiantrepsoitory.save(etu);
    }
    @Override
    public void UpdateEtudiant(Etudiant Etu) {
        etudiantrepsoitory.save(Etu);

    }
    @Override
    public List<Etudiant> ListEtudiant(){
        return etudiantrepsoitory.findAll();
    }
    @Override
    public void removeEtudiant(Long id) {
        etudiantrepsoitory.deleteById(id);
    }
    @Override
    public Optional<Etudiant>findEtudiant(Long id) {
        return etudiantrepsoitory.findById(id);
    }


}
