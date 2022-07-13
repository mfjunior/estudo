package com.estudo.microservice.core.service.impl;

import com.estudo.microservice.adapter.out.database.aurora.entity.DominioEntity;
import com.estudo.microservice.core.model.Dominio;
import com.estudo.microservice.port.in.usecase.AlterarDominioUseCase;
import com.estudo.microservice.port.in.usecase.ConsultarDominioUseCase;
import com.estudo.microservice.port.in.usecase.SalvarDominioUseCase;
import com.estudo.microservice.port.out.database.repository.DominioRepositoryPort;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class DominioServiceAbstract<T extends Dominio, E extends DominioEntity> implements AlterarDominioUseCase<T>,
        ConsultarDominioUseCase<T>, SalvarDominioUseCase<T> {

    private final DominioRepositoryPort<E> dominioRepositoryPort;

    private final DominioEntity<T, E> dominioEntity;

    public DominioServiceAbstract(DominioRepositoryPort<E> dominioRepositoryPort,
                                  DominioEntity<T, E> dominioEntity) {
        this.dominioRepositoryPort = dominioRepositoryPort;
        this.dominioEntity = dominioEntity;
    }


    @Override
    public T alterar(T dominio) {
        return dominioEntity.toDominio(dominioRepositoryPort.alterar(dominioEntity.toDominioEntity(dominio)));
    }

    @Override
    public T obterPorId(short id) {
        Optional<E> e = dominioRepositoryPort.obterPorId(id);

        if (e.isEmpty())
            return dominioEntity.toDominio(e.get());

        return null;
    }

    @Override
    public Collection<? extends Dominio> obterTodos() {
        return dominioRepositoryPort.obterTodos().stream().map(i -> i.toDominio(i)).collect(Collectors.toList());
    }

    @Override
    public T salvar(T dominio) {
        return dominioEntity.toDominio(dominioRepositoryPort.salvar(dominioEntity.toDominioEntity(dominio)));
    }
}