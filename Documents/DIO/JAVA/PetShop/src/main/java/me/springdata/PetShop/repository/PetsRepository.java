package me.springdata.PetShop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.springdata.PetShop.entity.Pets;


@Repository
public interface PetsRepository extends JpaRepository<Pets, Long>{
    
}
