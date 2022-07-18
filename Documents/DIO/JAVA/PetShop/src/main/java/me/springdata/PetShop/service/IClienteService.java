package me.springdata.PetShop.service;
import java.util.List;

import me.springdata.PetShop.entity.Cliente;
import me.springdata.PetShop.entity.form.ClienteForm;
import me.springdata.PetShop.entity.form.ClienteUpdateForm;

public interface IClienteService {


    Cliente create(ClienteForm form);//cria um novo cliente-método post

    public List<Cliente> getCLientes();//Retorna uma lista com todos os clientes

    public Cliente getById(Long id);//Retorna um cliente a partir do id
  
    public void delete(Long id);//Deleta um cliente a paritr do id

    public Cliente updateCliente(Long id, ClienteUpdateForm formUpdate);

   

}