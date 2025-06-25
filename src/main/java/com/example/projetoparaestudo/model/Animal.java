package com.example.projetoparaestudo.model;

import com.example.projetoparaestudo.model.enums.Sexo;
import com.example.projetoparaestudo.model.enums.StatusAnimal;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    protected Long id;

    protected String foto;
    protected String nome;
    protected Integer idade;
    protected Double peso;

    @Enumerated(EnumType.STRING)
    protected Sexo sexo;

    @Enumerated(EnumType.STRING)
    protected StatusAnimal statusAnimal;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataEntrada = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataAdocao;

    public Animal(){}

    public Animal(Long id, String foto, String nome, Integer idade, Double peso, Sexo sexo, StatusAnimal statusAnimal) {
        this.id = id;
        this.foto = foto;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.statusAnimal = statusAnimal;
    }
}
