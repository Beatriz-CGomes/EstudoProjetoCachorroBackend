package com.example.projetoparaestudo.repositories;

import com.example.projetoparaestudo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
