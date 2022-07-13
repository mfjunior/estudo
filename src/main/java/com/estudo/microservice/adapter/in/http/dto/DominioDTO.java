package com.estudo.microservice.adapter.in.http.dto;

import com.estudo.microservice.core.model.Dominio;

public interface DominioDTO<T extends Dominio, D extends DominioDTO> {

    T toDominio(D dominioDTO);

    D toDominioDTO(T dominio);

    short getId();

    String getDescricao();
}