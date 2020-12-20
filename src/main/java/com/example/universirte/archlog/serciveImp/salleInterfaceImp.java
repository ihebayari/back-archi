package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("salleInterfaceImp")
public class salleInterfaceImp implements salleInterface {
    @Autowired
    salleRepository Sallereposiotry;
    @Override
    public void savesalle(Salle s) {
        Sallereposiotry.save(s);
    }
    @Override
    public void Updatesalle(Salle s){
        Sallereposiotry.save(s);
    }
    @Override
    public List<Salle> Listsalle(){
        return Sallereposiotry.findAll();
    }
    @Override
    public void removesalle(Long Id) {
        Sallereposiotry.deleteById(Id);
    }
    @Override
    public Optional<Salle> findsalle (long Id){
        return  Sallereposiotry.findById(Id);
    }
}
