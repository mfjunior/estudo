package com.estudo.microservice.core.enums;

import lombok.Getter;

@Getter
public enum TipoAgrupamentoEnum {

    CONVENIO((short) 1, "Convênio"),

    PONTUAL((short) 2, "Pontual");

    private final short id;

    private final String descricao;

    TipoAgrupamentoEnum(short id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
