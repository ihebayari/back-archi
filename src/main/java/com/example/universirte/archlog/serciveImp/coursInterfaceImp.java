package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("coursInterfaceImp")
public class coursInterfaceImp implements coursInterface {
    @Autowired
    coursRepository Coursrepostiry;
    @Override
    public void saveCours(Cours C) {
        Coursrepostiry.save(C);
    }
    @Override
    public void UpdateCours(Cours C) {
        Coursrepostiry.save(C);
    }
    @Override
    public List<Cours> ListCours(){
        return Coursrepostiry.findAll();

    }
    @Override
    public void removeCours(Long Id) {
        Coursrepostiry.deleteById(Id);
    }
    @Override
    public Optional<Cours> findCours(long Id){
        return Coursrepostiry.findById(Id);
    }


}
