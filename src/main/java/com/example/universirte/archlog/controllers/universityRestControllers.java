package com.example.universirte.archlog.controllers;

import com.example.universirte.archlog.entities.Etudiant;
import com.example.universirte.archlog.entities.University;
import com.example.universirte.archlog.services.universityInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/university",method = {RequestMethod.GET})
public class universityRestControllers {
    @Autowired
    universityInterface uniService;

    @PostMapping("/CreateUniversite")
    public University createuniversite(@Validated @RequestBody University uni) {
        uniService.saveuniv(uni);
        return uni;
    }

    @GetMapping("/getAllUniversites")
    public List<University> getAlluniversites(){
        return uniService.Listuniv();
    }

    @GetMapping("/findUniversite/{id}")
    public Optional<University> findUniversite(@PathVariable String id)
    {
        return uniService.findun(Long.parseLong(id));

    }
    @PutMapping("/UpdateUniversite/{id}")
    public String UpdateUniversite(@PathVariable(value = "id") Long medid,@Validated @RequestBody University university)
    { Optional<University> Univer = uniService.findun(medid);
        if (Univer.isEmpty()){
            return "Impossible d effectuer la mise à jour";}
        else {
            university.setAdresseSite(Univer.get().getAdresseSite());
            university.setNomUNV(Univer.get().getNomUNV());

            uniService.Updateuniv(university);
            return "mise à jour faite avec succés";
        }


    }

    @DeleteMapping(value="/deleteUniversite/{id}")
    public String deleteUniversite(@PathVariable String id)
    {
        uniService.removeuniv(Long.parseLong(id));
        return "ok!";
    }
}
