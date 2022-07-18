package me.springdata.PetShop.entity.form;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetsForm {

    private Long clienteId;
   
    private String nomePet;

    private String especiePet;

    private String racaPet;

    private String sexoPet;
}
