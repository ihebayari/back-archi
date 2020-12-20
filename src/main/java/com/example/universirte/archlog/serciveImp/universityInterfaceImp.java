package com.example.universirte.archlog.serciveImp;

import com.example.universirte.archlog.entities.*;
import com.example.universirte.archlog.repositories.*;
import com.example.universirte.archlog.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("universityInterfaceImp")
public class universityInterfaceImp implements universityInterface {
    @Autowired
    universityRepository UniversiteRepository;
    @Override
    public void saveuniv(University u) {
        UniversiteRepository.save(u);
    }
    @Override
    public void Updateuniv(University u) {
        UniversiteRepository.save(u);
    }
    @Override
    public List<University> Listuniv(){

        return UniversiteRepository.findAll();
    }
    @Override
    public void removeuniv(Long Id) {
        UniversiteRepository.deleteById(Id);
    }
    @Override
    public Optional<University> findun(Long Id){
        return UniversiteRepository.findById(Id);
    }

}
