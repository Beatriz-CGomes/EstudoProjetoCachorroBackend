package com.example.projetoparaestudo.model;

import com.example.projetoparaestudo.model.enums.Sexo;
import com.example.projetoparaestudo.model.enums.StatusAnimal;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Cachorro extends Animal implements Serializable {

    private String raca;
    private Boolean vacinado;

    public Cachorro(String raca, Boolean vacinado){
        this.raca = raca;
        this.vacinado = vacinado;
    }

    public Cachorro(Long id, String foto, String nome, Integer idade, Double peso, Sexo sexo, StatusAnimal statusAnimal, String raca, Boolean vacinado) {
        super(id, foto, nome, idade, peso, sexo, statusAnimal);
        this.raca = raca;
        this.vacinado = vacinado;
    }
}
