package com.estudo.microservice.core.model;

import com.estudo.microservice.core.enums.TipoGarantiaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoGarantia implements Dominio {

    private static EnumMap<TipoGarantiaEnum, String> valoresDefault;

    static {
        valoresDefault = new EnumMap(Arrays.stream(TipoGarantiaEnum.values()).collect(Collectors.toMap(i -> i, i -> i.getDescricao())));
    }

    private short id;

    private String descricao;

    @Override
    public short getId() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
