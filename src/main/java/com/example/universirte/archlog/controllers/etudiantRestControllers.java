package com.example.universirte.archlog.controllers;

import com.example.universirte.archlog.entities.Etudiant;
import com.example.universirte.archlog.services.etudiantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value="/Etudiants",method= {RequestMethod.GET})
public class etudiantRestControllers {
    @Autowired
    etudiantInterface etudiantInterface;
    @PostMapping("/createEtudiant")
    public Etudiant createEtudiant(@Validated @RequestBody Etudiant etudiant){
        etudiantInterface.saveEtudiant(etudiant);
        return etudiant;
    }
    @GetMapping("/all")
    public List<Etudiant> getAllEtudiant(){
        return etudiantInterface.ListEtudiant();
    }
    @GetMapping("/findEtudiant/{id}")
    public Optional<Etudiant> findEtudiant(@PathVariable String id)
    {
        return etudiantInterface.findEtudiant(Long.parseLong(id));

    }
    @PutMapping("/UpdateEtudiant/{id}")
    public String UpdateEtudiant(@PathVariable(value = "id") Long medid, @Validated @RequestBody Etudiant newEtudiant)
    {
        Optional<Etudiant> etu = etudiantInterface.findEtudiant(medid);
        if (etu.isEmpty()){
            return "Impossible d effectuer la mise à jour";}
        else {
            newEtudiant.setNumInscription(etu.get().getNumInscription());
            newEtudiant.setNomETU(etu.get().getNomETU());
            newEtudiant.setPrenomETU(etu.get().getPrenomETU());
            newEtudiant.setDateentree(etu.get().getDateentree());
            newEtudiant.setAdresseETU(etu.get().getAdresseETU());
            etudiantInterface.UpdateEtudiant(newEtudiant);
            return "mise à jour faite avec succés";
        }

    }
    @DeleteMapping(value="/deleteEtudiant/{id}")
    public String deleteEtudiant(@PathVariable String id)
    {
        etudiantInterface.removeEtudiant(Long.parseLong(id));
        return "ok!";
    }

}
