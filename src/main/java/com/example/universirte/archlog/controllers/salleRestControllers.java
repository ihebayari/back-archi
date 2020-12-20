package com.example.universirte.archlog.controllers;

import com.example.universirte.archlog.entities.Etudiant;
import com.example.universirte.archlog.entities.Salle;
import com.example.universirte.archlog.services.salleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/salles",method = {RequestMethod.GET})
public class salleRestControllers {
    @Autowired
    salleInterface salleService;

    @PostMapping("/CreateSalle")
    public Salle createsalle(@Validated @RequestBody Salle salle) {
        salleService.savesalle(salle);
        return salle;
    }

    @GetMapping("/getAllSalles")
    public List<Salle> getAllsalles(){
        return salleService.Listsalle();
    }

    @GetMapping("/findSalle/{id}")
    public Optional<Salle> findSalle(@PathVariable String id)
    {
        return salleService.findsalle(Long.parseLong(id));

    }
    @PutMapping("/UpdateSalle/{id}")
    public String UpdateSalle(@PathVariable(value="id") Long medid,@Validated @RequestBody Salle salle)
    {    Optional<Salle> sal = salleService.findsalle(medid);
        if (sal.isEmpty()){
            return "Impossible d effectuer la mise à jour";}
        else {

            salle.setNoms(sal.get().getNoms());
            salle.setCapacite(sal.get().getCapacite());
            salleService.Updatesalle(salle);
            return "mise à jour faite avec succés";
        }
    }

    @DeleteMapping(value="/deleteSalle/{id}")
    public String deleteSalle(@PathVariable String id)
    {
        salleService.removesalle(Long.parseLong(id));
        return "ok!";
    }

}
