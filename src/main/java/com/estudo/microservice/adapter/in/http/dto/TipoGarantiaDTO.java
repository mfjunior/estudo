package com.estudo.microservice.adapter.in.http.dto;

import com.estudo.microservice.core.model.TipoGarantia;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoGarantiaDTO implements DominioDTO<TipoGarantia, TipoGarantiaDTO> {

    @JsonProperty("id_tipo_garantia")
    private short id;

    @JsonProperty("descricao_tipo_garantia")
    private String descricao;
    
    @Override
    public TipoGarantia toDominio(TipoGarantiaDTO dominioDTO) {
        return TipoGarantia.builder().id(dominioDTO.getId()).descricao(dominioDTO.getDescricao()).build();
    }

    @Override
    public TipoGarantiaDTO toDominioDTO(TipoGarantia dominio) {
        return TipoGarantiaDTO.builder().id(dominio.getId()).descricao(dominio.getDescricao()).build();
    }
}