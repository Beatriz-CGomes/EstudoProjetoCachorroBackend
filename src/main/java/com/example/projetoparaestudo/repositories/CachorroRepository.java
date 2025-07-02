package com.example.projetoparaestudo.repositories;

import com.example.projetoparaestudo.model.Cachorro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CachorroRepository extends JpaRepository<Cachorro, Long> {
}
