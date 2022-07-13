package com.estudo.microservice.adapter.out.database.aurora.repository;

import com.estudo.microservice.adapter.out.database.aurora.entity.DominioEntity;
import com.estudo.microservice.port.out.database.repository.DominioRepositoryPort;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

public class DominioRepositoryPortImpl<E extends DominioEntity> implements DominioRepositoryPort<E> {

    private final DominioRepository<E> dominioRepository;

    DominioRepositoryPortImpl(DominioRepository<E> dominioRepository) {
        this.dominioRepository = dominioRepository;
    }

    @Override
    @Transactional
    public E alterar(E dominioEntity) {
        return dominioRepository.saveAndFlush(dominioEntity);
    }


    @Override
    public Optional<E> obterPorId(short id) {
        return dominioRepository.findById(id);
    }

    @Override
    public Collection<? extends DominioEntity> obterTodos() {
        return dominioRepository.findAll();
    }

    @Override
    @Transactional
    public E salvar(E dominioEntity) {
        return dominioRepository.saveAndFlush(dominioEntity);
    }
}