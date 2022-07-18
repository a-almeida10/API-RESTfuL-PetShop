package me.springdata.PetShop.entity;
import javax.persistence.*;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pets")
  
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "nome_pet")
    private String nomePet;

    @Column(name = "especie_pet")
    private String especiePet;

    @Column(name = "raca_pet")
    private String racaPet;

    @Column(name = "sexo_pet")
    private String sexoPet;

    @Column(name = "banho_pet")
    private boolean banho;

    @Column(name = "tosa_pet")
    private boolean tosa;

    
}

