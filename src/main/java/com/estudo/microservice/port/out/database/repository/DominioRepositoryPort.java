package com.estudo.microservice.port.out.database.repository;

import com.estudo.microservice.adapter.out.database.aurora.entity.DominioEntity;

import java.util.Collection;
import java.util.Optional;

public interface DominioRepositoryPort<E extends DominioEntity> {

    E alterar(E dominioEntity);

    Optional<E> obterPorId(short id);

    Collection<? extends DominioEntity> obterTodos();

    E salvar(E dominioEntity);
}