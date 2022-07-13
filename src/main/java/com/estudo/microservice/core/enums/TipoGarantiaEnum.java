package com.estudo.microservice.core.enums;

import lombok.Getter;

@Getter
public enum TipoGarantiaEnum {

    ALIENACAO_FIDUCIARIA((short) 1, "Alienacao Fiduciária"),

    HIPOTECA((short) 2, "Hipoteca");

    private final short id;

    private final String descricao;

    TipoGarantiaEnum(short id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
