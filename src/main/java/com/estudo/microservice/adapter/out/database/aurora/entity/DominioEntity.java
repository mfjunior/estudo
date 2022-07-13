package com.estudo.microservice.adapter.out.database.aurora.entity;

import com.estudo.microservice.core.model.Dominio;

public interface DominioEntity<T extends Dominio, E extends DominioEntity> {

    T toDominio(E dominioEntity);

    E toDominioEntity(T dominio);

    short getId();

    String getDescricao();
}