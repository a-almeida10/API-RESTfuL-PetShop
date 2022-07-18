package me.springdata.PetShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.springdata.PetShop.entity.Pets;
import me.springdata.PetShop.entity.form.PetsForm;
import me.springdata.PetShop.service.impl.PetsServiceImpl;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @Autowired
    private PetsServiceImpl service;

    @GetMapping
    public List<Pets> getPets(){
        return service.getPets();
    }

    @GetMapping("/{id}")
    public Pets getPetById(@PathVariable (value = "id")Long id){
        return service.getPetById(id);
    }

    @PostMapping
    public Pets newPet(@RequestBody PetsForm newPetForm){
        return service.newPet(newPetForm);
    }

//     // @PutMapping

   
    // @DeleteMapping("/delete/pets/{id}")
    // public void deletePet(@PathVariable(value="id") Long id){
    //      service.deletePet(id);
        
    // }



}
