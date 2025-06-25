package com.example.projetoparaestudo.model.enums;

public enum Sexo {

    FEMEA(0, "FEMEA"),
    MACHO(1, "MACHO");
    private Integer codigo;
    private String descricao;

    Sexo(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Sexo toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        } else {
            for (Sexo sexo : Sexo.values()) {
                if (codigo.equals(sexo.getCodigo())) {
                    return sexo;
                }
            }
            throw new IllegalStateException("Sexo Inválido ");
        }
    }
}
