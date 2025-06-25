package com.example.projetoparaestudo.model.enums;

public enum StatusAnimal {

    DISPONIVEL(0, "DISPONÍVEL"),
    PROCESSO(1, "PROCESSO_ADOÇÃO"),
    ADOTADO(2, "ADOTADO");


    private Integer codigo;
    private String descricao;

    StatusAnimal(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusAnimal toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        } else {
            for (StatusAnimal statusAnimal : StatusAnimal.values()) {
                if (codigo.equals(statusAnimal.getCodigo())) {
                    return statusAnimal;
                }
            }
            throw new IllegalStateException("Status Inválido");
        }
    }

}
