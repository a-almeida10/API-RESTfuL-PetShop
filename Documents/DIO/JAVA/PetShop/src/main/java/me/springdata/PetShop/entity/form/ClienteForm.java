package me.springdata.PetShop.entity.form;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteForm {

    private String nome;

    private String cpf;

    private String cep;

    private String contato;
    
}
