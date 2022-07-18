package me.springdata.PetShop.service;

import java.util.List;

import me.springdata.PetShop.entity.Pets;
import me.springdata.PetShop.entity.form.PetsForm;


public interface IPets {
    
    public List<Pets> getPets();
    
    public Pets newPet(PetsForm newPetForm);

    public Pets getPetById(Long id);

//    public void  deletePet(Long id);
}
