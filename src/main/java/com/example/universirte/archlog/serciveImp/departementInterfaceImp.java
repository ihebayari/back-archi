package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service("departementInterfaceImp")
public class departementInterfaceImp implements departementInterface {
    @Autowired
    departementRepository Departementrepository;

    @Override
    public void savedepartement(Departement D) {
        Departementrepository.save(D);
    }
    @Override
    public void Updatedepartement(Departement D) {
        Departementrepository.save(D);
    }
    @Override
    public List<Departement> Listde(){
        return Departementrepository.findAll();
    }
    @Override
    public  void removeDepartement(Long Id) {
        Departementrepository.deleteById(Id);
    }
    @Override
    public Optional<Departement> findDepartement(Long Id){
        return Departementrepository.findById(Id);
    }


}
