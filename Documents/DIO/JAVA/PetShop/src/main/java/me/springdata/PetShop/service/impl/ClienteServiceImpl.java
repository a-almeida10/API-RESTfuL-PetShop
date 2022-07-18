package me.springdata.PetShop.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.springdata.PetShop.entity.Cliente;
import me.springdata.PetShop.entity.form.ClienteForm;
import me.springdata.PetShop.entity.form.ClienteUpdateForm;
import me.springdata.PetShop.repository.ClienteRepository;
import me.springdata.PetShop.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente create(ClienteForm form) {
       Cliente cliente = new Cliente();
       cliente.setNome(form.getNome());
       cliente.setCep(form.getCep());
       cliente.setContato(form.getContato());
      
        return repository.save(cliente);
    }


    @Override
    public List<Cliente> getCLientes() {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new); 
    }



    @Override
    public void delete(Long id) {
        repository.deleteById(id);
        
    }


    @Override
    public Cliente updateCliente(Long id, ClienteUpdateForm formUpdate) {
        
        Cliente cliente = repository.findById(id).orElseThrow(IllegalArgumentException::new);
        cliente.setCep(formUpdate.getCep());
        cliente.setContato(formUpdate.getContato());
        return repository.save(cliente);

    }


  


   


  
        
    


    
}


    





