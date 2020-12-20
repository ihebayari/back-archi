package com.example.universirte.archlog.controllers;

import com.example.universirte.archlog.entities.Departement;
import com.example.universirte.archlog.entities.Enseignant;
import com.example.universirte.archlog.services.departementInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Department",method = {RequestMethod.GET})
public class departementRestControllers {
    @Autowired
    departementInterface departementService;

    @PostMapping("/CreateSalle")
    public Departement createsalle( @RequestBody Departement dept) {
        departementService.savedepartement(dept);
        return dept;
    }

    @GetMapping("/getAllDepartements")
    public List<Departement> getAlldepartements(){
        return departementService.Listde();
    }

    @GetMapping("/findDepartement/{id}")
    public Optional<Departement> findDepartement(@PathVariable String id)
    {
        return departementService.findDepartement(Long.parseLong(id));

    }
    @PutMapping("/UpdateDepartement/{id}")
    public String UpdateDepartement(@PathVariable(value="id") Long medid, @Validated @RequestBody Departement departement)
    {

        Optional<Departement> dept = departementService.findDepartement(medid);
        if (dept.isEmpty()){
            return "Impossible d effectuer la mise à jour";}
        else {

            departement.setNomDEP(dept.get().getNomDEP());

            departementService.Updatedepartement(departement);

            return "success:Update a ete bien faite";
        }
    }

    @DeleteMapping(value="/deleteDepartement/{id}")
    public String deleteDepartement(@PathVariable String id)
    {
        departementService.removeDepartement(Long.parseLong(id));
        return "ok!";
    }
}
