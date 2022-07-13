package com.estudo.microservice.adapter.in.http.dto;

import com.estudo.microservice.core.model.TipoAgrupamento;
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
public class TipoAgrupamentoDTO implements DominioDTO<TipoAgrupamento, TipoAgrupamentoDTO> {

    @JsonProperty("id_tipo_agrupamento")
    private short id;

    @JsonProperty("descricao_tipo_agrupamento")
    private String descricao;

    @Override
    public TipoAgrupamento toDominio(TipoAgrupamentoDTO dominioDTO) {
        return TipoAgrupamento.builder().id(dominioDTO.getId()).descricao(dominioDTO.getDescricao()).build();
    }

    @Override
    public TipoAgrupamentoDTO toDominioDTO(TipoAgrupamento dominio) {
        return TipoAgrupamentoDTO.builder().id(dominio.getId()).descricao(dominio.getDescricao()).build();
    }
}