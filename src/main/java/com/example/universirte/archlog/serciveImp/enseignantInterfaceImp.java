package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("enseignantInterfaceImp")
public class enseignantInterfaceImp implements enseignantInterface {
    @Autowired
    enseignantRepository Enseignantrep;
    @Override
    public void saveens(Enseignant D){
        Enseignantrep.save(D);
    }
    @Override
    public void Updateens(Enseignant D) {
        Enseignantrep.save(D);
    }
    @Override
    public List<Enseignant> Listde(){
        return Enseignantrep.findAll();
    }
    @Override
    public void removeEns(Long Id) {
        Enseignantrep.findById(Id);
    }
    @Override
    public Optional<Enseignant> findens(Long Id){
        return Enseignantrep.findById(Id);
    }

}
