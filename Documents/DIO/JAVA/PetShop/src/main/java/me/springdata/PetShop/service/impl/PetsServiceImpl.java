package me.springdata.PetShop.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.springdata.PetShop.entity.Cliente;
import me.springdata.PetShop.entity.Pets;
import me.springdata.PetShop.entity.form.PetsForm;
import me.springdata.PetShop.repository.ClienteRepository;
import me.springdata.PetShop.repository.PetsRepository;
import me.springdata.PetShop.service.IPets;

@Service
public class PetsServiceImpl implements IPets {
    
    @Autowired
    private PetsRepository petRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Pets> getPets() {
        
        return petRepository.findAll();

    }

    @Override
    public Pets newPet(PetsForm newPetForm) {
        Pets newpet = new Pets();
        Cliente cliente = clienteRepository.findById(newPetForm.getClienteId()).orElseThrow(IllegalArgumentException::new);

        newpet.setCliente(cliente);
        newpet.setNomePet(newPetForm.getNomePet());
        newpet.setEspeciePet(newPetForm.getEspeciePet());
        newpet.setRacaPet(newPetForm.getRacaPet());
        newpet.setSexoPet(newPetForm.getSexoPet());
        
        return petRepository.save(newpet);
    }
    
    
    @Override
    public Pets getPetById(Long id) {
        return petRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

//     @Override
//     public void deletePet(Long id) {
        
//         petRepository.findById(id);
//         petRepository.deleteById(id);
         
             
// }


}
