package me.springdata.PetShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import me.springdata.PetShop.entity.Cliente;
import me.springdata.PetShop.entity.form.ClienteForm;
import me.springdata.PetShop.entity.form.ClienteUpdateForm;
import me.springdata.PetShop.service.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl service;

    @GetMapping
    public List<Cliente> getClientes(){
        return service.getCLientes();
    }


    @PostMapping
    public Cliente create(@RequestBody ClienteForm form){
        return service.create(form);
    }


    @GetMapping("/{id}")
    public Cliente getById(@PathVariable(value = "id") Long id){
         return service.getById(id);
    
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        
    }
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable(value = "id") @RequestBody  Long id, ClienteUpdateForm formUpdate){
        return service.updateCliente(id, formUpdate);
    }


    
}
